# Titanium Module to open the Maps.ME app #

[![gitTio](http://gitt.io/badge.png)](http://gitt.io/component/nl.vanvianen.mapsme)

To build, create a `build.properties` file with the following content:

```
titanium.platform=/Users/###USER###/Library/Application Support/Titanium/mobilesdk/osx/5.1.2.GA/android
android.platform=/Users/###USER###/Library/Android/sdk/platforms/android-23
google.apis=/Users/###USER###/Library/Android/sdk/add-ons/addon-google_apis-google-23
android.ndk=/Users/###USER###/Library/Android/ndk
```

Make sure your paths are correct for your system setup. Then run:

```
$ ant clean
$ ant
```

A zip file will be created in the `dist` folder.

## Usage ##

```js
var ret = require("nl.vanvianen.mapsme").openMapsMe({
	lat: 48.8582,
	lon: 2.2945
	name: 'Eiffel Tower'
});
if (!ret) {
	alert('Maps.ME is not installed');
}
```
