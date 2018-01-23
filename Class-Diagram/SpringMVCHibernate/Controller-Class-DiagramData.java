@Controller
@RequestMapping(value = "/")
public class AppController {

	@Autowired
	private UserService userService;

	@Autowired
	private HotelItemService hotelItemService;

	@Autowired
	private ApplicationService appService;

	// login
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(HttpServletRequest request, HttpServletResponse response, ModelMap model)

	// checklogin
	@RequestMapping(value = "check-login", method = RequestMethod.POST)
	public String checklogin(@ModelAttribute(value = "loginbean") LoginBean loginbean, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	// logout
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request)

	// index
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index(HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "search-result/{keyword}", method = RequestMethod.GET)
	public String searchResult(@PathVariable(value = "keyword") String keyword, HttpServletRequest request, HttpServletResponse response, ModelMap model)

	// profile
	@RequestMapping(value = "profile", method = RequestMethod.GET)
	public String profile(HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	// profile
	@RequestMapping(value = "change-password", method = RequestMethod.POST)
	public String changePassword(@ModelAttribute(value = "changePassBean") ChangePasswordBean changePassBean, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "profile-edited", method = RequestMethod.POST)
	public String editProfile(@ModelAttribute(value = "adminEdit") Administrator ad, HttpServletRequest request, HttpServletResponse response, ModelMap model)

	@RequestMapping(value = "profile-img-edited", method = RequestMethod.POST)
	public String profileImgEdited(@RequestParam(value = "img") CommonsMultipartFile img, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	// rooms
	@RequestMapping(value = {"manage-rooms", "room", "rooms"}, method = RequestMethod.GET)
	public String manageRooms(HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "room/{roomName}", method = RequestMethod.GET)
	public String singleRoom(@PathVariable(value = "roomName") String roomName, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "edit-room/{roomName}", method = RequestMethod.GET)
	public String editRoom(@PathVariable(value = "roomName") String roomName, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "add-room", method = RequestMethod.GET)
	public String addRoom(HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "room-added", method = RequestMethod.POST)
	public String roomAdded(@ModelAttribute(value = "newRoom") HotelRoom newRoom, HttpServletRequest request, HttpServletResponse response, ModelMap model)

	@RequestMapping(value = "room-edited", method = RequestMethod.POST)
	public String roomEdited(@ModelAttribute(value = "roomEdit") HotelRoom roomEdit, HttpServletRequest request, HttpServletResponse response, ModelMap model)

	@RequestMapping(value = "remove-room/{id}", method = RequestMethod.GET)
	public String removeRoom(@PathVariable(value = "id") int id, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "room-img-edited/{roomName}", method = RequestMethod.POST)
	public String roomImgEdited(@RequestParam(value = "img1") CommonsMultipartFile img1, @RequestParam(value = "img2") CommonsMultipartFile img2, @PathVariable(value = "roomName") String roomName, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	// restaurant
	@RequestMapping(value = {"manage-restaurant", "service", "services"}, method = RequestMethod.GET)
	public String manageRestaurant(HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "service/{servicename}", method = RequestMethod.GET)
	public String singleService(@PathVariable(value = "servicename") String servicename, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "add-service", method = RequestMethod.GET)
	public String addService(HttpServletRequest request, HttpServletResponse response, ModelMap model)

	@RequestMapping(value = "service-added", method = RequestMethod.POST)
	public String serviceAdded(@ModelAttribute(value = "newService") HotelService newService, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "edit-service/{servicename}", method = RequestMethod.GET)
	public String editService(@PathVariable(value = "servicename") String servicename, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "service-edited", method = RequestMethod.POST)
	public String serviceEdited(@ModelAttribute(value = "serviceEdit") HotelService serviceEdit, HttpServletRequest request, HttpServletResponse response, ModelMap model) 
	
	@RequestMapping(value = "remove-service/{id}", method = RequestMethod.GET)
	public String removeService(@PathVariable(value = "id") int id, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "service-img-edited/{servicename}", method = RequestMethod.POST)
	public String serviceImgEdited(@RequestParam(value = "img1") CommonsMultipartFile img1, @RequestParam(value = "img2") CommonsMultipartFile img2, @PathVariable(value = "servicename") String servicename, HttpServletRequest request, HttpServletResponse response, ModelMap model)

	// users
	@RequestMapping(value = "manage-users", method = RequestMethod.GET)
	public String manageUsers(HttpServletRequest request, HttpServletResponse response, ModelMap model) 
	
	@RequestMapping(value = "follow-all-users", method = RequestMethod.GET)
	public String followAllUsers(HttpServletRequest request, HttpServletResponse response, ModelMap model) 
	
	@RequestMapping(value = "follow-users", method = RequestMethod.GET)
	public String followUsers(HttpServletRequest request, HttpServletResponse response, ModelMap model) 
	
	@RequestMapping(value = "follow-users/{page}", method = RequestMethod.GET)
	public String followUsersPage(@PathVariable(value = "page") int page, HttpServletRequest request, HttpServletResponse response, ModelMap model) 
	
	@RequestMapping(value = "follow-users/{fieldname}/{sort}/{page}", method = RequestMethod.GET)
	public String followUsersPageSorted(@PathVariable(value = "fieldname") String fieldname, @PathVariable(value = "sort") String sort, @PathVariable(value = "page") int page, HttpServletRequest request, HttpServletResponse response, ModelMap model) 
	
	@RequestMapping(value = "follow-users-search/{fieldname}/{keyword}/{sort}/{page}", method = RequestMethod.GET)
	public String searchFollowUsers(@PathVariable(value = "fieldname") String fieldname, @PathVariable(value = "keyword") String keyword, @PathVariable(value = "sort") String sort, @PathVariable(value = "page") int page, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "tracking-ip", method = RequestMethod.GET)
	public String trackingIP(HttpServletRequest request, HttpServletResponse response, ModelMap model)

	@RequestMapping(value = "tracking-exip", method = RequestMethod.GET)
	public String trackingExternalIP(HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "tracking-members", method = RequestMethod.GET)
	public String trackingMemebers(HttpServletRequest request, HttpServletResponse response, ModelMap model) 
	
	@RequestMapping(value = "tracking-page-access", method = RequestMethod.GET)
	public String pageAccessStatistics(HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "country-chart", method = RequestMethod.GET)
	public String followUserChart(HttpServletRequest request, HttpServletResponse response, ModelMap model)

	@RequestMapping(value = {"page-access-chart", "PageAccess/**"}, method = RequestMethod.GET)
	public String pageAccessChart(HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = {"member-chart/{username}","Username/{username}"}, method = RequestMethod.GET)
	public String pageAccessMemberChart(@PathVariable(value = "username") String username, HttpServletRequest request, HttpServletResponse response, ModelMap model) 
	
	@RequestMapping(value = {"page-access-chart/{ipaddress}", "UserIP/{ipaddress}"}, method = RequestMethod.GET)
	public String pageAccessIPChart(@PathVariable(value = "ipaddress") String ipaddress, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "click-tracking-ip/{trackingParam}", method = RequestMethod.GET)
	public String followUsersIP(@PathVariable(value = "trackingParam") String ip, HttpServletRequest request, HttpServletResponse response, ModelMap model) 
	
	@RequestMapping(value = "click-tracking-member/{trackingParam}", method = RequestMethod.GET)
	public String followMember(@PathVariable(value = "trackingParam") String username, HttpServletRequest request, HttpServletResponse response, ModelMap model) 
	
	@RequestMapping(value = {"ip-details/{externalip}", "ExternalIP/{externalip}"}, method = RequestMethod.GET)
	public String ipDetails(@PathVariable(value = "externalip") String externalip, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "user", method = RequestMethod.GET)
	public String singleUser(HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "customer", method = RequestMethod.GET)
	public String singleCustomer(HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "user/{username}", method = RequestMethod.GET)
	public String singleUser(@PathVariable(value = "username") String username, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "customer/{username}", method = RequestMethod.GET)
	public String singleCustomer(@PathVariable(value = "username") String username, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	// message
	@RequestMapping(value = "message", method = RequestMethod.GET)
	public String message(HttpServletRequest request, HttpServletResponse response, ModelMap model)  

	@RequestMapping(value = "notification/{id}", method = RequestMethod.GET)
	public String notification(@PathVariable(value = "id") String id, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "reply Book Room/{id}", method = RequestMethod.GET)
	public String replyBooking(@PathVariable(value = "id") String id, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "reply Cancel Room/{id}", method = RequestMethod.GET)
	public String replyCancel(@PathVariable(value = "id") String id, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "send-mail", method = RequestMethod.POST)
	public String sendMail(@RequestParam("activity-id") String id, @RequestParam("message") String message, @RequestParam("user-email") String useremail, @RequestParam("subject") String subject, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	// fqa
	@RequestMapping(value = "fqa", method = RequestMethod.GET)
	public String fqa(HttpServletRequest request, HttpServletResponse response, ModelMap model, String redirect) 
	
	@RequestMapping(value = "upload-fqa", method = RequestMethod.POST)
	public String UploadFQA(@RequestParam(value = "fqaPDF") CommonsMultipartFile fqaPDF, HttpServletRequest request, HttpServletResponse response, ModelMap model) 

	@RequestMapping(value = "downloadCSV")
	public void downloadCSV(HttpServletRequest request, HttpServletResponse response) 

	private boolean isAuthenticated(HttpServletRequest request) 
	
	private void checkAuth(HttpServletRequest request, HttpServletResponse response)
	
	private String authInitializeRedirect(HttpServletRequest request, HttpServletResponse response, ModelMap model, String redirect)

	// initialize function
	private void initialize(ModelMap model)

	private String initializeProfile(ModelMap model)

	private String initializeSingleRoom(ModelMap model, String roomName, String redirect)

	private String initializeSingleService(ModelMap model, String servicename, String redirect)
	
	private String initializeTracking(String tracking, HttpServletRequest request, HttpServletResponse response, ModelMap model)
}




@RestController
@RequestMapping("/api")
public class RESTController {
	
	@Autowired
	private HotelItemService hotelItemService;
	
	@Autowired
	private UserService userService;
	
	@CrossOrigin
	@RequestMapping(value = "/rooms", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public List<HotelRoom> getListRooms() 
	
	@CrossOrigin
	@RequestMapping(value = "/restaurant", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public List<HotelService> getListServiceInRestaurant() 
	
	@CrossOrigin
	@RequestMapping(value = "/rooms/id/{id}", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public HotelRoom getRoom(@PathVariable(value = "id") int id) 
	
	@CrossOrigin
	@RequestMapping(value = "/rooms/{name}", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public HotelRoom getRoomByName(@PathVariable(value = "name") String name) 
	
	@CrossOrigin
	@RequestMapping(value = "/rooms/page/{page}", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public List<HotelRoom> getRoomByPage(@PathVariable(value = "page") int page) 
	
	@CrossOrigin
	@RequestMapping(value = "/rooms/all/quantity", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public long getNumRoom() 
	
	@CrossOrigin
	@RequestMapping(value = "/restaurant/{id}", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public HotelService getItemInRestaurant(@PathVariable(value = "id") int id)
	
	@CrossOrigin
	@RequestMapping(value = "/rooms/{name}", method = RequestMethod.PUT, produces = "application/json; charset=UTF-8")
	public ResponseEntity<HotelRoom> bookRoom(@PathVariable(value = "name") String name, @RequestBody HotelRoom room) 
	
	@CrossOrigin
	@RequestMapping(value = "/page-access-chart", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public List<PageAccessChartData> getPageAccessChart() 
	
	@CrossOrigin
	@RequestMapping(value = "/page-access-chart/userIP/{userIP}", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public List<PageAccessChartData> getPageAccessChartByIP(@PathVariable(value = "userIP") String userIP) 
	
	@CrossOrigin
	@RequestMapping(value = "/page-access-chart/username/{username}", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public List<PageAccessChartData> getPageAccessChartByUsername(@PathVariable(value = "username") String username)
	
	@CrossOrigin
	@RequestMapping(value = "/country-chart", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public List<CountryChartData> getCountryChartData()
}
