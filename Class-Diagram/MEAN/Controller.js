var activityModel = require('../models/activity-model');
var userModel = require('../models/user-model.js');
var followUserModel = require('../models/follow-users-model');
var ipSuggestModel = require('../models/ip-suggest-model');

const getIP = require('external-ip')();
// var geoip = require('geoip-lite');
var externalip = require('externalip');
var cookie = require('cookie');

//const
var appConst = require('../const/app-const');

var httpRequest = require("request");

//mail
var nodemailer = require('nodemailer');
var transporter = nodemailer.createTransport({ service: appConst.MAIL_SERVICE, tls: { rejectUnauthorized: false }, auth: { user: appConst.MAIL_USER, pass: appConst.MAIL_AUTH } });

function sendHTMLEmail(from, to, subject, content) 

function getApi(response, err, resource) 

function postApi(response, err, resource) 

function deleteApi(response, err, resource) 

exports.getActivityByUserName = function (request, response) 

exports.getNotResponseActivity = function (request, response) 

function getActivityByID(request, response) 

exports.getActivityByID = function (request, response) 

exports.seenAndGetNotification = function (request, response) 

exports.replyAndGetNotification = function (request, response) 

exports.getActivityFeedBackRoom = function (request, response) 

exports.getActivity = function (request, response) 

exports.getFollowUserByUserIP = function (request, response) 

exports.getFollowUserByPage = function (request, response) 

exports.getNumPageTracking = function (request, response) 

exports.getSortedTrackingData = function (request, response) 

exports.getSortedTrackingData2 = function (request, response) 

exports.searchTrackingData = function (request, response)

exports.searchTotalPage = function (request, response) 

exports.getExternalIP = function (request, response) 

exports.getExternalIPStatistics = function (request, response) 

exports.getIPStatistics = function (request, response) 

exports.getUsernameStatistics = function (request, response) 

exports.getPageAccessStatistics = function (request, response) 

exports.getPageAccessByIP = function (request, response) 

exports.getPageAccessByUsername = function (request, response) 

exports.getCountryChartData = function (request, response) 

exports.getFollowUserByID = function (request, response) 

exports.getFollowUser = function (request, response) 

exports.getUser = function (request, response) 

exports.getUserByID = function (request, response) 

exports.GetUserByUsername = function (request, response) 

exports.postActivity = function (request, response) 

function getMailContent(subject, time) 

exports.postFollowUser = function (request, response) 

exports.putUser = function (req, response, next) 

exports.deleteActivity = function (request, response) 

exports.deleteFollowUser = function (request, response) 

exports.serializeUser = function (username, done) 

exports.deserializeUser = function (id, done) 

exports.checklogin = function (username, password, done) 

exports.logout = function (req, res) 

exports.login = function (req, res, next) 

exports.loginsuccess = function (req, res, next) 

exports.changepass = function (req, res, next) 

function renderChangePWError(err, res) 

exports.checkPassword = function (req, res, next) 

exports.register = function (req, res, next) 

exports.checkregister = function (req, res, next) 

function getRoomNameCustomerClicked(follow_users)

function updateNewIpSuggest(ipSuggestModel, ipSuggest, userip) 

exports.getRoomSuggestion = function (request, response) 

function updateRecommemdationRoom(follow_users, ip_address) 

function saveFollowUserByIP(follow_users, ip_address, external_ip, response) 

function saveFollowUserData(request, response, external_ip) 

function followUserBehavior(page_access, duration, username) 

function followUsers(new_page_access, req, res) 


// get client ip address
function getIpAddress() 

function checkAuthentication(req, res, next) 


// get list rooms recommendation based on price, size, average Aminities)
function getSuggestionRoom(rooms, price, size, avgAminities) 

// get 4 nearest elements (compare by size, price, average Aminities of a room)
function get4NumNearest(rooms, att, value) 


// get list n smallest elements in array
function getIndicesOfMin(inp, n) 

// merge array
Array.prototype.unique = function () 

// Validate function
function checkNotNull(...items) 

function checkIsNaturalNumber(...items) 

function checkIsPositiveFloat(...items) 

function isValidEmail(email) 

function isValidIPaddress(ipaddress) 

function isValidUsername(username) 

function isValidUser(user) 

function isAceptableUser(user) 


// Check before update
function activityIsAbleToUpdate(activity) 

function followUserIsAbleToUpdate(followUser) 

function ipSuggestIsAbleToUpdate(ipSuggest) 