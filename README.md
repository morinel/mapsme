# Titanium Module to open the Maps.ME app #

[![gitTio](http://gitt.io/badge.png)](http://gitt.io/component/nl.vanvianen.mapsme)

Make sure you installed the Android SDK and NDK and the settings for `appc ti config` are correct for your system. Then run:

```
$ appc ti build -p android --build-only
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
