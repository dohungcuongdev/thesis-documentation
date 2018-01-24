var bcrypt = require('bcryptjs');
var mongoose = require('mongoose');
var Schema = mongoose.Schema;
mongoose.Promise = global.Promise;

var userSchema = new Schema(
        {
            username: {type: String, require: true, trim: true},
            password: String,
            name: String,
            phone: String,
            address: String,
            balance: Number,
            created_at: {type: Date, default: Date.now}
        },
        {
            collection: 'customers'
        }
);
var User = module.exports = mongoose.model('User', userSchema);

//function add new user
module.exports.addUser = function (newuser) 

//function get user by username
module.exports.GetUserByUsername = function (username, callbackAction) 

//compare password
module.exports.comparePwd = function (password, hash, callback) 

module.exports.GetUserByID = function (id, callback) 

module.exports.updatePassword = function (username, newpassword) 

