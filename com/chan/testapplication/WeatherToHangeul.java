package com.chan.testapplication;

import android.content.ContentValues;
import com.chan.testapplication.WeatherConditionList.WeatherCondition;

public class WeatherToHangeul {
    WeatherConditionList mCondition = new WeatherConditionList();
    ContentValues mData;
    WeatherInfo mWeatherInfo;

    public WeatherToHangeul(WeatherInfo tData) {
        this.mWeatherInfo = tData;
        this.mWeatherInfo.setClouds_Sort(Hangeul_Weather(this.mWeatherInfo.clouds_Sort));
        this.mWeatherInfo.setWeather_Name(Hangeul_Weather(this.mWeatherInfo.weather_Number));
        this.mWeatherInfo.setWind_Name(Hangeul_Weather(this.mWeatherInfo.wind_Name));
    }

    public WeatherInfo getHangeulWeather() {
        return this.mWeatherInfo;
    }

    public String SnowToHangeul(String weatherNumber) {
        int i = 0;
        while (i < this.mCondition.mListSnow.size()) {
            if (((WeatherCondition) this.mCondition.mListSnow.get(i)).getId().equals(weatherNumber) || ((WeatherCondition) this.mCondition.mListSnow.get(i)).getMeaning().equals(weatherNumber)) {
                return ((WeatherCondition) this.mCondition.mListSnowToHangeul.get(i)).getMeaning();
            }
            i++;
        }
        return "";
    }

    public String ClearToHangeul(String weatherNumber) {
        int i = 0;
        while (i < this.mCondition.mListClearSky.size()) {
            if (((WeatherCondition) this.mCondition.mListClearSky.get(i)).getId().equals(weatherNumber) || ((WeatherCondition) this.mCondition.mListClearSky.get(i)).getMeaning().equals(weatherNumber.toLowerCase())) {
                return ((WeatherCondition) this.mCondition.mListClearSkyToHangeul.get(i)).getMeaning();
            }
            i++;
        }
        return "";
    }

    public String BrokenCloudsToHangeul(String weatherNumber) {
        int i = 0;
        while (i < this.mCondition.mListBroken_Clouds.size()) {
            if (((WeatherCondition) this.mCondition.mListBroken_Clouds.get(i)).getId().equals(weatherNumber) || ((WeatherCondition) this.mCondition.mListBroken_Clouds.get(i)).getMeaning().equals(weatherNumber.toLowerCase())) {
                return ((WeatherCondition) this.mCondition.mListBroken_CloudsToHangeul.get(i)).getMeaning();
            }
            i++;
        }
        return "";
    }

    public String FewCloudsToHangeul(String weatherNumber) {
        int i = 0;
        while (i < this.mCondition.mListFew_Clouds.size()) {
            if (((WeatherCondition) this.mCondition.mListFew_Clouds.get(i)).getId().equals(weatherNumber) || ((WeatherCondition) this.mCondition.mListFew_Clouds.get(i)).getMeaning().equals(weatherNumber.toLowerCase())) {
                return ((WeatherCondition) this.mCondition.mListFew_CloudsToHangeul.get(i)).getMeaning();
            }
            i++;
        }
        return "";
    }

    public String ScatteredCloudsToHangeul(String weatherNumber) {
        int i = 0;
        while (i < this.mCondition.mListScattered_Clouds.size()) {
            if (((WeatherCondition) this.mCondition.mListScattered_Clouds.get(i)).getId().equals(weatherNumber) || ((WeatherCondition) this.mCondition.mListScattered_Clouds.get(i)).getMeaning().equals(weatherNumber.toLowerCase())) {
                return ((WeatherCondition) this.mCondition.mListScattered_CloudsToHangeul.get(i)).getMeaning();
            }
            i++;
        }
        return "";
    }

