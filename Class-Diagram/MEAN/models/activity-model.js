var bcrypt = require('bcryptjs');
var mongoose = require('mongoose');
var Schema = mongoose.Schema;
mongoose.Promise = global.Promise;
var ObjectId = require('mongodb').ObjectID;

var activitySchema = new Schema(
    {
        username: String,
        name: String,
        click: String,
        details: String,
        note: String,
        content: String,
        response: String,
        created_at: { type: Date, default: Date.now }
    },
    {
        collection: 'activity'
    }
);
var activity = module.exports = mongoose.model('activity', activitySchema);

module.exports.findAll = function (callbackAction) 

//function get activity by username
module.exports.findActivityByUserName = function (username, callbackAction) 

// find activity that haven't been responsed yet
module.exports.findNotResponseActivity = function (username, callbackAction) 

module.exports.findFeedbackRoom = function (roomid, callbackAction) 

module.exports.addActivity = function (newActivity) 

module.exports.updateResponse = function(id, response) 