
import * as AppConst from '../constant/app.const';  //use constant
declare var swal: any;

@Injectable()

export class AuthenticationService {
 + authenticated = false

 + constructor(
   data: InMemoryDataService,
   userservice: UserService,
   cookie: CookieService) { }

 + public checkAuthentication() 

 + public pleaselogin(): void 
}