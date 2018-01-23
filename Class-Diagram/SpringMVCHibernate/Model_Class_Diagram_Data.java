
public abstract class AbstractModel {
	
	protected boolean checkNotNull(Object... objs) 
	
	protected boolean checkNaturalNumber(int num) 

	protected boolean checkNaturalNumber(String str)
	
	protected boolean checkNaturalNumber(int... numbers) 

	protected boolean checkNaturalNumber(String... strings) 
	
	protected boolean checkIsDateTimeFormat(String strDate) 
	
	protected boolean checkIsDateFormat(String... strDates) 
	
	public Date getToday() 
	
	public static Date getDateFormated(String strDate) 
	
	public Date getDateTimeFormated(String date) 

	public Date getICTDateTime(String dateTime) 

	public String getICTStrDateTime(String dateTime) 

	// lowercase first character of string
	protected String lowerFirstChar(String varname) 

	// uppercase first character of string
	protected String upperFirstChar(String varname) 
    
    @Override
    public abstract String toString();
}


@MappedSuperclass
public abstract class MySQLAbstractModel extends AbstractModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	protected int id;
	
	@Column(name = "name", unique = true, nullable = false)
	protected String name;

    public int getId() 

	public void setId(int id) 

	public String getName() 

	public void setName(String name) 
	
    public MySQLAbstractModel() {}
    
    public MySQLAbstractModel(int id, String name)

	@Override
    public abstract String toString();
}


@Entity(name = "admin")
public class Administrator extends MySQLAbstractModel {

	@Column(name = "username", unique = true, nullable = false, length = 255)
	protected String username;
	
	@Column(name = "phone", nullable = false)
	protected String phone;
	
	@Column(name = "password", nullable = false)
	protected String password;

	@Column(name = "gender", nullable = false)
	private String gender;

	@Column(name = "birthday", nullable = false)
	private String birthday;

	@Column(name = "img", nullable = false)
	private String img;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username)

	public String getPassword()

	public void setPassword(String password)
	
	public String getPhone()

	public void setPhone(String phone)

	public String getBirthday()

	public void setBirthday(String birthday)

	public String getImg()

	public void setImg(String img)

	public String getGender()

	public void setGender(String gender) 

	public boolean isEnoughInfor()

	@Override
	public String toString()
}


@MappedSuperclass
public abstract class HotelItem extends MySQLAbstractModel {

	@Column(name = "price", nullable = false)
    protected int price;
	
	@Column(name = "img", nullable = false)
    protected String img;
	
	@Column(name = "img2", nullable = false)
    protected String img2;
	
	@Column(name = "details", nullable = false)
	@Type(type="text")
    protected String details;
	
	@Column(name = "type", nullable = false)
    protected String type;
	
	@Column(name = "created_by", nullable = false)
    protected String created_by;

	@Column(name = "created_at", nullable = false)
	protected String created_at;

	public String getType() 

    public void setType(String type)

    public int getPrice()

    public void setPrice(int price)

    public String getImg() 

    public void setImg(String img)

    public String getImg2() 

    public void setImg2(String img2)

    public String getDetails()

    public void setDetails(String details)

	public String getCreated_by()

	public void setCreated_by(String created_by)

	public String getCreated_at() 

	public void setCreated_at(String created_at) 

	protected void setInfor(String name, String type, int price, String img, String img2, String details) 
	
	public void setCreated() 
	
	public HotelItem() {}
	
    public HotelItem(String name, int price, String img, String img2, String details, String type, String created_by, String created_at) 
	
    public HotelItem(int id, String name, int price, String img, String img2, String details, String type, String created_by, String created_at) 

	public abstract void initializeSomeInfor();

	public abstract String getAbleToUpdate();
    
	public abstract void setNewInfor();

	@Override
	public String toString() 
}


@Entity(name = "rooms")
public class HotelRoom extends HotelItem {
	
	@Column(name = "size", nullable = false)
	private int size;
	
