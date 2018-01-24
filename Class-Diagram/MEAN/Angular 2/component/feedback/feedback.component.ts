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

  ngOnInit(): 

  rating(star: number)

  sendfeedback(mes: string)
}
