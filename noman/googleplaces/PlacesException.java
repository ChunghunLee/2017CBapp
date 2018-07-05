package noman.googleplaces;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public class PlacesException extends Exception {
    private static final String KEY_STATUS = "status";
    private static final String TAG = "PlacesException";
    private String message;
    private String statusCode;

    public PlacesException(JSONObject json) {
        if (json == null) {
            this.statusCode = "";
            this.message = "Parsing error";
            return;
        }
        try {
            this.statusCode = json.getString("status");
            this.message = json.getString("status");
        } catch (JSONException e) {
            Log.e(TAG, "JSONException while parsing PlacesException argument. Msg: " + e.getMessage());
        }
    }

    public PlacesException(String msg) {
        this.message = msg;
    }

    public String getMessage() {
        return this.message;
    }

    public String getStatusCode() {
        return this.statusCode;
    }
}
