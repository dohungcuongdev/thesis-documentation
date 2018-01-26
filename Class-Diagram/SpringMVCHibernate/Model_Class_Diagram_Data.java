
public abstract class AbstractModel {
	
 # checkNotNull(Object... objs): boolean 
	
 # checkNaturalNumber(int num): boolean 

 # checkNaturalNumber(String str): boolean 
	
 # checkNaturalNumber(int... numbers): boolean 

 # checkNaturalNumber(String... strings): boolean 
	
 # checkIsDateTimeFormat(String strDate): boolean 
	
 # checkIsDateFormat(String... strDates): boolean  
	
 + getToday(): Date 
	
 + getDateFormated(String strDate): Date <<static>>
	
 + getDateTimeFormated(String date): Date 

 + getICTDateTime(String dateTime): Date 

 + getICTStrDateTime(String dateTime): String 

	// lowercase first character of string
 # lowerFirstChar(String varname): String 

	// uppercase first character of string
 # upperFirstChar(String varname): String 
    
    @Override
 + toString(): String <<abstract>>
}


@MappedSuperclass
public abstract class MySQLAbstractModel extends AbstractModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
 # id: int 
	
	@Column(name = "name", unique = true, nullable = false)
 # name: String 

 + getId(): int 

 + setId(int id): void 

 + getName(): String 

 + setName(String name): void 
	
 + MySQLAbstractModel() {}
    
 + MySQLAbstractModel(int id, String name)

	@Override
 + toString(): String <<abstract>> 
}


@Entity(name = "admin")
public class Administrator extends MySQLAbstractModel {

	@Column(name = "username", unique = true, nullable = false, length = 255)
 # username: String 
	
	@Column(name = "phone", nullable = false)
 # phone: String 
	
	@Column(name = "password", nullable = false)
 # password: String 

	@Column(name = "gender", nullable = false)
 - gender: String 

	@Column(name = "birthday", nullable = false)
 - birthday: String 

	@Column(name = "img", nullable = false)
 - img: String 

 + getUsername(): String 

 + setUsername(String username): void 

 + getPassword(): String 

 + setPassword(String password): void 
	
 + getPhone(): String 

 + setPhone(String phone): void 

 + getBirthday(): String 

 + setBirthday(String birthday): void 

 + getImg(): String 

 + setImg(String img): void 

 + getGender(): String 

 + setGender(String gender): void 

 + isEnoughInfor(): boolean 

	@Override
 + toString(): String 
}


@MappedSuperclass
public abstract class HotelItem extends MySQLAbstractModel {

	@Column(name = "price", nullable = false)
 # price: int 
	
	@Column(name = "img", nullable = false)
 # img: String 
	
	@Column(name = "img2", nullable = false)
 # img2: String 
	
	@Column(name = "details", nullable = false)
	@Type(type="text")
 # details: String 
	
	@Column(name = "type", nullable = false)
 # type: String 
	
	@Column(name = "created_by", nullable = false)
 # created_by: String 

	@Column(name = "created_at", nullable = false)
 # created_at: String 

 + getType(): String 

 + setType(String type): void 

 + getPrice(): int 

 + setPrice(int price): void 

 + getImg(): String 

 + setImg(String img): void 

 + getImg2(): String 

 + setImg2(String img2): void 

 + getDetails(): String 

 + setDetails(String details): void 

 + getCreated_by(): String 

 + setCreated_by(String created_by): void 

 + getCreated_at(): String 

 + setCreated_at(String created_at): void 

 # setInfor(String name, String type, int price, String img, String img2, String details): void 
	
 + setCreated() : void 
	
 + HotelItem() {}
	
 + HotelItem(String name, int price, String img, String img2, String details, String type, String created_by, String created_at) 
	
 + HotelItem(int id, String name, int price, String img, String img2, String details, String type, String created_by, String created_at) 

 + initializeSomeInfor(): void <<abstract>>

 + getAbleToUpdate(): String  <<abstract>>;
    
 + setNewInfor(): void <<abstract >>;

	@Override
 + toString(): String 
}


@Entity(name = "rooms")
public class HotelRoom extends HotelItem {
	
