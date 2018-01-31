
import * as AppConst from '../../constant/app.const';

@Component({
  selector: 'rooms-tariff',
  templateUrl: 'rooms-tariff.component.html',
  styleUrls: ['rooms-tariff.component.css']
})
export class RoomsTariffComponent implements OnInit {

  numpage: number
  pages = []
  rooms_page = []
  pageclicked = 1
  searchselected = 'all'
  searchboxvalue = ''
  listrooms = []

  public constructor(
    private router: Router,
    private roomservice: RoomService,
    private data: InMemoryDataService,
    private followUserService: FollowUsersService
  ) {
    this.followUserService.followUsers(AppConst.CLICK_ROOMS);
  }

  public ngOnInit(): void 
  
  private showAllRooms() 


  private addImgURLRooms(): void 

  private initializeNumPage(): void 

  private initializeRoomOfPage(): void 

  private clickpage(index: number): void 

  private clickpreviouspage(): void 

  private clicknextpage(): void 

  private resetpage(): void 

  private viewRoomDetails(id: string): void 

  private search(room_infor: string): void 

  private searchInput(key: string): void 

  private clickImage(room: string) 
}
