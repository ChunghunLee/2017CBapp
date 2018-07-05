package noman.googleplaces;

import android.location.Location;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PlacesParser extends Parser {
    private static final String GEOMETRY = "geometry";
    private static final String ICON = "icon";
    private static final String LAT = "lat";
    private static final String LNG = "lng";
    private static final String LOCATION = "location";
    private static final String NAME = "name";
    private static final String NEXT_PAGE_TOKEN = "next_page_token";
    private static final String PLACE_ID = "place_id";
    private static final String RESULTS = "results";
    private static final String STATUS = "status";
    private static final String STATUS_OK = "OK";
    private static final String TYPES = "types";
    private static final String VICINITY = "vicinity";

    public PlacesParser(String placesUrl) {
        super(placesUrl);
    }

    public Pair<String, List<Place>> parseNearbyPlaces() throws PlacesException {
        String result = convertStreamToString(getInputStream());
        if (result == null) {
            throw new PlacesException("Result is null");
        }
        try {
            JSONObject json = new JSONObject(result);
            if (json.getString("status").equals(STATUS_OK)) {
                JSONArray results = json.getJSONArray(RESULTS);
                List<Place> places = new ArrayList();
                String nextPageToken = null;
                if (json.has(NEXT_PAGE_TOKEN)) {
                    nextPageToken = json.getString(NEXT_PAGE_TOKEN);
                }
                for (int i = 0; i < results.length(); i++) {
                    places.add(buildNearbyPlacefromJSON(results.getJSONObject(i)));
                }
                return new Pair(nextPageToken, places);
            }
            throw new PlacesException(json);
        } catch (JSONException e) {
            throw new PlacesException("JSONException. Msg: " + e.getMessage());
        }
    }

    private Place buildNearbyPlacefromJSON(JSONObject jsonPlace) throws JSONException {
        Place place = new Place();
        JSONObject locationJson = jsonPlace.getJSONObject(GEOMETRY).getJSONObject(LOCATION);
        Location location = new Location("place");
        location.setLatitude(locationJson.getDouble(LAT));
        location.setLongitude(locationJson.getDouble(LNG));
        place.setLocation(location);
        place.setIcon(jsonPlace.getString(ICON));
        place.setName(jsonPlace.getString(NAME));
        place.setPlaceId(jsonPlace.getString(PLACE_ID));
        JSONArray typesArray = jsonPlace.getJSONArray(TYPES);
        String[] types = new String[typesArray.length()];
        for (int i = 0; i < typesArray.length(); i++) {
            types[i] = typesArray.getString(i);
        }
        place.setTypes(types);
        place.setVicinity(jsonPlace.getString(VICINITY));
        return place;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String convertStreamToString(java.io.InputStream r8) {
        /*
        r7 = this;
        if (r8 != 0) goto L_0x0004;
    L_0x0002:
        r4 = 0;
    L_0x0003:
        return r4;
    L_0x0004:
        r2 = new java.io.BufferedReader;
        r4 = new java.io.InputStreamReader;
        r4.<init>(r8);
        r2.<init>(r4);
        r3 = new java.lang.StringBuilder;
        r3.<init>();
    L_0x0013:
        r1 = r2.readLine();	 Catch:{ IOException -> 0x001d }
        if (r1 == 0) goto L_0x0032;
    L_0x0019:
        r3.append(r1);	 Catch:{ IOException -> 0x001d }
        goto L_0x0013;
    L_0x001d:
        r0 = move-exception;
        r4 = "Places Error";
        r5 = r0.getMessage();	 Catch:{ all -> 0x004f }
        android.util.Log.e(r4, r5);	 Catch:{ all -> 0x004f }
        r8.close();	 Catch:{ IOException -> 0x0044 }
        r2.close();	 Catch:{ IOException -> 0x0044 }
    L_0x002d:
        r4 = r3.toString();
        goto L_0x0003;
    L_0x0032:
        r8.close();	 Catch:{ IOException -> 0x0039 }
        r2.close();	 Catch:{ IOException -> 0x0039 }
        goto L_0x002d;
    L_0x0039:
        r0 = move-exception;
        r4 = "Places Error";
        r5 = r0.getMessage();
        android.util.Log.e(r4, r5);
        goto L_0x002d;
    L_0x0044:
        r0 = move-exception;
        r4 = "Places Error";
        r5 = r0.getMessage();
        android.util.Log.e(r4, r5);
        goto L_0x002d;
    L_0x004f:
        r4 = move-exception;
        r8.close();	 Catch:{ IOException -> 0x0057 }
        r2.close();	 Catch:{ IOException -> 0x0057 }
    L_0x0056:
        throw r4;
    L_0x0057:
        r0 = move-exception;
        r5 = "Places Error";
        r6 = r0.getMessage();
        android.util.Log.e(r5, r6);
        goto L_0x0056;
        */
        throw new UnsupportedOperationException("Method not decompiled: noman.googleplaces.PlacesParser.convertStreamToString(java.io.InputStream):java.lang.String");
    }
}
