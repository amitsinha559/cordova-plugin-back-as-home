# Cordova Plugin - Back As Home

With this plugin you can access hardware home button by pressing back button.

## Using
Add Plugin

    $ cordova plugin add git@github.com:amitsinha559/cordova-plugin-back-as-home.git

add the following code inside `onDeviceReady`

```js
    var success = function(message) {
        alert(message);
    }

    var failure = function() {
        alert("Error calling Hello Plugin");
    }

    hello.greet("World", success, failure);
```

##platform

    Only for Android