var fullscreen = {
  corRequestFullScreen: function(successCallback, errorCallback) {
    cordova.exec(
      successCallback, // success callback function
      errorCallback, // error callback function
      'Fullscreen', // mapped to our native Java class called "Calendar"
      'requestFullScreen', // with this action name
      [] // no arguments
    );
  },
  corCancelFullScreen: function(successCallback, errorCallback) {
    cordova.exec(
      successCallback, // success callback function
      errorCallback, // error callback function
      'Fullscreen', // mapped to our native Java class called "Calendar"
      'cancelFullScreen', // with this action name
      [] // no arguments
    );
  }
};
module.exports = fullscreen;
