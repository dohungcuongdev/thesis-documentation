
public interface ActivityDAO {

    public List<Activity> getAllActivity();
    public List<Activity> getAllActivityByUserName(String username);
    public List<Activity> getNewListNotification();
    public Activity getActivityBy(String id);
    public Activity seenNotification(String id);
    public Activity replyNotification(String id);
}


public interface AdminDAO {

    public Administrator getAdminByUserName(String username);
    public void updateAdmin(Administrator ad);
    public void editProfileImg(String username, String img);
    public void updatePassword(String username, String newpassword);
}


public interface CustomerDAO {

    public Customer getCustomerByUsername(String username);
    public List<Customer> getAllCustomers();
    public ActionTracking getActionTrackingByUsername(String username);  
    public List<CustomerBehavior> getDataCollection();
    public CustomerBehavior getOneDataCollection(String username);
}


public interface HotelItemDAO<T> {

	public T getHotelItemByID(int id);
	public T getHotelItemByName(String name);
	public List<T> getAllHotelItems();
	public List<T> getRelatedHotelItems(String type);
	public String findAndAddNewItem(HotelItem newItem);
	public void editImage(String name, String img, String img2);
	public void deleteItem(int id);
	public void updateItem(HotelItem item);
}


public interface RestaurantDAO {

	public HotelService getHotelServiceByID(int id);
	public HotelService getHotelServiceByName(String name);
    public List<HotelService> getAllHotelServices();   
    public List<HotelService> getRelatedHotelServices(String type);   
    public String findAndAddNewService(HotelService newService);
    public void updateService(HotelService service);
	public void editImage(String name, String img, String img2);
	public void deleteItem(int id);
}


public interface RoomDAO {

    public HotelRoom getRoomByID(int id);
    public HotelRoom getRoomByName(String name);
    public List<HotelRoom> getAllRooms();
    public long getNumRooms();
    public List<HotelRoom> getRoomByPage(int page);
    public List<HotelRoom> getRelatedHotelRooms(String type);
    public void updateRoom(HotelRoom room);
    public String findAndAddNewRoom(HotelRoom newRoom);
	public void editImage(String name, String img, String img2);
	public void deleteItem(int id);
	public void bookRoom(HotelRoom room);
}

public interface TrackingDAO {
	
    public List<FollowUsers> getListFollowUsers();
    public List<PageAccessChartData> getPageAccessChartData();
    public List<PageAccessChartData> getPageAccessChartDataByIP(String ipaddress);
    public List<PageAccessChartData> getPageAccessChartDataByUsername(String username);
    public ExternalIP getExternalIPDetails(String external_ip_address);
    public List<CountryChartData> getCountryChartData();
}