	@Column(name = "size", nullable = false)
 - size: int 
	
	@Column(name = "numpeople", nullable = false)
 - numpeople: int 
	
	@Column(name = "status", nullable = false)
 - status: String 
	
	@Column(name = "booked_by", nullable = true)
 - booked_by: String 
	
	@Column(name = "amenities", nullable = false)
	@Type(type="text")
 - amenities: String 
	
	@Column(name = "avgAminities", nullable = false)
 - avgAminities: int 
	
	@Column(name = "checkin", nullable = true)
 - checkin: String 
	
	@Column(name = "checkout", nullable = true)
 - checkout: String 
	
	@Column(name = "star", nullable = true)
 - star: int 
	
	@Column(name = "numvote", nullable = true)
 - numvote: int 

 + getSize(): int 

 + setSize(int size): void 

 + getNumpeople(): int 

 + setNumpeople(int numpeople): void 

 + getStatus(): String 

 + setStatus(String status): void 

 + getAmenities(): String 

 + setAmenities(String amenities): void 

 + getBooked_by(): String 

 + setBooked_by(String booked_by): void 

 + getCheckin(): String 

 + setCheckin(String checkin): void 

 + getCheckout(): String 

 + setCheckout(String checkout): void 

 + getStar(): int 

 + setStar(int star): void 

 + getNumvote(): int 

 + setNumvote(int numvote): void 

 + getAvgAminities(): int 

 + setAvgAminities(int avgAminities): void 

	@Override
 + initializeSomeInfor(): void 

	@Override
 + setNewInfor(): void 

 - isInvalidType(): boolean 

 - isInvalidStatus(): boolean 

 - isEnoughInfor(): boolean 

 - isNumberFormat(): boolean 

 + isvalidDate(): boolean 

 + isCorrectRoomName(): boolean 

	@Override
 + getAbleToUpdate(): String 

 + allInforCorrect(): boolean 
	
 + isReadyToBook(): boolean 
	
 + HotelRoom() {}
	
 + HotelRoom(String name, int price, String img, String img2, String details, String type, String created_by, String created_at, int size, int numpeople, String status, String amenities, String booked_by, int avgAminities, String checkin, String checkout, int star, int numvote) 

 + HotelRoom(int id, String name, int price, String img, String img2, String details, String type, String created_by, String created_at, int size, int numpeople, String status, String amenities, String booked_by, int avgAminities, String checkin, String checkout, int star, int numvote) 

	@Override
 + toString(): String 
	
}



@Entity(name = "restaurant")
public class HotelService extends HotelItem {

	@Column(name = "quantity", nullable = false)
 - quantity: int 
	
	@Column(name = "note", nullable = false)
 - note: String 
	
	@Column(name = "serveType", nullable = false)
 - serveType: String 
	
	@Column(name = "serveTime", nullable = false)
 - serveTime: String 

 + getQuantity(): int 

 + setQuantity(int quantity): void 

 + getNote(): String 

 + setNote(String note): void 

 + getServeType(): String 

 + setServeType(String serveType): void 

 + getServeTime(): String 
    
    @Override
 + setNewInfor(): void 

 + initializeServeTime(): void 

 - isEnoughInfor(): boolean 

 - isNumberFormat(): boolean 

    @Override
 + initializeSomeInfor(): void 

 - isInvalidType(): boolean 

 - isInvalidServeType(): boolean 
    
    @Override
 + getAbleToUpdate(): String 

 + HotelService() 

 + HotelService(int id, String name, int price, String img, String img2, String details, String type, String created_by, String created_at, int quantity, String note, String serveType, String serveTime) 

 + HotelService(String name, int price, String img, String img2, String details, String type, String created_by, String created_at, int quantity, String note, String serveType, String serveTime) 

 + HotelService(int quantity, String note, String serveType, String serveTime) 

	@Override
 + toString(): String 
}



public abstract class MongoDbAbstractModel extends AbstractModel {
	
 # _id: String 
 # name: String 
 # created_at: String 
	
 + getId(): String 

 + setId(String id): void 

 + getName(): String 

