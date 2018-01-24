
import * as AppConst from '../constant/app.const';  //use constant
declare var swal: any;

@Injectable()

export class AuthenticationService {
    authenticated = false

    constructor(
        private data: InMemoryDataService,
        private userservice: UserService,
        private cookie: CookieService) { }

    public checkAuthentication() 

    public pleaselogin(): void 
}