package com.chan.testapplication;

public class WeatherInfo {
    String clouds_Per;
    String clouds_Sort;
    String clouds_Value;
    String humidity;
    String temp_Max;
    String temp_Min;
    String weather_Day;
    String weather_Much;
    String weather_Name;
    String weather_Number;
    String weather_Type;
    String wind_Direction;
    String wind_Name;
    String wind_SortCode;
    String wind_SortNumber;
    String wind_Speed;

    public WeatherInfo(String weather_Name, String weather_Number, String weather_Much, String weather_Type, String wind_Direction, String wind_SortNumber, String wind_SortCode, String wind_Speed, String wind_Name, String temp_Min, String temp_Max, String humidity, String clouds_Value, String clouds_Sort, String clouds_Per, String weather_Day) {
        this.weather_Name = weather_Name;
        this.weather_Number = weather_Number;
        this.weather_Much = weather_Much;
        this.weather_Type = weather_Type;
        this.wind_Direction = wind_Direction;
        this.wind_SortNumber = wind_SortNumber;
        this.wind_SortCode = wind_SortCode;
        this.wind_Speed = wind_Speed;
        if (wind_Name.equals("")) {
            this.wind_Name = "No Info";
        } else {
            this.wind_Name = wind_Name;
        }
        this.temp_Min = temp_Min;
        this.temp_Max = temp_Max;
        this.humidity = humidity;
        this.clouds_Value = clouds_Value;
        this.clouds_Sort = clouds_Sort;
        this.clouds_Per = clouds_Per;
        this.weather_Day = weather_Day;
    }

    public String getWeather_Name() {
        return this.weather_Name;
    }

    public String getWind_Speed() {
        return this.wind_Speed;
    }

    public String getWind_Name() {
        return this.wind_Name;
    }

    public String getTemp_Min() {
        return this.temp_Min;
    }

    public String getTemp_Max() {
        return this.temp_Max;
    }

    public String getHumidity() {
        return this.humidity;
    }

    public String getClouds_Value() {
        return this.clouds_Value;
    }

    public String getClouds_Sort() {
        return this.clouds_Sort;
    }

    public String getClouds_Per() {
        return this.clouds_Per;
    }

    public String getWeather_Day() {
        return this.weather_Day;
    }

    public void setWeather_Name(String weather_Name) {
        this.weather_Name = weather_Name;
    }

    public void setWind_Name(String wind_Name) {
        this.wind_Name = wind_Name;
    }

    public void setClouds_Sort(String clouds_Sort) {
        this.clouds_Sort = clouds_Sort;
    }
}