	@Column(name = "numpeople", nullable = false)
	private int numpeople;
	
	@Column(name = "status", nullable = false)
	private String status;
	
	@Column(name = "booked_by", nullable = true)
	private String booked_by;
	
	@Column(name = "amenities", nullable = false)
	@Type(type="text")
	private String amenities;
	
	@Column(name = "avgAminities", nullable = false)
	private int avgAminities;
	
	@Column(name = "checkin", nullable = true)
	private String checkin;
	
	@Column(name = "checkout", nullable = true)
	private String checkout;
	
	@Column(name = "star", nullable = true)
	private int star;
	
	@Column(name = "numvote", nullable = true)
	private int numvote;

	public int getSize() 

	public void setSize(int size) 

	public int getNumpeople() 

	public void setNumpeople(int numpeople) 

	public String getStatus() 

	public void setStatus(String status)

	public String getAmenities() 

	public void setAmenities(String amenities) 

	public String getBooked_by() 

	public void setBooked_by(String booked_by) 

	public String getCheckin() 

	public void setCheckin(String checkin) 

	public String getCheckout() 

	public void setCheckout(String checkout)

	public int getStar() 

	public void setStar(int star) 

	public int getNumvote() 

	public void setNumvote(int numvote) 

	public int getAvgAminities() 

	public void setAvgAminities(int avgAminities) 

	@Override
	public void initializeSomeInfor() 

	@Override
	public void setNewInfor() 

	private boolean isInvalidType() 

	private boolean isInvalidStatus() 

	private boolean isEnoughInfor() 

	private boolean isNumberFormat() 

	public boolean isvalidDate()

	public boolean isCorrectRoomName() 

	@Override
	public String getAbleToUpdate() 

	public boolean allInforCorrect() 
	
	public boolean isReadyToBook() 
	
	public HotelRoom() {}
	
	public HotelRoom(String name, int price, String img, String img2, String details, String type, String created_by, String created_at, int size, int numpeople, String status, String amenities, String booked_by, int avgAminities, String checkin, String checkout, int star, int numvote) 

	public HotelRoom(int id, String name, int price, String img, String img2, String details, String type, String created_by, String created_at, int size, int numpeople, String status, String amenities, String booked_by, int avgAminities, String checkin, String checkout, int star, int numvote) 

	@Override
	public String toString() 
	
}



@Entity(name = "restaurant")
public class HotelService extends HotelItem {

	@Column(name = "quantity", nullable = false)
    private int quantity;
	
	@Column(name = "note", nullable = false)
    private String note;
	
	@Column(name = "serveType", nullable = false)
    private String serveType;
	
	@Column(name = "serveTime", nullable = false)
    private String serveTime;

    public int getQuantity() 

    public void setQuantity(int quantity) 

    public String getNote()

    public void setNote(String note) 

    public String getServeType() 

    public void setServeType(String serveType) 

    public String getServeTime() 
    
    @Override
	public void setNewInfor() 

    public void initializeServeTime() 

    private boolean isEnoughInfor() 

	private boolean isNumberFormat() 

    @Override
    public void initializeSomeInfor() 

    private boolean isInvalidType() 

    private boolean isInvalidServeType() 
    
    @Override
    public String getAbleToUpdate() 

	public HotelService() 

	public HotelService(int id, String name, int price, String img, String img2, String details, String type, String created_by, String created_at, int quantity, String note, String serveType, String serveTime) 

	public HotelService(String name, int price, String img, String img2, String details, String type, String created_by, String created_at, int quantity, String note, String serveType, String serveTime) 

	public HotelService(int quantity, String note, String serveType, String serveTime) 

	@Override
	public String toString() 
}



public abstract class MongoDbAbstractModel extends AbstractModel {
	
	protected String _id;
	protected String name;
	protected String created_at;
	
	public String getId() 

	public void setId(String id)

	public String getName() 

	public void setName(String name) 

