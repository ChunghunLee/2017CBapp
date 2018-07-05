package com.chan.testapplication;

import android.content.ContentValues;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class ForeCastManager extends Thread {
    String lat;
    String lon;
    MainActivity mContext;
    ArrayList<ContentValues> mWeatehr;

    public ArrayList<ContentValues> getmWeather() {
        return this.mWeatehr;
    }

    public ForeCastManager(String lon, String lat, MainActivity mContext) {
        this.lon = lon;
        this.lat = lat;
        this.mContext = mContext;
    }

    public ArrayList<ContentValues> GetOpenWeather(String lon, String lat) {
        ArrayList<ContentValues> mTotalValue = new ArrayList();
        try {
            URL url = new URL("http://api.openweathermap.org/data/2.5/forecast/daily?&APPID=" + "e0519b5bd55714d24ccf6f5186a0dc0b" + "&lat=" + lat + "&lon=" + lon + "&mode=xml&units=metric&cnt=" + 3);
            XmlPullParser parser = XmlPullParserFactory.newInstance().newPullParser();
            parser.setInput(url.openStream(), null);
            for (int parserEvent = parser.getEventType(); parserEvent != 1; parserEvent = parser.next()) {
                if (parserEvent == 2 && parser.getName().equals("time")) {
                    int checkStartTag = parserEvent;
                    ContentValues mContent = new ContentValues();
                    while (true) {
                        if (checkStartTag == 2 && parser.getName().equals("time")) {
                            mContent.put("day", parser.getAttributeValue(null, "day"));
                        } else if (checkStartTag == 2 && parser.getName().equals("symbol")) {
                            mContent.put("weather_Name", parser.getAttributeValue(null, "name"));
                            mContent.put("weather_Number", parser.getAttributeValue(null, "number"));
                        } else {
                            if (checkStartTag == 2) {
                                if (parser.getName().equals("precipitation")) {
                                    mContent.put("weather_Much", parser.getAttributeValue(null, "value"));
                                    mContent.put("weather_Type", parser.getAttributeValue(null, "type"));
                                }
                            }
                            if (checkStartTag == 2) {
                                if (parser.getName().equals("windDirection")) {
                                    mContent.put("wind_Direction", parser.getAttributeValue(null, "name"));
                                    mContent.put("wind_SortNumber", parser.getAttributeValue(null, "deg"));
                                    mContent.put("wind_SortCode", parser.getAttributeValue(null, "code"));
                                }
                            }
                            if (checkStartTag == 2) {
                                if (parser.getName().equals("windSpeed")) {
                                    mContent.put("wind_Speed", parser.getAttributeValue(null, "mps"));
                                    mContent.put("wind_Name", parser.getAttributeValue(null, "name"));
                                }
                            }
                            if (checkStartTag == 2 && parser.getName().equals("temperature")) {
                                mContent.put("temp_Min", parser.getAttributeValue(null, "min"));
                                mContent.put("temp_Max", parser.getAttributeValue(null, "max"));
                            } else if (checkStartTag != 2 || !parser.getName().equals("humidity")) {
                                if (checkStartTag == 2 && parser.getName().equals("clouds")) {
                                    break;
                                }
                            } else {
                                mContent.put("humidity", parser.getAttributeValue(null, "value"));
                                mContent.put("humidity_unit", parser.getAttributeValue(null, "unit"));
                            }
                        }
                        checkStartTag = parser.next();
                    }
                    mContent.put("Clouds_Sort", parser.getAttributeValue(null, "value"));
                    mContent.put("Clouds_Value", parser.getAttributeValue(null, "all"));
                    mContent.put("Clouds_Per", parser.getAttributeValue(null, "unit"));
                    mTotalValue.add(mContent);
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        return mTotalValue;
    }

    public void run() {
        super.run();
        if (VERSION.SDK_INT > 9) {
            StrictMode.setThreadPolicy(new Builder().permitAll().build());
        }
        this.mWeatehr = GetOpenWeather(this.lon, this.lat);
        Handler handler = this.mContext.handler;
        MainActivity mainActivity = this.mContext;
        handler.sendEmptyMessage(1);
    }
}
