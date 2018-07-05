package com.chan.testapplication;

import java.util.ArrayList;

public class WeatherConditionList {
    public ArrayList<WeatherCondition> mListBroken_Clouds = new ArrayList();
    public ArrayList<WeatherCondition> mListBroken_CloudsToHangeul = new ArrayList();
    public ArrayList<WeatherCondition> mListClearSky = new ArrayList();
    public ArrayList<WeatherCondition> mListClearSkyToHangeul = new ArrayList();
    public ArrayList<WeatherCondition> mListFew_Clouds = new ArrayList();
    public ArrayList<WeatherCondition> mListFew_CloudsToHangeul = new ArrayList();
    public ArrayList<WeatherCondition> mListMist = new ArrayList();
    public ArrayList<WeatherCondition> mListMistToHangeul = new ArrayList();
    public ArrayList<WeatherCondition> mListRain = new ArrayList();
    public ArrayList<WeatherCondition> mListRainToHangeul = new ArrayList();
    public ArrayList<WeatherCondition> mListScattered_Clouds = new ArrayList();
    public ArrayList<WeatherCondition> mListScattered_CloudsToHangeul = new ArrayList();
    public ArrayList<WeatherCondition> mListShower_Rain = new ArrayList();
    public ArrayList<WeatherCondition> mListShower_RainToHangeul = new ArrayList();
    public ArrayList<WeatherCondition> mListSnow = new ArrayList();
    public ArrayList<WeatherCondition> mListSnowToHangeul = new ArrayList();
    public ArrayList<WeatherCondition> mListThunderStorm = new ArrayList();
    public ArrayList<WeatherCondition> mListThunderStormToHangeul = new ArrayList();
    public ArrayList<WeatherCondition> mListWind = new ArrayList();
    public ArrayList<WeatherCondition> mListWindDirection = new ArrayList();
    public ArrayList<WeatherCondition> mListWindDirectionToHangeul = new ArrayList();
    public ArrayList<WeatherCondition> mListWindToHangeul = new ArrayList();

    public class WeatherCondition {
        String id;
        String meaning;

        public WeatherCondition(String id, String meaning) {
            this.id = id;
            this.meaning = meaning;
        }

        public String getId() {
            return this.id;
        }

        public String getMeaning() {
            return this.meaning;
        }
    }

