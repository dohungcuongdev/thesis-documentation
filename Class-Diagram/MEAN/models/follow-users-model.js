var bcrypt = require('bcryptjs');
var mongoose = require('mongoose');
var appConst = require('../const/app-const');
var Schema = mongoose.Schema;
mongoose.Promise = global.Promise;

var followUserSchema = new Schema(
    {
        user_ip_address: String,
        external_ip_address: String,
        username: String,
        page_access: String,
        duration: Number,
        // range: Array,
        // country: String,
        // region: String,
        // city: String,
        // ll: Array,
        // metro: Number,
        // zip: Number,
        created_at: { type: Date, default: Date.now }
    },
    {
        collection: 'follow-users'
    }
);
var follow_users = module.exports = mongoose.model('follow_users', followUserSchema);

module.exports.findAll = function (callbackAction) 

module.exports.findFollowUserByPage = function (page, callbackAction) 

module.exports.countClickTracking = function (callbackAction) 

module.exports.findSortedTrackingData = function (field_name, callbackAction) 

module.exports.findSortedTrackingData2 = function (fieldname, sort, page, callbackAction) 

var getSearchDateQuery = function(keyword) 

var getSearchDurationQuery = function(keyword) 

module.exports.searchTrackingData = function (fieldname, keyword, sort, page, callbackAction) 

module.exports.countSearchPage = function (fieldname, keyword, callbackAction) 

module.exports.findByUserIP = function (user_ip_address, callbackAction) 

module.exports.findExternalIP = function (external_ip_address, callbackAction) 

module.exports.findCountryChartData = function (callbackAction) 

module.exports.findExternalIPStatistics = function (callbackAction) 

module.exports.findIPStatistics = function (callbackAction) 

module.exports.findUsernameStatistics = function (callbackAction) 

module.exports.findPageAccessStatistics = function (callbackAction) 

module.exports.findPageAccessByIP = function (user_ip_address, callbackAction) 

module.exports.findPageAccessByUsername = function (username, callbackAction) 

module.exports.add = function (newFolowUsersModel) 