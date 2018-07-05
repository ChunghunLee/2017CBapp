package com.chan.testapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class NavigationDrawer extends AppCompatActivity implements OnNavigationItemSelectedListener {

    class C02721 implements OnClickListener {
        C02721() {
        }

        public void onClick(View view) {
            Snackbar.make(view, (CharSequence) "Replace with your own action", 0).setAction((CharSequence) "Action", null).show();
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0273R.layout.activity_navigation_drawer);
        Toolbar toolbar = (Toolbar) findViewById(C0273R.id.toolbar);
        setSupportActionBar(toolbar);
        ((FloatingActionButton) findViewById(C0273R.id.fab)).setOnClickListener(new C02721());
        DrawerLayout drawer = (DrawerLayout) findViewById(C0273R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, C0273R.string.navigation_drawer_open, C0273R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        ((NavigationView) findViewById(C0273R.id.nav_view)).setNavigationItemSelectedListener(this);
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
        getMenuInflater().inflate(C0273R.menu.navigation_drawer, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == C0273R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (!(id == C0273R.id.nav_library || id == C0273R.id.nav_hospital || id == C0273R.id.nav_park || id == C0273R.id.nav_government_officer || id != C0273R.id.nav_police)) {
        }
        ((DrawerLayout) findViewById(C0273R.id.drawer_layout)).closeDrawer((int) GravityCompat.START);
        return true;
    }
}