    public WeatherConditionList() {
        this.mListThunderStorm.add(new WeatherCondition("200", "thunderstorm with light rain"));
        this.mListThunderStorm.add(new WeatherCondition("201", "thunderstorm with rain"));
        this.mListThunderStorm.add(new WeatherCondition("202", "thunderstorm with heavy rain"));
        this.mListThunderStorm.add(new WeatherCondition("210", "light thunderstorm"));
        this.mListThunderStorm.add(new WeatherCondition("211", "thunderstorm"));
        this.mListThunderStorm.add(new WeatherCondition("212", "heavy thunderstorm"));
        this.mListThunderStorm.add(new WeatherCondition("221", "ragged thunderstorm"));
        this.mListThunderStorm.add(new WeatherCondition("230", "thunderstorm with light drizzle"));
        this.mListThunderStorm.add(new WeatherCondition("231", "thunderstorm with drizzle"));
        this.mListThunderStorm.add(new WeatherCondition("232", "thunderstorm with heavy drizzle"));
        this.mListThunderStormToHangeul.add(new WeatherCondition("200", "번개와 보슬비"));
        this.mListThunderStormToHangeul.add(new WeatherCondition("201", "번개와 비"));
        this.mListThunderStormToHangeul.add(new WeatherCondition("202", "번개와 집중 호우"));
        this.mListThunderStormToHangeul.add(new WeatherCondition("210", "천둥"));
        this.mListThunderStormToHangeul.add(new WeatherCondition("211", "천둥 번개"));
        this.mListThunderStormToHangeul.add(new WeatherCondition("212", "강한 천둥 번개"));
        this.mListThunderStormToHangeul.add(new WeatherCondition("221", "매우 강한 천둥 번개"));
        this.mListThunderStormToHangeul.add(new WeatherCondition("230", "번개와 가벼운 이슬비"));
        this.mListThunderStormToHangeul.add(new WeatherCondition("231", "번개와 이슬비"));
        this.mListThunderStormToHangeul.add(new WeatherCondition("232", "번개와 집중 호우"));
        this.mListShower_Rain.add(new WeatherCondition("300", "light intensity drizzle"));
        this.mListShower_Rain.add(new WeatherCondition("301", "drizzle"));
        this.mListShower_Rain.add(new WeatherCondition("302", "heavy intensity drizzle"));
        this.mListShower_Rain.add(new WeatherCondition("310", "light intensity drizzle rain"));
        this.mListShower_Rain.add(new WeatherCondition("311", "drizzle rain"));
        this.mListShower_Rain.add(new WeatherCondition("312", "heavy intensity drizzle rain"));
        this.mListShower_Rain.add(new WeatherCondition("313", "shower rain and drizzle"));
        this.mListShower_Rain.add(new WeatherCondition("314", "heavy shower rain and drizzle"));
        this.mListShower_Rain.add(new WeatherCondition("321", "shower drizzle"));
        this.mListShower_RainToHangeul.add(new WeatherCondition("300", "약한 이슬비"));
        this.mListShower_RainToHangeul.add(new WeatherCondition("301", "이슬비"));
        this.mListShower_RainToHangeul.add(new WeatherCondition("302", "강한 이슬비"));
        this.mListShower_RainToHangeul.add(new WeatherCondition("310", "약한 이슬비"));
        this.mListShower_RainToHangeul.add(new WeatherCondition("311", "이슬비"));
        this.mListShower_RainToHangeul.add(new WeatherCondition("312", "강한 이슬비"));
        this.mListShower_RainToHangeul.add(new WeatherCondition("313", "소나기"));
        this.mListShower_RainToHangeul.add(new WeatherCondition("314", "강한 소나기"));
        this.mListShower_RainToHangeul.add(new WeatherCondition("321", "소나기"));
        this.mListRain.add(new WeatherCondition("500", "light rain"));
        this.mListRain.add(new WeatherCondition("501", "moderate rain"));
        this.mListRain.add(new WeatherCondition("502", "heavy intensity rain"));
        this.mListRain.add(new WeatherCondition("503", "very heavy rain"));
        this.mListRain.add(new WeatherCondition("504", "extreme rain"));
        this.mListSnow.add(new WeatherCondition("511", "freezing rain"));
        this.mListShower_Rain.add(new WeatherCondition("520", "light intensity shower rain"));
        this.mListShower_Rain.add(new WeatherCondition("521", "shower rain"));
        this.mListShower_Rain.add(new WeatherCondition("522", "heavy intensity shower rain"));
        this.mListShower_Rain.add(new WeatherCondition("531", "ragged shower rain"));
        this.mListRainToHangeul.add(new WeatherCondition("500", "가벼운 비"));
        this.mListRainToHangeul.add(new WeatherCondition("501", "비"));
        this.mListRainToHangeul.add(new WeatherCondition("502", "강한 비"));
        this.mListRainToHangeul.add(new WeatherCondition("503", "집중 호우"));
        this.mListRainToHangeul.add(new WeatherCondition("504", "집중 호우"));
        this.mListSnowToHangeul.add(new WeatherCondition("511", "어는 비"));
        this.mListShower_RainToHangeul.add(new WeatherCondition("520", "가벼운 소나기"));
        this.mListShower_RainToHangeul.add(new WeatherCondition("521", "소나기"));
        this.mListShower_RainToHangeul.add(new WeatherCondition("522", "강한 소나기"));
        this.mListShower_RainToHangeul.add(new WeatherCondition("531", "매우 강한 소나기"));
        this.mListSnow.add(new WeatherCondition("600", "light snow"));
        this.mListSnow.add(new WeatherCondition("601", "snow"));
        this.mListSnow.add(new WeatherCondition("602", "heavy snow"));
        this.mListSnow.add(new WeatherCondition("611", "sleet"));
        this.mListSnow.add(new WeatherCondition("612", "shower sleet"));
        this.mListSnow.add(new WeatherCondition("615", "light rain and snow"));
        this.mListSnow.add(new WeatherCondition("616", "rain and snow"));
        this.mListSnow.add(new WeatherCondition("620", "light shower snow"));
        this.mListSnow.add(new WeatherCondition("621", "shower snow"));
        this.mListSnow.add(new WeatherCondition("622", "heavy shower snow"));
        this.mListSnowToHangeul.add(new WeatherCondition("600", "약한 눈"));
        this.mListSnowToHangeul.add(new WeatherCondition("601", "눈"));
        this.mListSnowToHangeul.add(new WeatherCondition("602", "거센 눈"));
        this.mListSnowToHangeul.add(new WeatherCondition("611", "진눈 깨비"));
        this.mListSnowToHangeul.add(new WeatherCondition("612", "급 진눈 깨비"));
        this.mListSnowToHangeul.add(new WeatherCondition("615", "약한 눈과 비"));
        this.mListSnowToHangeul.add(new WeatherCondition("616", "눈과 비"));
        this.mListSnowToHangeul.add(new WeatherCondition("620", "눈"));
        this.mListSnowToHangeul.add(new WeatherCondition("621", "소낙눈"));
        this.mListSnowToHangeul.add(new WeatherCondition("622", "강한 소낙눈"));
        this.mListMist.add(new WeatherCondition("701", "mist"));
        this.mListMist.add(new WeatherCondition("711", "smoke"));
        this.mListMist.add(new WeatherCondition("721", "haze"));
        this.mListMist.add(new WeatherCondition("731", "sand, dust whirls"));
        this.mListMist.add(new WeatherCondition("741", "fog"));
        this.mListMist.add(new WeatherCondition("751", "sand"));
        this.mListMist.add(new WeatherCondition("761", "dust"));
        this.mListMist.add(new WeatherCondition("762", "volcanic ash"));
        this.mListMist.add(new WeatherCondition("771", "squalls"));
        this.mListMist.add(new WeatherCondition("781", "tornado"));
        this.mListMistToHangeul.add(new WeatherCondition("701", "안개"));
        this.mListMistToHangeul.add(new WeatherCondition("711", "연기"));
        this.mListMistToHangeul.add(new WeatherCondition("721", "실안개"));
        this.mListMistToHangeul.add(new WeatherCondition("731", "황사 바람"));
        this.mListMistToHangeul.add(new WeatherCondition("741", "안개"));
        this.mListMistToHangeul.add(new WeatherCondition("751", "황사"));
        this.mListMistToHangeul.add(new WeatherCondition("761", "황사"));
        this.mListMistToHangeul.add(new WeatherCondition("762", "화산재"));
        this.mListMistToHangeul.add(new WeatherCondition("771", "돌풍"));
        this.mListMistToHangeul.add(new WeatherCondition("781", "태풍"));
        this.mListClearSky.add(new WeatherCondition("800", "clear sky"));
        this.mListFew_Clouds.add(new WeatherCondition("801", "few clouds"));
        this.mListScattered_Clouds.add(new WeatherCondition("802", "scattered clouds"));
        this.mListBroken_Clouds.add(new WeatherCondition("803", "broken clouds"));
        this.mListBroken_Clouds.add(new WeatherCondition("804", "overcast clouds"));
        this.mListClearSkyToHangeul.add(new WeatherCondition("800", "맑은 하늘"));
        this.mListFew_CloudsToHangeul.add(new WeatherCondition("801", "구름 조금"));
        this.mListScattered_CloudsToHangeul.add(new WeatherCondition("802", "조각 구름"));
        this.mListBroken_CloudsToHangeul.add(new WeatherCondition("803", "조각 구름"));
        this.mListBroken_CloudsToHangeul.add(new WeatherCondition("804", "흐림"));
        this.mListWind.add(new WeatherCondition("951", "calm"));
        this.mListWind.add(new WeatherCondition("952", "light breeze"));
        this.mListWind.add(new WeatherCondition("953", "gentle breeze"));
        this.mListWind.add(new WeatherCondition("954", "moderate breeze"));
        this.mListWind.add(new WeatherCondition("955", "fresh breeze"));
        this.mListWind.add(new WeatherCondition("956", "strong breeze"));
        this.mListWind.add(new WeatherCondition("957", "high wind, near gale"));
        this.mListWind.add(new WeatherCondition("958", "gale"));
        this.mListWind.add(new WeatherCondition("959", "severe gale"));
        this.mListWind.add(new WeatherCondition("960", "storm"));
        this.mListWind.add(new WeatherCondition("961", "violent storm"));
        this.mListWind.add(new WeatherCondition("962", "hurricane"));
        this.mListWindToHangeul.add(new WeatherCondition("951", "바람 없음"));
        this.mListWindToHangeul.add(new WeatherCondition("952", "남실 바람"));
        this.mListWindToHangeul.add(new WeatherCondition("953", "산들 바람"));
        this.mListWindToHangeul.add(new WeatherCondition("954", "건들 바람"));
        this.mListWindToHangeul.add(new WeatherCondition("955", "흔들 바람"));
        this.mListWindToHangeul.add(new WeatherCondition("956", "된바람"));
        this.mListWindToHangeul.add(new WeatherCondition("957", "센바람"));
        this.mListWindToHangeul.add(new WeatherCondition("958", "강풍"));
        this.mListWindToHangeul.add(new WeatherCondition("959", "극심한 강풍"));
        this.mListWindToHangeul.add(new WeatherCondition("960", "폭풍우"));
        this.mListWindToHangeul.add(new WeatherCondition("961", "폭풍"));
        this.mListWindToHangeul.add(new WeatherCondition("962", "허리케인"));
    }
}
