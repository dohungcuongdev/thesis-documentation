
 + user_ip_address: String
 + external_ip_address: String
 + username: String
 + page_access: String
 + duration: Number
 + created_at: Date

 + findAll(callbackAction) 

 + findFollowUserByPage(page, callbackAction) 

 + countClickTracking(callbackAction) 

 + findSortedTrackingData(field_name, callbackAction) 

 + findSortedTrackingData2(fieldname, sort, page, callbackAction) 

 - getSearchDateQuery(keyword) 

 - getSearchDurationQuery(keyword) 

 + searchTrackingData(fieldname, keyword, sort, page, callbackAction) 

 + countSearchPage(fieldname, keyword, callbackAction) 

 + findByUserIP(user_ip_address, callbackAction) 

 + findExternalIP(external_ip_address, callbackAction) 

 + findCountryChartData(callbackAction) 

 + findExternalIPStatistics(callbackAction) 

 + findIPStatistics(callbackAction) 

 + findUsernameStatistics(callbackAction) 

 + findPageAccessStatistics(callbackAction) 

 + findPageAccessByIP(user_ip_address, callbackAction) 

 + findPageAccessByUsername(username, callbackAction) 

 + add(newFolowUsersModel) 