	public String getCreated_at() 

	public void setCreated_at(String created_at) 

	@Override
	public abstract String toString();
}


public class Customer extends MongoDbAbstractModel {
	
	protected String username;
	protected String phone;
	protected String password;
    private String address;
    private int balance;
    private List<Activity> activity = new ArrayList<>();
    private List<String> dateVisit;
    
    public String getUsername() 

    public void setUsername(String username) 

    public String getPassword() 

    public void setPassword(String password) 

    public String getPhone() 

    public void setPhone(String phone) 

    public int getBalance() 

	public void setBalance(int balance) 

	public List<Activity> getActivity()

    public void setActivity(List<Activity> activity)

    public String getAddress() 

    public void setAddress(String address) 

    public List<String> getDateVisit() 

    public void setDateVisit(List<String> dateVisit) 

	@Override
	public String toString() 
}


public class Activity extends MongoDbAbstractModel {

    private String username;
    private String click;
    private String details;
    private String note;
    private String content;
    private String response;
    private String fullname;
    private String email;
    private String phone;

    public String getFullname() 

    public void setFullname(String fullname) 

    public String getEmail() 

    public void setEmail(String email) 

    public String getPhone() 

    public void setPhone(String phone) 

    public String getDetails() 

    public void setDetails(String details) 

    public String getNote() 

    public void setNote(String note) 

    public String getUsername() 

    public void setUsername(String username) 

    public String getClick() {

    public void setClick(String click)

    public String getContent() 

    public void setContent(String content) 

    public String getResponse() 

    public void setResponse(String response) 
    
    public void setCustomerInfor(String email, String fullname, String phone) 

    public static class CompareDateTime implements Comparator<Activity> {
        @Override
        public int compare(Activity a1, Activity a2)
    }

	@Override
	public String toString() 
}



public class LoginBean {

    private String userName;
    private String password;

    public String getUserName() 

    public void setUserName(String userName)

    public String getPassword() 

    public void setPassword(String password) 
}



public class ChangePasswordBean {
	private String currentpassword;
	private String newpassword;
	private String confirm;

	public String getCurrentpassword() 

	public void setCurrentpassword(String currentpassword) 

	public String getNewpassword()

	public void setNewpassword(String newpassword) 

	public String getConfirm() 

	public void setConfirm(String confirm) 
	
	public String getPWCheckingResult(String correctPassword) 
	
	public boolean isMatchPassword(String correctPassword) 
	
	public ChangePasswordBean() 

	public ChangePasswordBean(String currentpassword, String newpassword, String confirm) 

	@Override
	public String toString()
}



public class ActionTracking {

	private List<DataCollection> roomBooked;
	private List<DataCollection> roomCanceled;
	private List<Feedback> feedbackroom;
	private List<Feedback> feedbackservice;
	private double avgfeedbackRoom;
	private double avgFeedbackSV;

	public List<DataCollection> getRoomBooked() 

	public void setRoomBooked(List<DataCollection> roomBooked) 

	public List<DataCollection> getRoomCanceled() 

	public void setRoomCanceled(List<DataCollection> roomCanceled) 

	public List<Feedback> getFeedbackroom() 

	public void setFeedbackroom(List<Feedback> feedbackroom) 
	
	public double getAvgfeedbackRoom() 

	public void setAvgfeedbackRoom(double avgfeedbackRoom) 

	public double getAvgFeedbackSV() 

	public void setAvgFeedbackSV(double avgFeedbackSV) 

	public List<Feedback> getFeedbackservice() 

	public void setFeedbackservice(List<Feedback> feedbackservice) 

	public ActionTracking(List<DataCollection> roomBooked, List<DataCollection> roomCanceled, List<Feedback> feedbackroom, List<Feedback> feedbackservice, double avgfeedbackRoom, double avgFeedbackSV) 

	@Override
	public String toString() 
}



public class CountryChartData {

	private String countryCode;
	private String countryName;
	private int visitTime;

