
import * as AppConst from '../../constant/app.const';

@Component({
  selector: 'profile',
  templateUrl: 'profile.component.html',
  styleUrls: ['profile.component.css']
})

export class ProfileComponent implements OnInit, OnChanges {

  canEdit = false
  listactivity = []

  constructor(
    private router: Router,
    private auth: AuthenticationService,
    private activityservice: ActivityService,
    private userservice: UserService,
    private data: InMemoryDataService,
    private cookie: CookieService,
    private followUserService: FollowUsersService,
    private validationService: ValidationService) {
    this.followUserService.followUsers(AppConst.CLICK_PROFILE)
  }

  private initialize()

  LoadData()

  ngOnInit()

  ngOnChanges()

  clickdetail(s: string)

  viewcontent(content: string)

  editInfo()

  saveInfo(name: string, phone: string, address: string)
}
