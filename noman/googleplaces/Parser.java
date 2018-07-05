package noman.googleplaces;

import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public abstract class Parser {
    private URL placeUrl;

    public abstract Pair<String, List<Place>> parseNearbyPlaces() throws PlacesException;

    protected Parser(String placeUrl) {
        try {
            this.placeUrl = new URL(placeUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    protected InputStream getInputStream() {
        try {
            return this.placeUrl.openConnection().getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
