
import * as AppConst from '../../constant/app.const';

@Component({
  selector: 'gallery',
  templateUrl: 'gallery.component.html',
  styleUrls: ['gallery.component.css']
})
export class GalleryComponent {

  imagesGallery = []

  constructor(private followUserService: FollowUsersService) {
    this.followUserService.followUsers(AppConst.CLICK_GALLERY)
  }

  ngOnInit()
  
  showAllImgGallery() 
}
