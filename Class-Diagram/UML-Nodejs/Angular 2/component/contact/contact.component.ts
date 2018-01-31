import * as AppConst from '../../constant/app.const';

@Component({
  selector: 'contact',
  templateUrl: 'contact.component.html',
  styleUrls: ['contact.component.css']
})

export class ContactComponent {
  constructor(
    private auth: AuthenticationService,
    private activityservice: ActivityService, 
    private followUserService: FollowUsersService,
    private validationService: ValidationService) {
    this.followUserService.followUsers(AppConst.CLICK_CONTACT)
  }

  sendContact(fullname: string, email: string, phone: string, mes: string) 
}
