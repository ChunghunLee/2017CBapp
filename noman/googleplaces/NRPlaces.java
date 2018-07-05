package noman.googleplaces;

import android.util.Log;
import java.util.List;
import java.util.Locale;

public class NRPlaces extends AbstractPlaces {
    private String countryCode;
    private String key;
    private String keyword;
    private String language;
    private PlacesListener listener;
    private String location;
    private int maxprice;
    private int minprice;
    private String[] name;
    private boolean opennow;
    private int radius;
    private String rankby;
    private String type;

    public static final class Builder {
        private String countryCode;
        private String key;
        private String keyword;
        private String language;
        private double lat = -1.0d;
        private PlacesListener listener;
        private double lng = -1.0d;
        private int maxprice = -1;
        private int minprice = -1;
        private String[] name;
        private boolean opennow;
        private int radius = -1;
        private String rankby;
        private String type;

        public Builder key(String val) {
            this.key = val;
            return this;
        }

        public Builder latlng(double lat, double lng) {
            this.lat = lat;
            this.lng = lng;
            return this;
        }

        public Builder radius(int val) {
            this.radius = val;
            return this;
        }

        public Builder rankby(String val) {
            this.rankby = val;
            return this;
        }

        public Builder keyword(String val) {
            this.keyword = val;
            return this;
        }

        public Builder minprice(int min, int max) {
            this.minprice = min;
            this.maxprice = max;
            return this;
        }

        public Builder name(String... val) {
            this.name = val;
            return this;
        }

        public Builder name(List<String> val) {
            this.name = new String[val.size()];
            this.name = (String[]) val.toArray(this.name);
            return this;
        }

        public Builder opennow(boolean val) {
            this.opennow = val;
            return this;
        }

        public Builder type(String val) {
            this.type = val;
            return this;
        }

        public Builder listener(PlacesListener val) {
            this.listener = val;
            return this;
        }

        public Builder language(String val) {
            this.language = val;
            return this;
        }

        public Builder language(String language, String countryCode) {
            this.language = language;
            this.countryCode = countryCode;
            return this;
        }

        public NRPlaces build() {
            return new NRPlaces();
        }
    }

    private NRPlaces(Builder builder) {
        super(builder.listener);
        this.radius = -1;
        this.minprice = -1;
        this.maxprice = -1;
        setKey(builder.key);
        if (builder.lat == -1.0d || builder.lng == -1.0d) {
            setLocation(null);
        } else {
            setLocation(builder.lat + "," + builder.lng);
        }
        setRadius(builder.radius);
        setRankby(builder.rankby);
        setKeyword(builder.keyword);
        setMinprice(builder.minprice);
        setMaxprice(builder.maxprice);
        setName(builder.name);
        setOpennow(builder.opennow);
        setType(builder.type);
        setListener(builder.listener);
        setLanguage(builder.language);
        setCountryCode(builder.countryCode);
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getRankby() {
        return this.rankby;
    }

    public void setRankby(String rankby) {
        this.rankby = rankby;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getMinprice() {
        return this.minprice;
    }

    public void setMinprice(int minprice) {
        this.minprice = minprice;
    }

    public int getMaxprice() {
        return this.maxprice;
    }

    public void setMaxprice(int maxprice) {
        this.maxprice = maxprice;
    }

    public String[] getName() {
        return this.name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public boolean isOpennow() {
        return this.opennow;
    }

    public void setOpennow(boolean opennow) {
        this.opennow = opennow;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PlacesListener getListener() {
        return this.listener;
    }

    public void setListener(PlacesListener listener) {
        this.listener = listener;
    }

    protected String constructURL(String nexPageToken) {
        int i = 1;
        StringBuilder builder = new StringBuilder(this.PLACES_URL);
        if (this.key == null) {
            throw new IllegalArgumentException("API key is required");
        }
        builder.append("key=").append(this.key);
        if (nexPageToken != null) {
            builder.append("&").append("pagetoken=").append(nexPageToken);
            Log.e("Places", builder.toString());
            return builder.toString();
        } else if (this.location == null) {
            throw new IllegalArgumentException("Location lat/lng is required");
        } else {
            builder.append("&").append("location=").append(this.location);
            if (this.radius != -1 && this.rankby != null) {
                throw new IllegalArgumentException("'radius' and 'rankby' cannot work together");
            } else if (this.radius == -1 && this.rankby == null) {
                throw new IllegalArgumentException("'radius' is required");
            } else {
                int i2;
                if (this.radius != -1) {
                    if (this.radius > 50000) {
                        throw new IllegalArgumentException("'radius' cannot be > 50000");
                    }
                    builder.append("&").append("radius=").append(String.valueOf(this.radius));
                } else if (this.rankby.equals("distance") || this.rankby.equals("prominence")) {
                    builder.append("&").append("rankby=").append(this.rankby);
                } else {
                    throw new IllegalArgumentException("'rankby' can only be 'distance' or 'prominence' ");
                }
                if (this.keyword != null) {
                    builder.append("&").append("keyword=").append(this.keyword);
                }
                if (this.language != null) {
                    Locale locale = new Locale(this.language);
                    if (locale.getISO3Language() == null || locale.getISO3Country().isEmpty()) {
                        if (this.countryCode != null) {
                            locale = new Locale(this.language, this.countryCode);
                        } else {
                            locale = new Locale(this.language, this.language);
                        }
                        if (locale.getISO3Language() == null || locale.getISO3Country().isEmpty()) {
                            throw new IllegalArgumentException("Invalid language code");
                        }
                    }
                    builder.append("&").append("language=").append(this.language);
                }
                if (this.minprice != -1) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (this.maxprice == -1) {
                    i = 0;
                }
                if ((i2 & i) != 0) {
                    if (this.minprice > this.maxprice) {
                        throw new IllegalArgumentException("'minprice' should be less than 'maxprice'");
                    } else if (this.minprice > 4 || this.maxprice > 4) {
                        throw new IllegalArgumentException("'minprice' and 'maxprice' should be less equal to 4");
                    } else if (this.minprice < 0 || this.maxprice < 0) {
                        throw new IllegalArgumentException("'minprice' and 'maxprice' should be greater equal to 0");
                    } else {
                        builder.append("&").append("minprice=").append(String.valueOf(this.minprice));
                        builder.append("&").append("maxprice=").append(String.valueOf(this.maxprice));
                    }
                }
                if (this.name != null) {
                    String names = "";
                    for (String str : this.name) {
                        if (!names.isEmpty()) {
                            names = names + "|";
                        }
                        names = names + str;
                    }
                    if (!names.isEmpty()) {
                        builder.append("&").append("name=").append(names);
                    }
                }
                if (this.type != null) {
                    try {
                        PlaceType.class.getField(this.type.toUpperCase());
                        builder.append("&").append("type=").append(this.type);
                    } catch (Exception e) {
                        throw new IllegalArgumentException("'" + this.type + "' is invalid. All types are given in PlaceType class");
                    }
                }
                Log.e("Places", builder.toString());
                return builder.toString();
            }
        }
    }
}
