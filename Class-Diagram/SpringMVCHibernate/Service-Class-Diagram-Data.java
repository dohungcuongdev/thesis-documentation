
public interface ApplicationService {

	public String uploadImage(CommonsMultipartFile commonsMultipartFiles, HttpServletRequest request, ModelMap model, String itemType);
	public void uploadPDF(CommonsMultipartFile commonsMultipartFiles, HttpServletRequest request, ModelMap model);
	public String sendEmail(String message, String sendto, String subject);
	public String removeAccent(String originalString);
}


public interface HotelItemService {
    
    public HotelRoom getRoomByID(int id);
    public HotelRoom getRoomByName(String name);
    public List<HotelRoom> getAllRooms();
    public long getNumRooms();
    public List<HotelRoom> getRoomByPage(int page);
    public List<HotelRoom> getRelatedHotelRooms(String type);
    public void updateRoom(HotelRoom room);
    public String findAndAddNewRoom(HotelRoom newRoom);
    public void editImageRoom(String name, String img, String img2);    
    public void deleteRoom(int id);
    public void bookRoom(HotelRoom room);
    public HotelService getHotelServiceByID(int id);
    public HotelService getHotelServiceByName(String name);
    public List<HotelService> getAllHotelServices();   
    public List<HotelService> getRelatedHotelServices(String type);
    public String findAndAddNewService(HotelService newService);
    public void updateService(HotelService service);    
    public void editImageService(String name, String img, String img2);    
    public void deleteService(int id);
    public void convertRoomFromMongoToMySQL();
    public void convertRestaurantMongoToMySQL();
}


public interface UserService {    
    
    public List<FollowUsers> getListFollowUsers();   
    public List<PageAccessChartData> getPageAccessChartData();    
    public List<PageAccessChartData> getPageAccessChartDataByIP(String ipaddress);
    public List<PageAccessChartData> getPageAccessChartDataByUsername(String username);
    public ExternalIP getExternalIPDetails(String external_ip_address);
    public List<CountryChartData> getCountryChartData();
    public Customer getCustomerByUsername(String username);
    public List<Customer> getAllCustomers();   
    public List<CustomerBehavior> getDataCollection();  
    public CustomerBehavior getOneDataCollection(String username);  
    public Administrator getAdminByUserName(String username);
    public void updateAdmin(Administrator ad);
    public void updatePassword(String username,  String newpassword);
    public void editProfileImg(String username, String img);
    public List<Activity> getAllActivity();
    public List<Activity> getAllActivityByUserName(String username);
    public List<Activity> getNewListNotification();
    public Activity getActivityBy(String id);
    public Activity seenNotification(String id);
    public Activity replyNotification(String id);
}

