
import * as AppConst from '../constant/app.const';

@Injectable()
export class RestaurantService extends ApiService<HotelService> {
 
 + constructor(injector: Injector, public _http: Http) 

 + getAllService(): Observable<HotelService[]> 

 + getHotelService(id: string): Observable<HotelService>
}