
 - activityModel: activity-model
 - userModel: user-model
 - followUserModel: follow-users-model
 - ipSuggestModel: ip-suggest-model
 - externalip: externalip <<const>>
 - cookie: cookie;
 - appConst: app-const
 - httpRequest: request;
 - nodemailer: nodemailer;
 - transporter: Transport


 - sendHTMLEmail(from, to, subject, content) 
 - getApi(response, err, resource) 
 - postApi(response, err, resource) 
 - deleteApi(response, err, resource) 
 + getActivityByUserName(request, response) 
 + getNotResponseActivity(request, response) 
 - getActivityByID(request, response) 
 + getActivityByID(request, response) 
 + seenAndGetNotification(request, response) 
 + replyAndGetNotification(request, response) 
 + getActivityFeedBackRoom(request, response) 
 + getActivity(request, response) 
 + getFollowUserByUserIP(request, response) 
 + getFollowUserByPage(request, response) 
 + getNumPageTracking(request, response) 
 + getSortedTrackingData(request, response) 
 + getSortedTrackingData2(request, response) 
 + searchTrackingData(request, response)
 + searchTotalPage(request, response) 
 + getExternalIP(request, response) 
 + getExternalIPStatistics(request, response) 
 + getIPStatistics(request, response) 
 + getUsernameStatistics(request, response) 
 + getPageAccessStatistics(request, response) 
 + getPageAccessByIP(request, response) 
 + getPageAccessByUsername(request, response) 
 + getCountryChartData(request, response) 
 + getFollowUserByID(request, response) 
 + getFollowUser(request, response) 
 + getUser(request, response) 
 + getUserByID(request, response) 
 + GetUserByUsername(request, response) 
 + postActivity(request, response) 
 - getMailContent(subject, time) 
 + postFollowUser(request, response) 
 + putUser(req, response, next) 
 + deleteActivity(request, response) 
 + deleteFollowUser(request, response) 
 + serializeUser(username, done) 
 + deserializeUser(id, done) 
 + checklogin(username, password, done) 
 + logout(req, res) 
 + login(req, res, next) 
 + loginsuccess(req, res, next) 
 + changepass(req, res, next) 
 - renderChangePWError(err, res) 
 + checkPassword(req, res, next) 
 + register(req, res, next) 
 + checkregister(req, res, next) 
 - getRoomNameCustomerClicked(follow_users)
 - updateNewIpSuggest(ipSuggestModel, ipSuggest, userip) 
 + getRoomSuggestion(request, response) 
 - updateRecommemdationRoom(follow_users, ip_address) 
 - saveFollowUserByIP(follow_users, ip_address, external_ip, response) 
 - saveFollowUserData(request, response, external_ip) 
 - followUserBehavior(page_access, duration, username) 
 - followUsers(new_page_access, req, res) 
 - getIpAddress() 
 - checkAuthentication(req, res, next) 
 - getSuggestionRoom(rooms, price, size, avgAminities) 
 - get4NumNearest(rooms, att, value)
 - getIndicesOfMin(inp, n)
 - checkNotNull(...items) 
 - checkIsNaturalNumber(...items) 
 - checkIsPositiveFloat(...items) 
 - isValidEmail(email) 
 - isValidIPaddress(ipaddress) 
 - isValidUsername(username) 
 - isValidUser(user) 
 - isAceptableUser(user)
 - activityIsAbleToUpdate(activity) 
 - followUserIsAbleToUpdate(followUser) 
 - ipSuggestIsAbleToUpdate(ipSuggest)