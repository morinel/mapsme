# mapsme Module

## Description

Titanium module to open the Maps.ME app from within your app

## Accessing the mapsme Module

To access this module from JavaScript, you would do the following:

    var mapsme = require("nl.vanvianen.mapsme");

The mapsme variable is a reference to the Module object.

## Usage

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

## Author

Jeroen van Vianen

## License

Copyright 2016  Jeroen van Vianen

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
