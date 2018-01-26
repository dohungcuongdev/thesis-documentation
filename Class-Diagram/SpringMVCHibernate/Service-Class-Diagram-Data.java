
public interface ApplicationService {

 + uploadImage(CommonsMultipartFile commonsMultipartFiles, HttpServletRequest request, ModelMap model, String itemType): String 
 + uploadPDF(CommonsMultipartFile commonsMultipartFiles, HttpServletRequest request, ModelMap model): void 
 + sendEmail(String message, String sendto, String subject): String 
 + removeAccent(String originalString): String 
}


public interface HotelItemService {
    
 + HotelRoom getRoomByID(int id);
 + HotelRoom getRoomByName(String name);
 + List<HotelRoom> getAllRooms();
 + long getNumRooms();
 + List<HotelRoom> getRoomByPage(int page);
 + List<HotelRoom> getRelatedHotelRooms(String type);
 + void updateRoom(HotelRoom room);
 + String findAndAddNewRoom(HotelRoom newRoom);
 + void editImageRoom(String name, String img, String img2);    
 + void deleteRoom(int id);
 + void bookRoom(HotelRoom room);
 + HotelService getHotelServiceByID(int id);
 + HotelService getHotelServiceByName(String name);
 + List<HotelService> getAllHotelServices();   
 + List<HotelService> getRelatedHotelServices(String type);
 + String findAndAddNewService(HotelService newService);
 + void updateService(HotelService service);    
 + void editImageService(String name, String img, String img2);    
 + void deleteService(int id);
 + void convertRoomFromMongoToMySQL();
 + void convertRestaurantMongoToMySQL();
}


public interface UserService {    
    
 + List<FollowUsers> getListFollowUsers();   
 + List<PageAccessChartData> getPageAccessChartData();    
 + List<PageAccessChartData> getPageAccessChartDataByIP(String ipaddress);
 + List<PageAccessChartData> getPageAccessChartDataByUsername(String username);
 + ExternalIP getExternalIPDetails(String external_ip_address);
 + List<CountryChartData> getCountryChartData();
 + Customer getCustomerByUsername(String username);
 + List<Customer> getAllCustomers();   
 + List<CustomerBehavior> getDataCollection();  
 + CustomerBehavior getOneDataCollection(String username);  
 + Administrator getAdminByUserName(String username);
 + void updateAdmin(Administrator ad);
 + void updatePassword(String username,  String newpassword);
 + void editProfileImg(String username, String img);
 + List<Activity> getAllActivity();
 + List<Activity> getAllActivityByUserName(String username);
 + List<Activity> getNewListNotification();
 + Activity getActivityBy(String id);
 + Activity seenNotification(String id);
 + Activity replyNotification(String id);
}

