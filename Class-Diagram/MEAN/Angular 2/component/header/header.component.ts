
@Component({
  selector: 'header',
  templateUrl: 'header.component.html',
  styleUrls: ['header.component.css']
})
export class HeaderComponent {

  constructor(private router: Router,
    private auth: AuthenticationService,
    private userservice: UserService,
    private data: InMemoryDataService,
    private cookie: CookieService) { }

  login() 

  logout() 
}
