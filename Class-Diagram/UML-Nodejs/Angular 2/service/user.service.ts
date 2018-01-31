
import * as AppConst from '../constant/app.const';

@Injectable()
export class UserService extends ApiService<User> {
    
    constructor(injector: Injector, public _http: Http) 
	
    getUser(id: string): Observable<User> 

    editUser(user): Observable<Response> 
}