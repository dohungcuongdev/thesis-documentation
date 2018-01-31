
import * as AppConst from '../../constant/app.const';

@Component({
  selector: 'room-details',
  templateUrl: 'hotel-services.component.html',
  styleUrls: ['hotel-services.component.css']
})
export class HotelServicesComponent {

  hotel_serviceid = null

  constructor(
    private route: ActivatedRoute,
    private restaurantservice: RestaurantService,
    private data: InMemoryDataService,
    private followUserService: FollowUsersService) {
	this.showHotelServiceItem();
  }
  
  showHotelServiceItem()
}