 + setName(String name): void 

 + getCreated_at(): String 

 + setCreated_at(String created_at): void 

	@Override
 + toString(): String <<abstract>>
}


public class Customer extends MongoDbAbstractModel {
	
 # username: String 
 # phone: String 
 # password: String 
 - address: String 
 - balance: int 
 - activity: List<Activity> 
 - dateVisit: List<String> 
    
 + getUsername(): String 

 + setUsername(String username): void 

 + getPassword(): String 

 + setPassword(String password): void 

 + getPhone(): String 

 + setPhone(String phone): void 

 + getBalance(): int 

 + setBalance(int balance): void 

 + getActivity(): List<Activity> 

 + setActivity(List<Activity> activity): void 

 + getAddress(): String 

 + setAddress(String address): void 

 + getDateVisit(): List<String> 

 + setDateVisit(List<String> dateVisit) : void 

	@Override
 + toString(): String 
}


public class Activity extends MongoDbAbstractModel {

 - username: String 
 - click: String 
 - details: String 
 - note: String 
 - content: String 
 - response: String 
 - fullname: String 
 - email: String 
 - phone: String 

 + getFullname(): String 

 + setFullname(String fullname): void 

 + getEmail(): String 

 + setEmail(String email): void 

 + getPhone(): String 

 + setPhone(String phone): void 

 + getDetails(): String 

 + setDetails(String details): void 

 + getNote(): String 

 + setNote(String note): void 

 + getUsername(): String 

 + setUsername(String username): void 

 + getClick(): String 

 + setClick(String click): void 

 + getContent(): String 

 + setContent(String content): void 

 + getResponse(): String 

 + setResponse(String response): void 
    
 + setCustomerInfor(String email, String fullname, String phone): void 

 + class CompareDateTime implements Comparator<Activity> <<static>> {
        @Override
     + compare(Activity a1, Activity a2): int 
    }

	@Override
 + toString(): String 
}



public class LoginBean {

 - userName: String 
 - password: String 

 + getUserName(): String 

 + setUserName(String userName): void 

 + getPassword(): String 

 + setPassword(String password): void 
}



public class ChangePasswordBean {
 - currentpassword: String 
 - newpassword: String 
 - confirm: String 

 + getCurrentpassword() : String 

 + setCurrentpassword(String currentpassword) : void 

 + getNewpassword() : String 

 + setNewpassword(String newpassword) : void 

 + getConfirm() : String 

 + setConfirm(String confirm) : void 
	
 + getPWCheckingResult(String correctPassword) : String 
	
 + isMatchPassword(String correctPassword) : boolean 
	
 + ChangePasswordBean() 

 + ChangePasswordBean(String currentpassword, String newpassword, String confirm) 

	@Override
 + toString() : String 
}



public class ActionTracking {

 - roomBooked: List<DataCollection> 
 - roomCanceled: List<DataCollection> 
 - feedbackroom: List<Feedback> 
 - feedbackservice: List<Feedback> 
 - avgfeedbackRoom: double 
 - avgFeedbackSV: double 

 + getRoomBooked(): List<DataCollection> 

 + setRoomBooked(List<DataCollection> roomBooked): void 

 + getRoomCanceled() : List<DataCollection> 

 + setRoomCanceled(List<DataCollection> roomCanceled) : void 

 + getFeedbackroom() : List<Feedback> 

 + setFeedbackroom(List<Feedback> feedbackroom) : void 
	
 + getAvgfeedbackRoom() : double 

 + setAvgfeedbackRoom(double avgfeedbackRoom) : void 

 + getAvgFeedbackSV() : double 

 + setAvgFeedbackSV(double avgFeedbackSV) : void 

 + getFeedbackservice() : List<Feedback> 

 + setFeedbackservice(List<Feedback> feedbackservice) : void 

 + ActionTracking(List<DataCollection> roomBooked, List<DataCollection> roomCanceled, List<Feedback> feedbackroom, List<Feedback> feedbackservice, double avgfeedbackRoom, double avgFeedbackSV) 

	@Override
 + toString() : String 
}



public class CountryChartData {

