import { Component, OnInit } from '@angular/core';
import { CookieService } from 'angular2-cookie/core';
import { Activity } from '../../model/activity';
import { ActivityService } from '../../service/activity.service';
import { InMemoryDataService } from '../../service/in-memory-data.service';
import { FollowUsersService } from '../../service/follow-users.service';
import { AuthenticationService } from '../../service/authentication.service';
import { ValidationService } from '../../service/validation.service';
import * as AppConst from '../../constant/app.const';

@Component({
  selector: 'contact',
  templateUrl: 'feedback.component.html',
  styleUrls: ['feedback.component.css']
})
export class FeedBackComponent implements OnInit {

  private star = 3

  constructor(
    private activityservice: ActivityService,
    private auth: AuthenticationService,
    private followUserService: FollowUsersService,
    private data: InMemoryDataService,
    private cookie: CookieService,
    private validationService: ValidationService) { 
    this.followUserService.followUsers(AppConst.CLICK_FEED_BACK)
  }

  ngOnInit(): void {
    if (this.cookie.get("id") == null) {
      this.auth.pleaselogin()
    }
  }

  rating(star: number) {
    this.star = star
  }

  sendfeedback(mes: string) {
    if (mes == null || mes == '')
      mes = AppConst.NO_CONT
    let activity = new Activity(AppConst.FEEDBACKNAME, this.data.user.username, AppConst.FEEDBACKCLICK, AppConst.FEEDBACK_SENT, AppConst.RATING + this.star + AppConst.STAR, mes, AppConst.NOT_RES_YET)
    this.activityservice.addActivity(activity).subscribe(
      responsse => {
        if (responsse) {
          //this.roomservice.LoadData();
          this.followUserService.followUsers(AppConst.FEEDBACK_HOTEL)
          this.validationService.swAlertFeedbackSent()
        }
      },
      err => this.validationService.swAlertUsualErr(err)
    )
  }
}
