
import * as AppConst from '../../constant/app.const';

@Component({
  selector: 'room-details',
  templateUrl: 'room-details.component.html',
  styleUrls: ['room-details.component.css']
})
export class RoomDetailComponent implements OnInit {
  private roomid = null
  private clicked_book_now = false
  private star = 3
  private list_activity = []

  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private roomservice: RoomService,
    private userservice: UserService,
    private activityservice: ActivityService,
    private auth: AuthenticationService,
    private data: InMemoryDataService,
    private followUserService: FollowUsersService,
    private validationService: ValidationService) {
	this.showRoomDetails();
  }
  
  showRoomDetails() 

  calculateRating() 

  loadFeedbackRoomData() 

  check(value: any): number 

  ngOnInit()

  booknow() 

  bookroom(checkindate: Date, checkoutdate: Date) 

  computeBalance(checkindate: Date, checkoutdate: Date) 

  checkBooking(checkindate: Date, checkoutdate: Date) 

  postActivity(checkindate: Date, checkoutdate: Date)

  cancelRoom() 

  sendCancleRequest() 

  rating(star: number) 

  sendroomfeedback(mes: string) 
}