    public String RainToHangeul(String weatherNumber) {
        int i = 0;
        while (i < this.mCondition.mListRain.size()) {
            if (((WeatherCondition) this.mCondition.mListRain.get(i)).getId().equals(weatherNumber) || ((WeatherCondition) this.mCondition.mListRain.get(i)).getMeaning().equals(weatherNumber.toLowerCase())) {
                return ((WeatherCondition) this.mCondition.mListRainToHangeul.get(i)).getMeaning();
            }
            i++;
        }
        return "";
    }

    public String ShowerRainToHanGeul(String weatherNumber) {
        int i = 0;
        while (i < this.mCondition.mListShower_Rain.size()) {
            if (((WeatherCondition) this.mCondition.mListShower_Rain.get(i)).getId().equals(weatherNumber) || ((WeatherCondition) this.mCondition.mListShower_Rain.get(i)).getMeaning().equals(weatherNumber.toLowerCase())) {
                return ((WeatherCondition) this.mCondition.mListShower_RainToHangeul.get(i)).getMeaning();
            }
            i++;
        }
        return "";
    }

    public String ThunderStromToHangeul(String weatherNumber) {
        int i = 0;
        while (i < this.mCondition.mListThunderStorm.size()) {
            if (((WeatherCondition) this.mCondition.mListThunderStorm.get(i)).getId().equals(weatherNumber) || ((WeatherCondition) this.mCondition.mListThunderStorm.get(i)).getMeaning().equals(weatherNumber.toLowerCase())) {
                return ((WeatherCondition) this.mCondition.mListThunderStormToHangeul.get(i)).getMeaning();
            }
            i++;
        }
        return "";
    }

    public String MistToHangeul(String weatherNumber) {
        int i = 0;
        while (i < this.mCondition.mListMist.size()) {
            if (((WeatherCondition) this.mCondition.mListMist.get(i)).getId().equals(weatherNumber) || ((WeatherCondition) this.mCondition.mListMist.get(i)).getMeaning().equals(weatherNumber.toLowerCase())) {
                return ((WeatherCondition) this.mCondition.mListMistToHangeul.get(i)).getMeaning();
            }
            i++;
        }
        return "";
    }

    public String WindToHangeul(String windName) {
        int i = 0;
        while (i < this.mCondition.mListWind.size()) {
            if (((WeatherCondition) this.mCondition.mListWind.get(i)).getId().equals(windName) || ((WeatherCondition) this.mCondition.mListWind.get(i)).getMeaning().equals(windName.toLowerCase())) {
                return ((WeatherCondition) this.mCondition.mListWindToHangeul.get(i)).getMeaning();
            }
            i++;
        }
        return "";
    }

    public String Hangeul_Weather(String mWeatherNumber) {
        String snow = SnowToHangeul(mWeatherNumber);
        String clear = ClearToHangeul(mWeatherNumber);
        String broken_Cloud = BrokenCloudsToHangeul(mWeatherNumber);
        String few_Cloud = FewCloudsToHangeul(mWeatherNumber);
        String scatter = ScatteredCloudsToHangeul(mWeatherNumber);
        String Rain = RainToHangeul(mWeatherNumber);
        String shower = ShowerRainToHanGeul(mWeatherNumber);
        String thunder = ThunderStromToHangeul(mWeatherNumber);
        String mist = MistToHangeul(mWeatherNumber);
        String wind = WindToHangeul(mWeatherNumber);
        if (!snow.equals("")) {
            return snow;
        }
        if (!clear.equals("")) {
            return clear;
        }
        if (!broken_Cloud.equals("")) {
            return broken_Cloud;
        }
        if (!few_Cloud.equals("")) {
            return few_Cloud;
        }
        if (!scatter.equals("")) {
            return scatter;
        }
        if (!Rain.equals("")) {
            return Rain;
        }
        if (!shower.equals("")) {
            return shower;
        }
        if (!thunder.equals("")) {
            return thunder;
        }
        if (!mist.equals("")) {
            return mist;
        }
        if (wind.equals("")) {
            return "정보없음";
        }
        return wind;
    }
}
