 
 + username: String
 + name: String
 + click: String
 + details: String
 + note: String
 + content: String
 + response: String
 + created_at: Date

 + findAll(callbackAction) 

 + findActivityByUserName(username, callbackAction)

 + findNotResponseActivity(username, callbackAction) 

 + findFeedbackRoom(roomid, callbackAction) 

 + addActivity(newActivity)

 + updateResponse(id, response) 