package noman.googleplaces;

import java.util.List;

public interface PlacesListener {
    void onPlacesFailure(PlacesException placesException);

    void onPlacesFinished();

    void onPlacesStart();

    void onPlacesSuccess(List<Place> list);
}
