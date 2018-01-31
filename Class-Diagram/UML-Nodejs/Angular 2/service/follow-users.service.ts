
import * as AppConst from '../constant/app.const';  //use constant

@Injectable()
export class FollowUsersService extends ApiService<FollowUsers> {

    constructor(injector: Injector, public _http: Http, private data: InMemoryDataService, private cookie: CookieService) 

    getAll(): Observable<FollowUsers[]> 

    getByID(id: string): Observable<FollowUsers> 

    getByUserIP(userIP: string): Observable<FollowUsers[]> 

    addFollowUsers(follow_users: FollowUsers): Observable<Response> 

    remove_follow_users(id: string): Observable<Response> 

    edit_follow_users(follow_users: FollowUsers): Observable<Response> 

    followUsers(new_page_access: string) 
}