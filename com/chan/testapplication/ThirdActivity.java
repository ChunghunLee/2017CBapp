package com.chan.testapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0273R.menu.blank_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 16908332:
                finish();
                return true;
            case C0273R.id.action_blank:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0273R.layout.activity_third);
        setSupportActionBar((Toolbar) findViewById(C0273R.id.toolbar));
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator((int) C0273R.drawable.ic_back);
        actionBar.setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        String place_name = intent.getExtras().getString("place_name");
        String place_addr = intent.getExtras().getString("place_addr");
        final String place_PhoneNumber = intent.getExtras().getString("place_PhoneNumber");
        final String place_UrlName = intent.getExtras().getString("place_UrlName");
        Bitmap place_Photo = (Bitmap) intent.getParcelableExtra("place_Photo");
        ImageButton dialButton = (ImageButton) findViewById(C0273R.id.imageButtonView_dial);
        ImageButton searchingButton = (ImageButton) findViewById(C0273R.id.imageButtonView_search);
        String[] items = new String[]{"장소명:\n" + place_name, "주소:\n" + place_addr, "전화번호:\n" + place_PhoneNumber, "Url:\n" + place_UrlName};
        if (place_name == null) {
            items[0] = "장소 정보가 없습니다.\n";
        }
        if (place_addr == null) {
            items[1] = "주소 정보가 없습니다.\n";
        }
        if (place_PhoneNumber == null) {
            items[2] = "전화번호 정보가 없습니다.\n";
        }
        if (place_UrlName == null) {
            items[3] = "Url 정보가 없습니다.\n";
        }
        ((ListView) findViewById(C0273R.id.listView2)).setAdapter(new ArrayAdapter(this, C0273R.layout.wordtype, items));
        final String tel = "tel:" + place_PhoneNumber;
        dialButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (place_PhoneNumber != null) {
                    ThirdActivity.this.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel)));
                } else {
                    Toast.makeText(ThirdActivity.this, "전화번호 정보가 없습니다.", 1).show();
                }
            }
        });
        searchingButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (place_UrlName != null) {
                    ThirdActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(place_UrlName)));
                } else {
                    Toast.makeText(ThirdActivity.this, "url 정보가 없습니다.", 1).show();
                }
            }
        });
    }
}
