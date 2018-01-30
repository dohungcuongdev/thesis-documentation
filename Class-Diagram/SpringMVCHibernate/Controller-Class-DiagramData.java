@Controller
<< "/" >>
public class AppController { 

 - UserService userService;

 - HotelItemService hotelItemService;

 - ApplicationService appService;

 <<"/login", method = GET >>
 + login(HttpServletRequest request, HttpServletResponse response, ModelMap model) 
 
 << "/check-login", method = POST >>
 + checklogin(LoginBean loginbean, HttpServletRequest request, HttpServletResponse response, ModelMap model) 
 
 << "/logout", method = GET >>
 + logout(HttpServletRequest request) 
 
 << "/index", method = GET >>
 + index(HttpServletRequest request, HttpServletResponse response, ModelMap model) 
 
 << "/search-result/{keyword}", method = GET >>
 + searchResult(String keyword, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 + profile(HttpServletRequest request, HttpServletResponse response, ModelMap model)  <<"/profile", method = GET >>

 << "/change-password", method = POST >>
 changePassword(ChangePasswordBean changePassBean, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/profile-edited", method = POST >>
 editProfile(Administrator ad, HttpServletRequest request, HttpServletResponse response, ModelMap model)

 << "/profile-img-edited", method = POST >>
 profileImgEdited(CommonsMultipartFile img, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << {"/manage-rooms", "/room", "/rooms"}, method = GET >>
 manageRooms(HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/room/{roomName}", method = GET >>
 singleRoom(String roomName, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/edit-room/{roomName}", method = GET >>
 editRoom(String roomName, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/add-room", method = GET >>
 addRoom(HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/room-added", method = POST >>
 roomAdded(HotelRoom newRoom, HttpServletRequest request, HttpServletResponse response, ModelMap model)

 << "/room-edited", method = POST >>
 roomEdited(HotelRoom roomEdit, HttpServletRequest request, HttpServletResponse response, ModelMap model)

 << "/remove-room/{id}", method = GET >>
 removeRoom(int id, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/room-img-edited/{roomName}", method = POST >>
 roomImgEdited(CommonsMultipartFile img1, CommonsMultipartFile img2, String roomName, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << {"/manage-restaurant", "/service", "/services"}, method = GET >>
 manageRestaurant(HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/service/{servicename}", method = GET >>
 singleService(String servicename, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/add-service", method = GET >>
 addService(HttpServletRequest request, HttpServletResponse response, ModelMap model)

 << "/service-added", method = POST >>
 serviceAdded(HotelService newService, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/edit-service/{servicename}", method = GET >>
 editService(String servicename, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/service-edited", method = POST >>
 serviceEdited(HotelService serviceEdit, HttpServletRequest request, HttpServletResponse response, ModelMap model) 
	
 << "/remove-service/{id}", method = GET >>
 removeService(int id, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/service-img-edited/{servicename}", method = POST >>
 serviceImgEdited(CommonsMultipartFile img1, CommonsMultipartFile img2, String servicename, HttpServletRequest request, HttpServletResponse response, ModelMap model)

 << "/manage-users", method = GET >>
 manageUsers(HttpServletRequest request, HttpServletResponse response, ModelMap model) 
	
 << "/follow-all-users", method = GET >>
 followAllUsers(HttpServletRequest request, HttpServletResponse response, ModelMap model) 
	
 << "/follow-users", method = GET >>
 followUsers(HttpServletRequest request, HttpServletResponse response, ModelMap model) 
	
 << "/follow-users/{page}", method = GET >>
 followUsersPage(int page, HttpServletRequest request, HttpServletResponse response, ModelMap model) 
	
 << "/follow-users/{fieldname}/{sort}/{page}", method = GET >>
 followUsersPageSorted(String fieldname, String sort, int page, HttpServletRequest request, HttpServletResponse response, ModelMap model) 
	
 << "/follow-users-search/{fieldname}/{keyword}/{sort}/{page}", method = GET >>
 searchFollowUsers(String fieldname, String keyword, String sort, int page, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/tracking-ip", method = GET >>
 trackingIP(HttpServletRequest request, HttpServletResponse response, ModelMap model)

 << "/tracking-exip", method = GET >>
 trackingExternalIP(HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/tracking-members", method = GET >>
 trackingMemebers(HttpServletRequest request, HttpServletResponse response, ModelMap model) 
	
 << "/tracking-page-access", method = GET >>
 pageAccessStatistics(HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/country-chart", method = GET >>
 followUserChart(HttpServletRequest request, HttpServletResponse response, ModelMap model)

 << {"/page-access-chart", "/PageAccess/**"}, method = GET >>
 pageAccessChart(HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << {"/member-chart/{username}","/Username/{username}"}, method = GET >>
 pageAccessMemberChart(String username, HttpServletRequest request, HttpServletResponse response, ModelMap model) 
	
 << {"/page-access-chart/{ipaddress}", "/UserIP/{ipaddress}"}, method = GET >>
 pageAccessIPChart(String ipaddress, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/click-tracking-ip/{trackingParam}", method = GET >>
 followUsersIP(String ip, HttpServletRequest request, HttpServletResponse response, ModelMap model) 
	
 << "/click-tracking-member/{trackingParam}", method = GET >>
 followMember(String username, HttpServletRequest request, HttpServletResponse response, ModelMap model) 
	
 << {"/ip-details/{externalip}", "/ExternalIP/{externalip}"}, method = GET >>
 ipDetails(String externalip, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/user", method = GET >>
 singleUser(HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/customer", method = GET >>
 singleCustomer(HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/user/{username}", method = GET >>
 singleUser(String username, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/customer/{username}", method = GET >>
 singleCustomer(String username, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/message", method = GET >>
 message(HttpServletRequest request, HttpServletResponse response, ModelMap model)  

 << "/notification/{id}", method = GET >>
 notification(String id, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/reply Book Room/{id}", method = GET >>
 replyBooking(String id, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/reply Cancel Room/{id}", method = GET >>
 replyCancel(String id, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/send-mail", method = POST >>
 sendMail(String id, String message, String useremail, String subject, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/fqa", method = GET >>
 fqa(HttpServletRequest request, HttpServletResponse response, ModelMap model, String redirect) 
	
 << "/upload-fqa", method = POST >>
 UploadFQA(CommonsMultipartFile fqaPDF, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

 << "/downloadCSV", method = GET >>
 + downloadCSV(HttpServletRequest request, HttpServletResponse response)

 - isAuthenticated(HttpServletRequest request): boolean 
	
 - checkAuth(HttpServletRequest request, HttpServletResponse response): void 
	
 - authInitializeRedirect(HttpServletRequest request, HttpServletResponse response, ModelMap model, String redirect): String 

 - initialize(ModelMap model): void 

 - initializeProfile(ModelMap model): String 

 - initializeSingleRoom(ModelMap model, String roomName, String redirect): String 

 - initializeSingleService(ModelMap model, String servicename, String redirect): String 
	
 - initializeTracking(String tracking, HttpServletRequest request, HttpServletResponse response, ModelMap model): String
}




@RestController
<<"/api">>
public class RESTController {
	
 - hotelItemService: HotelItemService 
	
 - userService: UserService 
	
 << "//rooms", method = GET, produces = "application/json; charset=UTF-8")
 + getListRooms(): List<HotelRoom> 
	
 << "//restaurant", method = GET, produces = "application/json; charset=UTF-8")
 + getListServiceInRestaurant(): List<HotelService> 

 << "//rooms/id/{id}", method = GET, produces = "application/json; charset=UTF-8")
 + getRoom(int id): HotelRoom 
	
 << "//rooms/{name}", method = GET, produces = "application/json; charset=UTF-8")
 + getRoomByName(String name): HotelRoom 

 << "//rooms/page/{page}", method = GET, produces = "application/json; charset=UTF-8")
 + getRoomByPage(int page): List<HotelRoom> 
	
 << "//rooms/all/quantity", method = GET, produces = "application/json; charset=UTF-8")
 + getNumRoom(): long 
	
 << "//restaurant/{id}", method = GET, produces = "application/json; charset=UTF-8")
 + getItemInRestaurant(int id): HotelService 
	
 << "//rooms/{name}", method = PUT, produces = "application/json; charset=UTF-8")
 + bookRoom(String name, @RequestBody HotelRoom room): ResponseEntity<HotelRoom> 
	
 << "//page-access-chart", method = GET, produces = "application/json; charset=UTF-8")
 + getPageAccessChart(): List<PageAccessChartData> 
	
 << "//page-access-chart/userIP/{userIP}", method = GET, produces = "application/json; charset=UTF-8")
 + getPageAccessChartByIP(String userIP): List<PageAccessChartData> 
	
 << "//page-access-chart/username/{username}", method = GET, produces = "application/json; charset=UTF-8")
 + getPageAccessChartByUsername(String username): List<PageAccessChartData> 
	
 << "//country-chart", method = GET, produces = "application/json; charset=UTF-8")
 + getCountryChartData(): List<CountryChartData> 
}
