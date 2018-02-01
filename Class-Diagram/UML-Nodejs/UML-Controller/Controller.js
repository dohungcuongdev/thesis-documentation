





 - cookie: cookie 															- activityModel: activity-model
 - appConst: app-const 														- userModel: user-model
 - httpRequest: request 													- followUserModel: follow-users-model
 - nodemailer: nodemailer 													- ipSuggestModel: ip-suggest-model
 - transporter: Transport 													- externalip: externalip <<const>>


 - sendHTMLEmail(from, to, subject, content)								+ getActivityByUserName(request, response)  
 - getApi(response, err, resource)											+ getNotResponseActivity(request, response)
 - postApi(response, err, resource)											+ getActivityByID(request, response) 
 - deleteApi(response, err, resource)										+ seenAndGetNotification(request, response) 
 - getMailContent(subject, time)											+ replyAndGetNotification(request, response) 
 - renderChangePWError(err, res)											+ getActivityFeedBackRoom(request, response) 
 - getRoomNameCustomerClicked(follow_users) 								+ getActivity(request, response) 
 - updateNewIpSuggest(ipSuggestModel, ipSuggest, userip)  					+ getFollowUserByUserIP(request, response) 
 - updateRecommemdationRoom(follow_users, ip_address)  						+ getFollowUserByPage(request, response) 
 - saveFollowUserByIP(follow_users, ip_address, external_ip, response) 		+ getNumPageTracking(request, response) 
 - saveFollowUserData(request, response, external_ip)  						+ getSortedTrackingData(request, response) 
 - followUserBehavior(page_access, duration, username) 					    + getSortedTrackingData2(request, response) 
 - followUsers(new_page_access, req, res)  									+ searchTrackingData(request, response)
 - getIpAddress()  															+ searchTotalPage(request, response) 
 - checkAuthentication(req, res, next) 									    + getExternalIP(request, response) 
 - getSuggestionRoom(rooms, price, size, avgAminities) 					    + getExternalIPStatistics(request, response) 
 - get4NumNearest(rooms, att, value)									    + getIPStatistics(request, response) 
 - getIndicesOfMin(inp, n) 													+ getUsernameStatistics(request, response) 
 - checkNotNull(...items)  													+ getPageAccessStatistics(request, response) 
 - checkIsNaturalNumber(...items)  											+ getPageAccessByIP(request, response) 
 - checkIsPositiveFloat(...items)  											+ getPageAccessByUsername(request, response) 
 - isValidEmail(email) 													    + getCountryChartData(request, response) 
 - isValidIPaddress(ipaddress) 											    + getFollowUserByID(request, response) 
 - isValidUsername(username) 											    + getFollowUser(request, response) 
 - isValidUser(user)  														+ getUser(request, response) 
 - isAceptableUser(user)												    + getUserByID(request, response) 
 - activityIsAbleToUpdate(activity) 									    + GetUserByUsername(request, response) 
 - followUserIsAbleToUpdate(followUser) 								    + postActivity(request, response) 
 - ipSuggestIsAbleToUpdate(ipSuggest) 									 	+ postFollowUser(request, response) 
 + putUser(req, response, next) 										    + login(req, res, next) 
 + deleteActivity(request, response)  										+ loginsuccess(req, res, next) 
 + deleteFollowUser(request, response) 									    + changepass(req, res, next) 
 + serializeUser(username, done)  											+ checkPassword(req, res, next) 
 + deserializeUser(id, done)  												+ register(req, res, next) 
 + checklogin(username, password, done) 								    + checkregister(req, res, next) 
 + logout(req, res) 														+ getRoomSuggestion(request, response) 