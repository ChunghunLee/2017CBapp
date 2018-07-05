package com.chan.testapplication;

import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final int THREAD_HANDLER_SUCCESS_INFO = 1;
    Adapter adapter;
    public Handler handler = new C02715();
    String lat = "36.625";
    String lon = "127.457";
    private DrawerLayout mDrawerLayout;
    ForeCastManager mForeCast;
    MainActivity mThis;
    ArrayList<ContentValues> mWeatherData;
    ArrayList<WeatherInfo> mWeatherInfomation;
    TextView tv_WeatherInfo;
    ViewPager viewPager;

    class C02672 implements OnClickListener {

        class C02651 implements DialogInterface.OnClickListener {
            C02651() {
            }

            public void onClick(DialogInterface dialog, int id) {
                MainActivity.this.moveTaskToBack(true);
                MainActivity.this.finish();
                Process.killProcess(Process.myPid());
            }
        }

        class C02662 implements DialogInterface.OnClickListener {
            C02662() {
            }

            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        }

        C02672() {
        }

        public void onClick(View view) {
            Builder builder = new Builder(MainActivity.this);
            builder.setTitle((CharSequence) "알림");
            builder.setMessage((CharSequence) "정말 종료하시겠습니까?");
            builder.setCancelable(false);
            builder.setPositiveButton((CharSequence) "예", new C02651());
            builder.setNegativeButton((CharSequence) "아니오", new C02662());
            builder.create().show();
        }
    }

    class C02683 implements OnClickListener {
        C02683() {
        }

        public void onClick(View view) {
            MainActivity.this.sendEmail();
        }
    }

    class C02704 implements OnClickListener {

        class C02691 implements DialogInterface.OnClickListener {
            C02691() {
            }

            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        }

        C02704() {
        }

        public void onClick(View view) {
            MainActivity.this.Initialize();
            Builder builder = new Builder(MainActivity.this);
            builder.setTitle((CharSequence) "충청북도 날씨정보");
            builder.setMessage(MainActivity.this.tv_WeatherInfo.getText());
            builder.setCancelable(false);
            builder.setPositiveButton((CharSequence) "확인", new C02691());
            builder.create().show();
        }
    }

    class C02715 extends Handler {
        C02715() {
        }

        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 1:
                    MainActivity.this.mForeCast.getmWeather();
                    MainActivity.this.mWeatherData = MainActivity.this.mForeCast.getmWeather();
                    if (MainActivity.this.mWeatherData.size() == 0) {
                        MainActivity.this.tv_WeatherInfo.setText("데이터가 없습니다");
                    }
                    MainActivity.this.DataToInformation();
                    String data = "";
                    data = MainActivity.this.PrintValue();
                    MainActivity.this.DataChangedToHangeul();
                    MainActivity.this.tv_WeatherInfo.setText(data + MainActivity.this.PrintValue());
                    return;
                default:
                    return;
            }
        }
    }

    class C04201 implements OnNavigationItemSelectedListener {
        C04201() {
        }

        public boolean onNavigationItemSelected(MenuItem menuItem) {
            menuItem.setChecked(false);
            menuItem.setCheckable(false);
            MainActivity.this.mDrawerLayout.closeDrawers();
            Intent intent = new Intent(".SecondActivity");
            switch (menuItem.getItemId()) {
                case C0273R.id.nav_library:
                    intent.putExtra("num", 0);
                    MainActivity.this.startActivity(new Intent(intent));
                    break;
                case C0273R.id.nav_hospital:
                    intent.putExtra("num", 1);
                    MainActivity.this.startActivity(new Intent(intent));
                    break;
                case C0273R.id.nav_park:
                    intent.putExtra("num", 2);
                    MainActivity.this.startActivity(new Intent(intent));
                    break;
                case C0273R.id.nav_government_officer:
                    intent.putExtra("num", 3);
                    MainActivity.this.startActivity(new Intent(intent));
                    break;
                case C0273R.id.nav_police:
                    intent.putExtra("num", 4);
                    MainActivity.this.startActivity(new Intent(intent));
                    break;
                case C0273R.id.nav_bank:
                    intent.putExtra("num", 5);
                    MainActivity.this.startActivity(new Intent(intent));
                    break;
                case C0273R.id.nav_museum:
                    intent.putExtra("num", 6);
                    MainActivity.this.startActivity(new Intent(intent));
                    break;
                case C0273R.id.nav_version:
                    Toast.makeText(MainActivity.this, "Ver1.0", 1).show();
                    break;
            }
            return true;
        }
    }

    protected void sendEmail() {
        Log.i("Send email", "");
        String[] TO = new String[]{"wjdals3155@nate.com"};
        String[] CC = new String[]{""};
        Intent emailIntent = new Intent("android.intent.action.SEND");
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra("android.intent.extra.EMAIL", TO);
        emailIntent.putExtra("android.intent.extra.CC", CC);
        emailIntent.putExtra("android.intent.extra.SUBJECT", "제목");
        emailIntent.putExtra("android.intent.extra.TEXT", "문의내용을 입력해주세요.");
        try {
            startActivity(Intent.createChooser(emailIntent, "문의메일 보내기."));
            finish();
            Log.i("메일을 보냈습니다", "");
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, "해당 메일주소가 정확하지 않습니다.", 0).show();
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, SplashActivity.class));
        setContentView((int) C0273R.layout.activity_main);
        setSupportActionBar((Toolbar) findViewById(C0273R.id.toolbar));
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator((int) C0273R.drawable.ic_menu);
        actionBar.setDisplayHomeAsUpEnabled(true);
        this.viewPager = (ViewPager) findViewById(C0273R.id.view);
        this.adapter = new Adapter(this);
        this.viewPager.setAdapter(this.adapter);
        this.mDrawerLayout = (DrawerLayout) findViewById(C0273R.id.drawer_layout);
        ((NavigationView) findViewById(C0273R.id.navigation_view)).setNavigationItemSelectedListener(new C04201());
        ((ImageButton) findViewById(C0273R.id.ButtonBack)).setOnClickListener(new C02672());
        ((ImageButton) findViewById(C0273R.id.ButtonEmail)).setOnClickListener(new C02683());
        Initialize();
        ((ImageButton) findViewById(C0273R.id.ButtonWeather)).setOnClickListener(new C02704());
    }

    public void Initialize() {
        this.tv_WeatherInfo = (TextView) findViewById(C0273R.id.tv_WeatherInfo);
        this.mWeatherInfomation = new ArrayList();
        this.mThis = this;
        this.mForeCast = new ForeCastManager(this.lon, this.lat, this.mThis);
        this.mForeCast.run();
    }

    public String PrintValue() {
        String mData = "";
        for (int i = 0; i < this.mWeatherInfomation.size(); i++) {
            mData = (mData + ((WeatherInfo) this.mWeatherInfomation.get(i)).getWeather_Day() + "\r\n" + ((WeatherInfo) this.mWeatherInfomation.get(i)).getWeather_Name() + "\r\n" + ((WeatherInfo) this.mWeatherInfomation.get(i)).getClouds_Sort() + " /Cloud amount: " + ((WeatherInfo) this.mWeatherInfomation.get(i)).getClouds_Value() + ((WeatherInfo) this.mWeatherInfomation.get(i)).getClouds_Per() + "\r\n" + ((WeatherInfo) this.mWeatherInfomation.get(i)).getWind_Name() + " /WindSpeed: " + ((WeatherInfo) this.mWeatherInfomation.get(i)).getWind_Speed() + " mps\r\nMax: " + ((WeatherInfo) this.mWeatherInfomation.get(i)).getTemp_Max() + "℃ /Min: " + ((WeatherInfo) this.mWeatherInfomation.get(i)).getTemp_Min() + "℃\r\nHumidity: " + ((WeatherInfo) this.mWeatherInfomation.get(i)).getHumidity() + "%") + "\r\n----------------------------------------------\r\n";
        }
        return mData;
    }

    public void DataChangedToHangeul() {
        for (int i = 0; i < this.mWeatherInfomation.size(); i++) {
            this.mWeatherInfomation.set(i, new WeatherToHangeul((WeatherInfo) this.mWeatherInfomation.get(i)).getHangeulWeather());
        }
    }

    public void DataToInformation() {
        for (int i = 0; i < this.mWeatherData.size(); i++) {
            this.mWeatherInfomation.add(new WeatherInfo(String.valueOf(((ContentValues) this.mWeatherData.get(i)).get("weather_Name")), String.valueOf(((ContentValues) this.mWeatherData.get(i)).get("weather_Number")), String.valueOf(((ContentValues) this.mWeatherData.get(i)).get("weather_Much")), String.valueOf(((ContentValues) this.mWeatherData.get(i)).get("weather_Type")), String.valueOf(((ContentValues) this.mWeatherData.get(i)).get("wind_Direction")), String.valueOf(((ContentValues) this.mWeatherData.get(i)).get("wind_SortNumber")), String.valueOf(((ContentValues) this.mWeatherData.get(i)).get("wind_SortCode")), String.valueOf(((ContentValues) this.mWeatherData.get(i)).get("wind_Speed")), String.valueOf(((ContentValues) this.mWeatherData.get(i)).get("wind_Name")), String.valueOf(((ContentValues) this.mWeatherData.get(i)).get("temp_Min")), String.valueOf(((ContentValues) this.mWeatherData.get(i)).get("temp_Max")), String.valueOf(((ContentValues) this.mWeatherData.get(i)).get("humidity")), String.valueOf(((ContentValues) this.mWeatherData.get(i)).get("Clouds_Value")), String.valueOf(((ContentValues) this.mWeatherData.get(i)).get("Clouds_Sort")), String.valueOf(((ContentValues) this.mWeatherData.get(i)).get("Clouds_Per")), String.valueOf(((ContentValues) this.mWeatherData.get(i)).get("day"))));
        }
    }

    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(C0273R.id.drawer_layout);
        if (drawer.isDrawerOpen((int) GravityCompat.START)) {
            drawer.closeDrawer((int) GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0273R.menu.question_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 16908332:
                this.mDrawerLayout.openDrawer((int) GravityCompat.START);
                return true;
            case C0273R.id.action_question:
                startActivityForResult(new Intent(getApplicationContext(), QuestionActivity.class), 1);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