	public String getCountryCode()

	public void setCountryCode(String countryCode)

	public String getCountryName() 

	public void setCountryName(String countryName) 

	public int getVisitTime() 

	public void setVisitTime(int visitTime) 

	@Override
	public String toString()
}


public class CustomerBehavior {

	private Customer cus;
	private List dateVisited;
	private ActionTracking action;

	public Customer getCus() 

	public void setCus(Customer cus) 

	public List getDateVisited() 

	public void setDateVisited(List dateVisited) 

	public ActionTracking getAction() 

	public void setAction(ActionTracking action) 
	
	public CustomerBehavior(Customer cus, List dateVisited, ActionTracking action) 

	public CustomerBehavior(Customer cus, ActionTracking action) 

	@Override
	public String toString() 
}



public class DataCollection {
    
    private String date;
    private String data;

    public String getDate() 

    public void setDate(String Date) 

    public String getData() 

    public void setData(String data) 

    public DataCollection(String Date, String data) 

    @Override
    public String toString() 
}


public class Feedback {
    
    private String date;
    private String room;
    private int star;
    private String feedback;

    public String getDate() 

    public void setDate(String date) 

    public String getRoom() 

    public void setRoom(String room) 

    public int getStar() 

    public void setStar(int star) 

    public String getFeedback() 

    public void setFeedback(String feedback) 

    public Feedback(String date, int star, String feedback) 

	public Feedback(String date, String room, int star, String feedback) 

    @Override
    public String toString() 
}



public class FollowUsers {

	private String user_ip_address;
	private String external_ip_address;
	private String user_id;
	private String username;
	private String created_at;
	private String page_access;
	private int duration;
	private String durationTime;
	
	public String getUser_ip_address() 

	public void setUser_ip_address(String user_ip_address) 

	public String getPage_access() 

	public void setPage_access(String page_access) 
	
	public String getExternal_ip_address() 

	public void setExternal_ip_address(String external_ip_address) 

	public String getUser_id() 
	
	public void setUser_id(String user_id) 

	public String getUsername() 

	public void setUsername(String username) 

	public int getDuration() 

	public void setDuration(int duration) 

	public String getDurationTime() 

	public void setDurationTime(String durationTime) 

	public String getCreated_at() 

	public void setCreated_at(String created_at) 

	@Override
	public String toString() 
}




public class GeoLocation {

    private String countryCode;
    private String countryName;
    private String postalCode;
    private String city;
    private String region;
    private int areaCode;
    private int dmaCode;
    private int metroCode;
    private float latitude;
    private float longitude;

    public GeoLocation(String countryCode, String countryName, String postalCode, String city, String region,
                       int areaCode, int dmaCode, int metroCode, float latitude, float longitude) 

    public String getCountryCode() 

	public void setCountryCode(String countryCode)

	public String getCountryName() 

	public void setCountryName(String countryName)

	public String getPostalCode() 

	public void setPostalCode(String postalCode) 

	public String getCity() 

	public void setCity(String city) 

	public String getRegion() 

	public void setRegion(String region) 

	public int getAreaCode() 

	public void setAreaCode(int areaCode) 

	public int getDmaCode() 

	public void setDmaCode(int dmaCode) 

	public int getMetroCode() 

	public void setMetroCode(int metroCode) 

	public float getLatitude() 

	public void setLatitude(float latitude) 

	public float getLongitude() 

	public void setLongitude(float longitude) 

	@Override
    public String toString() 
}




public class PageAccessChartData {
	private String page_access;
	private int visit_time;
	private String color;

	public String getPage_access() 

	public void setPage_access(String page_access) 

	public int getVisit_time() 

	public void setVisit_time(int visit_time) 

	public String getColor() 

	public void setColor(String color) 
	
	private String getColorByVisitTime() 

	public PageAccessChartData(String page_access, int visit_time) 
	
	@Override
	public String toString() 
}

