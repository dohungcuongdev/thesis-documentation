
public interface ActivityDAO {

 + getAllActivity(): List<Activity> 
 + getAllActivityByUserName(String username): List<Activity> 
 + getNewListNotification(): List<Activity> 
 + getActivityBy(String id): Activity 
 + seenNotification(String id): Activity 
 + replyNotification(String id): Activity 
}


public interface AdminDAO {

 + getAdminByUserName(String username): Administrator 
 + updateAdmin(Administrator ad): void 
 + editProfileImg(String username, String img): void 
 + updatePassword(String username, String newpassword): void 
}


public interface CustomerDAO {

 + getCustomerByUsername(String username): Customer 
 + getAllCustomers(): List<Customer> 
 + getActionTrackingByUsername(String username): ActionTracking 
 + getDataCollection(): List<CustomerBehavior> 
 + getOneDataCollection(String username): CustomerBehavior 
}


public interface HotelItemDAO<T> {

 + getHotelItemByID(int id): T 
 + getHotelItemByName(String name): T 
 + getAllHotelItems(): List<T> 
 + getRelatedHotelItems(String type): List<T> 
 + findAndAddNewItem(HotelItem newItem): String 
 + editImage(String name, String img, String img2): void 
 + deleteItem(int id): void 
 + updateItem(HotelItem item): void 
}


public interface RestaurantDAO {

 + getHotelServiceByID(int id): HotelService 
 + getHotelServiceByName(String name): HotelService 
 + getAllHotelServices(): List<HotelService> 
 + getRelatedHotelServices(String type): List<HotelService> 
 + findAndAddNewService(HotelService newService): String 
 + updateService(HotelService service): void 
 + editImage(String name, String img, String img2): void 
 + deleteItem(int id): void 
}


public interface RoomDAO {

 + getRoomByID(int id): HotelRoom 
 + getRoomByName(String name): HotelRoom 
 + getAllRooms(): List<HotelRoom> 
 + getNumRooms(): long 
 + getRoomByPage(int page): List<HotelRoom> 
 + getRelatedHotelRooms(String type): List<HotelRoom> 
 + updateRoom(HotelRoom room): void 
 + findAndAddNewRoom(HotelRoom newRoom): String 
 + editImage(String name, String img, String img2): void 
 + deleteItem(int id): void 
 + bookRoom(HotelRoom room): void 
}

public interface TrackingDAO {
	
 + getListFollowUsers(): List<FollowUsers> 
 + getPageAccessChartData(): List<PageAccessChartData> 
 + getPageAccessChartDataByIP(String ipaddress): List<PageAccessChartData> 
 + getPageAccessChartDataByUsername(String username): List<PageAccessChartData> 
 + getExternalIPDetails(String external_ip_address): ExternalIP 
 + getCountryChartData(): List<CountryChartData> 
}

