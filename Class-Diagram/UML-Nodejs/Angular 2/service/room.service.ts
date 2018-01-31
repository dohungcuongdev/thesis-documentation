
import * as AppConst from '../constant/app.const';

@Injectable()
export class RoomService extends ApiService<Room> {

    constructor(injector: Injector, public _http: Http) 

    getAllRooms(): Observable<Room[]> 

    getRoom(room_name: string): Observable<Room> 

    editRoom(room: Room): Observable<Response> 

    getAllRoomsFromURL(specialURL): Observable<Room[]> 
}