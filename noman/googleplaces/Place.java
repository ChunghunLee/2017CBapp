package noman.googleplaces;

import android.location.Location;
import java.util.Arrays;

public class Place {
    private String icon;
    private Location location;
    private String name;
    private String placeId;
    private String[] types;
    private String vicinity;

    public static final class Builder {
        private String icon;
        private Location location;
        private String name;
        private String placeId;
        private String[] types;
        private String vicinity;

        public Builder location(Location val) {
            this.location = val;
            return this;
        }

        public Builder icon(String val) {
            this.icon = val;
            return this;
        }

        public Builder name(String val) {
            this.name = val;
            return this;
        }

        public Builder placeId(String val) {
            this.placeId = val;
            return this;
        }

        public Builder types(String[] val) {
            this.types = val;
            return this;
        }

        public Builder vicinity(String val) {
            this.vicinity = val;
            return this;
        }

        public Place build() {
            return new Place();
        }
    }

    private Place(Builder builder) {
        setLocation(builder.location);
        setIcon(builder.icon);
        setName(builder.name);
        setPlaceId(builder.placeId);
        setTypes(builder.types);
        setVicinity(builder.vicinity);
    }

    public String toString() {
        return "Place{location=" + this.location + ", icon='" + this.icon + '\'' + ", name='" + this.name + '\'' + ", placeId='" + this.placeId + '\'' + ", types=" + Arrays.toString(this.types) + ", vicinity='" + this.vicinity + '\'' + '}';
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceId() {
        return this.placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String[] getTypes() {
        return this.types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

    public String getVicinity() {
        return this.vicinity;
    }

    public void setVicinity(String vicinity) {
        this.vicinity = vicinity;
    }

    public double getLatitude() {
        return this.location.getLatitude();
    }

    public double getLongitude() {
        return this.location.getLongitude();
    }
}
