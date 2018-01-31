
import * as AppConst from '../constant/app.const';  //use constant

@Injectable()
export class ActivityService extends ApiService<Activity> {

    constructor(injector: Injector, public _http: Http) 

    getAllActivity(): Observable<Activity[]> 

    getActivityByID(id: string): Observable<Activity> 

    getAllActivityByUserName(username: string): Observable<Activity[]> 

    getFeedbackRoomById(roomid: string): Observable<Activity[]> 
	
    addActivity(activity: Activity): Observable<Response> 

    removeActivity(id: string): Observable<Response> 

    editActivity(activity: Activity): Observable<Response> 
}