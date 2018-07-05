package noman.googleplaces;

import android.os.AsyncTask;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPlaces extends AsyncTask<Void, Void, List<Place>> {
    protected final String PARAM_KEY = "key=";
    protected final String PARAM_KEYWORD = "keyword=";
    protected final String PARAM_LANGUAGE = "language=";
    protected final String PARAM_LOCATION = "location=";
    protected final String PARAM_MAXPRICE = "maxprice=";
    protected final String PARAM_MINPRICE = "minprice=";
    protected final String PARAM_NAME = "name=";
    protected final String PARAM_PAGETOKEN = "pagetoken=";
    protected final String PARAM_RADIUS = "radius=";
    protected final String PARAM_RANK_BY = "rankby=";
    protected final String PARAM_TYPE = "type=";
    protected String PLACES_URL = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?";
    private PlacesException exception;
    private List<PlacesListener> listeners = new ArrayList();

    protected abstract String constructURL(String str);

    protected AbstractPlaces(PlacesListener listener) {
        registerListener(listener);
    }

    protected List<Place> doInBackground(Void... params) {
        try {
            Pair<String, List<Place>> pair = new PlacesParser(constructURL(null)).parseNearbyPlaces();
            dispatchOnSuccess((List) pair.second);
            if (pair.first != null) {
                Thread.sleep(2000);
                pair = new PlacesParser(constructURL((String) pair.first)).parseNearbyPlaces();
                dispatchOnSuccess((List) pair.second);
                if (pair.first != null) {
                    Thread.sleep(2000);
                    pair = new PlacesParser(constructURL((String) pair.first)).parseNearbyPlaces();
                    dispatchOnSuccess((List) pair.second);
                }
            }
            return (List) pair.second;
        } catch (PlacesException e) {
            this.exception = e;
            dispatchOnFailure(e);
            return null;
        } catch (InterruptedException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    protected void onPreExecute() {
        dispatchOnStart();
    }

    protected void onPostExecute(List<Place> places) {
        if (places == null) {
            dispatchOnFailure(this.exception);
        } else {
            dispatchOnFinished();
        }
    }

    public void registerListener(PlacesListener mListener) {
        if (mListener != null) {
            this.listeners.add(mListener);
        }
    }

    protected void dispatchOnStart() {
        for (PlacesListener mListener : this.listeners) {
            mListener.onPlacesStart();
        }
    }

    protected void dispatchOnFailure(PlacesException exception) {
        Log.e("Places", exception.toString());
        for (PlacesListener mListener : this.listeners) {
            mListener.onPlacesFailure(exception);
        }
    }

    protected void dispatchOnSuccess(List<Place> places) {
        for (PlacesListener mListener : this.listeners) {
            mListener.onPlacesSuccess(places);
        }
    }

    private void dispatchOnFinished() {
        for (PlacesListener mListener : this.listeners) {
            mListener.onPlacesFinished();
        }
    }
}
