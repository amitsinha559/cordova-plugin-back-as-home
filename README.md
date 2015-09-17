# Cordova Plugin - Back As Home

With this plugin you can trigger home button functionality by pressing back button. Means you can minimize the app by pressing back button

## Using
Add Plugin

    $ cordova plugin add https://github.com/amitsinha559/cordova-plugin-back-as-home.git

add the following code where ever is required

```js
    backAsHome.trigger(function(){
        console.log("Success");
    }, function(){
        console.log("Error");
    });
```

##Platform

    Only for Android
