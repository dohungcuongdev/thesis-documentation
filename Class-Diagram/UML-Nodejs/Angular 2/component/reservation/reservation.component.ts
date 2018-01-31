
import * as AppConst from '../../constant/app.const';

@Component({
  selector: 'reservation',
  templateUrl: 'reservation.component.html'
})
export class ReservationComponent {
  constructor(
    private followUserService: FollowUsersService,
    private auth: AuthenticationService,
    private activityservice: ActivityService,
    private validationService: ValidationService) { }

  submitReservation(name: string, email: string, phone: string, numRoom: number, numAdult: number, checkin: Date, checkout: Date, mes: string)
}
