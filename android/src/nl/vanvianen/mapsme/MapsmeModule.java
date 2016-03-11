/**
 * Copyright 2016  Jeroen van Vianen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nl.vanvianen.mapsme;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;

import com.mapswithme.maps.api.MapsWithMeApi;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollFunction;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.titanium.TiApplication;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

@Kroll.module(name = "Mapsme", id = "nl.vanvianen.mapsme")
public class MapsmeModule extends KrollModule {
    // Standard Debugging variables
    private static final String LCAT = "MapsMeModule";


    public MapsmeModule() {
        super();
    }

    @Kroll.method
    @SuppressWarnings("unchecked")
    public Boolean openMapsMe(HashMap options) {
        Activity activity = TiApplication.getInstance().getCurrentActivity();
        boolean mapsMeInstalled = activity.getPackageManager().resolveActivity(new Intent("com.mapswithme.maps.api.request"), 0) != null;

        if (mapsMeInstalled) {
            double lat = 0.0;
            double lon = 0.0;
            String name = null;
            double zoom = -1;

            if (options.get("lat") instanceof Double) {
                lat = (Double) options.get("lat");
            }
            if (options.get("lon") instanceof Double) {
                lon = (Double) options.get("lon");
            }
            if (options.get("name") instanceof String) {
                name = (String) options.get("name");
            }
            if (options.get("zoom") instanceof Double) {
                zoom = (Double) options.get("zoom");
            }

            Log.d(LCAT, "Open Maps.ME, coordinates=" + lat + "," + lon + ", name=" + name + ", zoom=" + zoom);

            MapsWithMeApi.showPointOnMap(activity, lat, lon, name, zoom);
        } else {
            Log.d(LCAT, "Maps.ME not installed");
        }

        return mapsMeInstalled;
    }

    @Kroll.onAppCreate
    public static void onAppCreate(TiApplication app) {
        Log.d(LCAT, "onAppCreate " + app);
    }

    @Override
    protected void initActivity(Activity activity) {
        Log.d(LCAT, "initActivity " + activity);
        super.initActivity(activity);
    }

    @Override
    public void onResume(Activity activity) {
        Log.d(LCAT, "onResume " + activity);
        super.onResume(activity);
    }

    @Override
    public void onPause(Activity activity) {
        Log.d(LCAT, "onPause " + activity);
        super.onPause(activity);
    }

    @Override
    public void onDestroy(Activity activity) {
        Log.d(LCAT, "onDestroy " + activity);
        super.onDestroy(activity);
    }

    @Override
    public void onStart(Activity activity) {
        Log.d(LCAT, "onStart " + activity);
        super.onStart(activity);
    }

    @Override
    public void onStop(Activity activity) {
        Log.d(LCAT, "onStop " + activity);
        super.onStop(activity);
    }
}