 - String countryCode;
 - String countryName;
 - int visitTime;

 + String getCountryCode()

 + void setCountryCode(String countryCode)

 + String getCountryName() 

 + void setCountryName(String countryName) 

 + int getVisitTime() 

 + void setVisitTime(int visitTime) 

	@Override
 + String toString()
}


public class CustomerBehavior {

 - Customer cus;
 - List dateVisited;
 - ActionTracking action;

 + Customer getCus() 

 + void setCus(Customer cus) 

 + List getDateVisited() 

 + void setDateVisited(List dateVisited) 

 + ActionTracking getAction() 

 + void setAction(ActionTracking action) 
	
 + CustomerBehavior(Customer cus, List dateVisited, ActionTracking action) 

 + CustomerBehavior(Customer cus, ActionTracking action) 

	@Override
 + String toString() 
}



public class DataCollection {
    
 - date: String 
 - data: String 

 + getDate() : String 

 + setDate(String Date) : void 

 + getData() : String 

 + setData(String data) : void 

 + DataCollection(String Date, String data) 

    @Override
 + toString() : String 
}


public class Feedback {
    
 - date: String 
 - room: String 
 - star: int 
 - feedback: String 

 + getDate(): String 

 + setDate(String date) : void 

 + getRoom() : String 

 + setRoom(String room) : void 

 + getStar() : int 

 + setStar(int star) : void 

 + getFeedback() : String 

 + setFeedback(String feedback) : void 

 + Feedback(String date, int star, String feedback) 

 + Feedback(String date, String room, int star, String feedback) 

    @Override
 + toString() : String 
}



public class FollowUsers {

 - user_ip_address: String 
 - external_ip_address: String 
 - user_id: String 
 - username: String 
 - created_at: String 
 - page_access: String 
 - duration: int 
 - durationTime: String 
	
 + getUser_ip_address(): String 

 + setUser_ip_address(String user_ip_address): void 

 + getPage_access(): String 

 + setPage_access(String page_access): void 
	
 + getExternal_ip_address(): String 

 + setExternal_ip_address(String external_ip_address): void 

 + getUser_id(): String 
	
 + setUser_id(String user_id): void 

 + getUsername(): String 

 + setUsername(String username): void 

 + getDuration(): int 

 + setDuration(int duration): void 

 + getDurationTime(): String 

 + setDurationTime(String durationTime): void 

 + getCreated_at(): String 

 + setCreated_at(String created_at): void  

	@Override
 + toString(): String 
}




public class GeoLocation {

 - countryCode: String 
 - countryName: String 
 - postalCode: String 
 - city: String 
 - region: String 
 - areaCode: int 
 - dmaCode: int 
 - metroCode: int 
 - latitude: float 
 - longitude: float 

 + GeoLocation(String countryCode, String countryName, String postalCode, String city, String region,
                       int areaCode, int dmaCode, int metroCode, float latitude, float longitude) 

 + getCountryCode(): String 

 + setCountryCode(String countryCode): void 

 + getCountryName(): String 

 + setCountryName(String countryName): void 

 + getPostalCode(): String 

 + setPostalCode(String postalCode): void  

 + getCity(): String 

 + setCity(String city): void 

 + getRegion(): String 

 + setRegion(String region): void 

 + getAreaCode(): int 

 + setAreaCode(int areaCode): void 

 + getDmaCode(): int 

 + setDmaCode(int dmaCode): void 

 + getMetroCode(): int 

 + setMetroCode(int metroCode): void 

 + getLatitude(): float 

 + setLatitude(float latitude): void 

 + getLongitude(): float 

 + setLongitude(float longitude): void 

	@Override
 + toString(): String 
}




public class PageAccessChartData {
 - page_access: String 
 - visit_time: int 
 - color: String 

 + getPage_access(): String 

 + setPage_access(String page_access): void 

 + getVisit_time(): int 

 + setVisit_time(int visit_time): void 

 + getColor(): String 

 + setColor(String color): void 
	
 - getColorByVisitTime(): String 

 + PageAccessChartData(String page_access, int visit_time) 
	
	@Override
 + toString(): String 
}

