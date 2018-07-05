package com.chan.testapplication;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.places.PlaceBuffer;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import noman.googleplaces.NRPlaces.Builder;
import noman.googleplaces.Place;
import noman.googleplaces.PlaceType;
import noman.googleplaces.PlacesException;
import noman.googleplaces.PlacesListener;

public class SecondActivity extends AppCompatActivity implements OnMapReadyCallback, ConnectionCallbacks, OnConnectionFailedListener, LocationListener, PlacesListener {
    private static final LatLng DEFAULT_LOCATION = new LatLng(36.625d, 127.457d);
    private static final int FASTEST_UPDATE_INTERVAL_MS = 50000;
    private static final int GPS_ENABLE_REQUEST_CODE = 2001;
    private static final int PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 2002;
    private static final String TAG = "googlemap_example";
    private static final int UPDATE_INTERVAL_MS = 50000;
    CustomAdapter adapter;
    boolean askPermissionOnceAgain = false;
    private Marker currentMarker = null;
    LatLng currentPosition;
    ListView listView;
    private AppCompatActivity mActivity;
    private GoogleApiClient mGoogleApiClient = null;
    private GoogleMap mGoogleMap = null;
    int num = 0;
    List<Marker> previous_marker = null;
    boolean search_enable = false;

    class C02752 implements Runnable {
        C02752() {
        }

        public void run() {
            SecondActivity.this.progressOFF();
        }
    }

    class C02763 implements TextWatcher {
        C02763() {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        public void afterTextChanged(Editable editable) {
            ((CustomAdapter) SecondActivity.this.listView.getAdapter()).getFilter().filter(editable.toString());
        }
    }

    class C02785 implements OnClickListener {
        C02785() {
        }

        public void onClick(DialogInterface dialog, int id) {
            ActivityCompat.requestPermissions(SecondActivity.this.mActivity, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, SecondActivity.PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION);
        }
    }

    class C02796 implements OnClickListener {
        C02796() {
        }

        public void onClick(DialogInterface dialog, int id) {
            SecondActivity.this.finish();
        }
    }

    class C02807 implements OnClickListener {
        C02807() {
        }

        public void onClick(DialogInterface dialog, int id) {
            ActivityCompat.requestPermissions(SecondActivity.this.mActivity, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, SecondActivity.PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION);
        }
    }

    class C02818 implements OnClickListener {
        C02818() {
        }

        public void onClick(DialogInterface dialog, int id) {
            SecondActivity.this.finish();
        }
    }

    class C02829 implements OnClickListener {
        C02829() {
        }

        public void onClick(DialogInterface dialog, int id) {
            SecondActivity.this.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), SecondActivity.GPS_ENABLE_REQUEST_CODE);
        }
    }

    public void showPlaceInformation(LatLng location, int n) {
        this.mGoogleMap.clear();
        if (this.previous_marker != null) {
            this.previous_marker.clear();
        }
        switch (n) {
            case 0:
                new Builder().listener(this).key("AIzaSyDcgbEhO0029xttzefB4Kk0Bc-hKa655K8").latlng(location.latitude, location.longitude).type(PlaceType.LIBRARY).radius(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).build().execute(new Void[0]);
                return;
            case 1:
                new Builder().listener(this).key("AIzaSyDcgbEhO0029xttzefB4Kk0Bc-hKa655K8").latlng(location.latitude, location.longitude).type(PlaceType.HOSPITAL).radius(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).build().execute(new Void[0]);
                return;
            case 2:
                new Builder().listener(this).key("AIzaSyDcgbEhO0029xttzefB4Kk0Bc-hKa655K8").latlng(location.latitude, location.longitude).type(PlaceType.PARK).radius(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).build().execute(new Void[0]);
                return;
            case 3:
                new Builder().listener(this).key("AIzaSyDcgbEhO0029xttzefB4Kk0Bc-hKa655K8").latlng(location.latitude, location.longitude).type(PlaceType.LOCAL_GOVERNMENT_OFFICE).radius(2500).build().execute(new Void[0]);
                return;
            case 4:
                new Builder().listener(this).key("AIzaSyDcgbEhO0029xttzefB4Kk0Bc-hKa655K8").latlng(location.latitude, location.longitude).type(PlaceType.POLICE).radius(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).build().execute(new Void[0]);
                return;
            case 5:
                new Builder().listener(this).key("AIzaSyDcgbEhO0029xttzefB4Kk0Bc-hKa655K8").latlng(location.latitude, location.longitude).type(PlaceType.BANK).radius(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).build().execute(new Void[0]);
                return;
            case 6:
                new Builder().listener(this).key("AIzaSyDcgbEhO0029xttzefB4Kk0Bc-hKa655K8").latlng(location.latitude, location.longitude).type(PlaceType.MUSEUM).radius(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).build().execute(new Void[0]);
                return;
            default:
                return;
        }
    }

    public void onPlacesFailure(PlacesException e) {
    }

    public void onPlacesStart() {
    }

    public void onPlacesSuccess(List<Place> places) {
        final String[] UrlName = new String[places.size()];
        final String[] PhoneNumber = new String[places.size()];
        final String[] items = new String[places.size()];
        final String[] address = new String[places.size()];
        final Place[] item_place = new Place[places.size()];
        final Bitmap[] place_image = new Bitmap[places.size()];
        final List<Place> list = places;
        runOnUiThread(new Runnable() {
            public void run() {
                SecondActivity.this.listView = (ListView) SecondActivity.this.findViewById(C0273R.id.listView);
                SecondActivity.this.adapter = new CustomAdapter(SecondActivity.this, item_place, PhoneNumber, UrlName, address, place_image, SecondActivity.this.mGoogleMap);
                int count = 0;
                for (Place place : list) {
                    item_place[count] = place;
                    LatLng latLng = new LatLng(place.getLatitude(), place.getLongitude());
                    MarkerOptions markerOptions = new MarkerOptions();
                    markerOptions.position(latLng);
                    markerOptions.title(place.getName());
                    markerOptions.snippet(place.getVicinity());
                    Marker item = SecondActivity.this.mGoogleMap.addMarker(markerOptions);
                    final int countNum = count;
                    Places.GeoDataApi.getPlaceById(SecondActivity.this.mGoogleApiClient, place.getPlaceId()).setResultCallback(new ResultCallback<PlaceBuffer>() {
                        public void onResult(@NonNull PlaceBuffer places) {
                            if (!places.getStatus().isSuccess() || places.getCount() <= 0) {
                                Log.e(SecondActivity.TAG, "Place not found");
                            } else {
                                com.google.android.gms.location.places.Place myPlace = places.get(0);
                                Log.i(SecondActivity.TAG, "Place found:" + myPlace.getName());
                                address[countNum] = myPlace.getAddress().toString();
                                PhoneNumber[countNum] = myPlace.getPhoneNumber().toString();
                                if (myPlace.getWebsiteUri() != null) {
                                    UrlName[countNum] = myPlace.getWebsiteUri().toString();
                                }
                                Log.e(SecondActivity.TAG, PhoneNumber[countNum]);
                            }
                            places.release();
                        }
                    });
                    int count2 = count + 1;
                    items[count] = item.getTitle();
                    SecondActivity.this.previous_marker.add(item);
                    item.showInfoWindow();
                    count = count2;
                }
                SecondActivity.this.adapter.addItem();
                SecondActivity.this.listView.setAdapter(SecondActivity.this.adapter);
                HashSet<Marker> hashSet = new HashSet();
                hashSet.addAll(SecondActivity.this.previous_marker);
                SecondActivity.this.previous_marker.clear();
                SecondActivity.this.previous_marker.addAll(hashSet);
            }
        });
    }

    public void onPlacesFinished() {
    }

    public void startProgress() {
        progressON(" 검색중...");
        new Handler().postDelayed(new C02752(), 3500);
    }

    public void progressON() {
        LoadingApp.getInstance().progressON(this, null);
    }

    public void progressON(String message) {
        LoadingApp.getInstance().progressON(this, message);
    }

    public void progressOFF() {
        LoadingApp.getInstance().progressOFF();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0273R.menu.navigation_drawer, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 16908332:
                finish();
                return true;
            case C0273R.id.action_settings:
                MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(C0273R.id.map);
                LayoutParams lp = (LayoutParams) mapFragment.getView().getLayoutParams();
                EditText editText = (EditText) findViewById(C0273R.id.editText);
                TextView textView = (TextView) findViewById(C0273R.id.textView_search);
                Switch switchView = (Switch) findViewById(C0273R.id.switch1);
                TextView textView2 = (TextView) findViewById(C0273R.id.textView4);
                if (this.search_enable) {
                    lp.width = -1;
                    lp.height = 400;
                    mapFragment.getView().setLayoutParams(lp);
                    this.search_enable = false;
                    editText.setVisibility(8);
                    textView.setVisibility(8);
                    switchView.setVisibility(0);
                    textView2.setVisibility(0);
                    return true;
                }
                lp.width = -1;
                lp.height = 0;
                mapFragment.getView().setLayoutParams(lp);
                this.search_enable = true;
                editText.setVisibility(0);
                textView.setVisibility(0);
                switchView.setVisibility(8);
                textView2.setVisibility(8);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.num = getIntent().getExtras().getInt("num");
        getWindow().setFlags(128, 128);
        setContentView((int) C0273R.layout.activity_second);
        setSupportActionBar((Toolbar) findViewById(C0273R.id.toolbar));
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator((int) C0273R.drawable.ic_back);
        actionBar.setDisplayHomeAsUpEnabled(true);
        startProgress();
        this.mActivity = this;
        final MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(C0273R.id.map);
        final LayoutParams lp = (LayoutParams) mapFragment.getView().getLayoutParams();
        ((EditText) findViewById(C0273R.id.editText)).addTextChangedListener(new C02763());
        Switch switchView = (Switch) findViewById(C0273R.id.switch1);
        final int first_height = lp.height;
        switchView.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    lp.width = -1;
                    lp.height = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
                    mapFragment.getView().setLayoutParams(lp);
                    return;
                }
                lp.width = -1;
                lp.height = first_height;
                mapFragment.getView().setLayoutParams(lp);
            }
        });
        mapFragment.getMapAsync(this);
        this.previous_marker = new ArrayList();
    }

    protected void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
        if (this.mGoogleApiClient != null) {
            this.mGoogleApiClient.connect();
        }
        if (this.askPermissionOnceAgain && VERSION.SDK_INT >= 23) {
            this.askPermissionOnceAgain = false;
            checkPermissions();
        }
    }

    protected void onStop() {
        if (this.mGoogleApiClient != null && this.mGoogleApiClient.isConnected()) {
            this.mGoogleApiClient.disconnect();
        }
        super.onStop();
    }

    public void onPause() {
        if (this.mGoogleApiClient != null && this.mGoogleApiClient.isConnected()) {
            LocationServices.FusedLocationApi.removeLocationUpdates(this.mGoogleApiClient, (LocationListener) this);
            this.mGoogleApiClient.disconnect();
        }
        super.onPause();
    }

    protected void onDestroy() {
        if (this.mGoogleApiClient != null) {
            this.mGoogleApiClient.unregisterConnectionCallbacks(this);
            this.mGoogleApiClient.unregisterConnectionFailedListener(this);
            if (this.mGoogleApiClient.isConnected()) {
                LocationServices.FusedLocationApi.removeLocationUpdates(this.mGoogleApiClient, (LocationListener) this);
                this.mGoogleApiClient.disconnect();
            }
        }
        super.onDestroy();
    }

    public void onMapReady(GoogleMap map) {
        Log.d(TAG, "onMapReady");
        this.mGoogleMap = map;
        setCurrentLocation(null, "위치정보 가져올 수 없음", "위치 퍼미션과 GPS활성 여부 확인");
        this.mGoogleMap.getUiSettings().setCompassEnabled(true);
        this.mGoogleMap.animateCamera(CameraUpdateFactory.zoomTo(15.0f));
        if (VERSION.SDK_INT < 23) {
            if (this.mGoogleApiClient == null) {
                buildGoogleApiClient();
            }
            this.mGoogleMap.setMyLocationEnabled(true);
        } else if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == -1) {
            ActivityCompat.requestPermissions(this.mActivity, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION);
        } else {
            if (this.mGoogleApiClient == null) {
                buildGoogleApiClient();
            }
            if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                this.mGoogleMap.setMyLocationEnabled(true);
            }
        }
    }

    public void onLocationChanged(Location location) {
        Log.d(TAG, "onLocationChanged");
        this.currentPosition = new LatLng(location.getLatitude(), location.getLongitude());
        String markerTitle = getCurrentAddress(location);
        String markerSnippet = "위도:" + String.valueOf(location.getLatitude()) + "경도:" + String.valueOf(location.getLongitude());
        ((TextView) findViewById(C0273R.id.textView4)).setText(String.valueOf(markerTitle));
        showPlaceInformation(this.currentPosition, this.num);
        setCurrentLocation(location, markerTitle, markerSnippet);
    }

    protected synchronized void buildGoogleApiClient() {
        this.mGoogleApiClient = new GoogleApiClient.Builder(this).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).addApi(Places.GEO_DATA_API).addApi(Places.PLACE_DETECTION_API).build();
        this.mGoogleApiClient.connect();
    }

    public void onConnected(Bundle connectionHint) {
        Log.d(TAG, "onConnected");
        if (!checkLocationServicesStatus()) {
            showDialogForLocationServiceSetting();
        }
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setPriority(100);
        if (VERSION.SDK_INT < 23) {
            Log.d(TAG, "onConnected : call FusedLocationApi");
            LocationServices.FusedLocationApi.requestLocationUpdates(this.mGoogleApiClient, locationRequest, (LocationListener) this);
            this.mGoogleMap.getUiSettings().setCompassEnabled(true);
            this.mGoogleMap.animateCamera(CameraUpdateFactory.zoomTo(15.0f));
        } else if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            LocationServices.FusedLocationApi.requestLocationUpdates(this.mGoogleApiClient, locationRequest, (LocationListener) this);
        }
    }

    public void onConnectionSuspended(int cause) {
        if (cause == 2) {
            Log.e(TAG, "onConnectionSuspended():Google Play services connection lost.Cause: network lost.");
        } else if (cause == 1) {
            Log.e(TAG, "onConnectionSuspended():Google Play services connection lost.Cause: service disconnected");
        }
    }

    public String getCurrentAddress(Location location) {
        try {
            List<Address> addresses = new Geocoder(this, Locale.KOREA).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            if (addresses != null && addresses.size() != 0) {
                return ((Address) addresses.get(0)).getAddressLine(0);
            }
            Toast.makeText(this, "주소 미발견", 1).show();
            return "주소 미발견";
        } catch (IOException e) {
            Toast.makeText(this, "지오코더 서비스 사용불가", 1).show();
            return "지오코더 서비스 사용불가";
        } catch (IllegalArgumentException e2) {
            Toast.makeText(this, "잘못된 GPS 좌표", 1).show();
            return "잘못된 GPS 좌표";
        }
    }

    public boolean checkLocationServicesStatus() {
        LocationManager locationManager = (LocationManager) getSystemService("location");
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    public void setCurrentLocation(Location location, String markerTitle, String markerSnippet) {
        if (this.currentMarker != null) {
            this.currentMarker.remove();
        }
        if (location != null) {
            LatLng currentLocation = new LatLng(location.getLatitude(), location.getLongitude());
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.position(currentLocation);
            markerOptions.title(markerTitle);
            markerOptions.snippet(markerSnippet);
            markerOptions.draggable(true);
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
            this.currentMarker = this.mGoogleMap.addMarker(markerOptions);
            this.mGoogleMap.moveCamera(CameraUpdateFactory.newLatLng(currentLocation));
            return;
        }
        markerOptions = new MarkerOptions();
        markerOptions.position(DEFAULT_LOCATION);
        markerOptions.title(markerTitle);
        markerOptions.snippet(markerSnippet);
        markerOptions.draggable(true);
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(0.0f));
        this.currentMarker = this.mGoogleMap.addMarker(markerOptions);
        this.mGoogleMap.moveCamera(CameraUpdateFactory.newLatLng(DEFAULT_LOCATION));
    }

    @TargetApi(23)
    private void checkPermissions() {
        boolean fineLocationRationale = ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.ACCESS_FINE_LOCATION");
        int hasFineLocationPermission = ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION");
        if (hasFineLocationPermission == -1 && fineLocationRationale) {
            showDialogForPermission("앱을 실행하려면 퍼미션을 허가하셔야합니다.");
        } else if (hasFineLocationPermission == -1 && !fineLocationRationale) {
            showDialogForPermissionSetting("퍼미션 거부 + Don't ask again(다시 묻지 않음) 체크 박스를 설정한 경우로 설정에서 퍼미션 허가해야합니다.");
        } else if (hasFineLocationPermission == 0) {
            if (this.mGoogleApiClient == null) {
                buildGoogleApiClient();
            }
            this.mGoogleMap.setMyLocationEnabled(true);
        }
    }

    public void onRequestPermissionsResult(int permsRequestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        boolean permissionAccepted = false;
        if (permsRequestCode == PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION && grantResults.length > 0) {
            if (grantResults[0] == 0) {
                permissionAccepted = true;
            }
            if (permissionAccepted) {
                if (this.mGoogleApiClient == null) {
                    buildGoogleApiClient();
                }
                if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    this.mGoogleMap.setMyLocationEnabled(true);
                    return;
                }
                return;
            }
            checkPermissions();
        }
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        Location location = null;
        location.setLatitude(DEFAULT_LOCATION.latitude);
        location.setLongitude(DEFAULT_LOCATION.longitude);
        setCurrentLocation(location, "위치정보 가져올 수 없음", "위치 퍼미션과 GPS 활성 여부 확인");
    }

    @TargetApi(23)
    private void showDialogForPermission(String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((CharSequence) "알림");
        builder.setMessage((CharSequence) msg);
        builder.setCancelable(false);
        builder.setPositiveButton((CharSequence) "예", new C02785());
        builder.setNegativeButton((CharSequence) "아니오", new C02796());
        builder.create().show();
    }

    @TargetApi(23)
    private void showDialogForPermissionSetting(String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((CharSequence) "알림");
        builder.setMessage((CharSequence) msg);
        builder.setCancelable(false);
        builder.setPositiveButton((CharSequence) "예", new C02807());
        builder.setNegativeButton((CharSequence) "아니오", new C02818());
        builder.create().show();
    }

    private void showDialogForLocationServiceSetting() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((CharSequence) "위치 서비스 비활성화");
        builder.setMessage((CharSequence) "앱을 사용하기위해 위치 서비스가 필요합니다\n위치 설정을 수정하시겠습니까?");
        builder.setCancelable(true);
        builder.setPositiveButton((CharSequence) "설정", new C02829());
        builder.setNegativeButton((CharSequence) "취소", new OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        builder.create().show();
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case GPS_ENABLE_REQUEST_CODE /*2001*/:
                if (!checkLocationServicesStatus()) {
                    setCurrentLocation(null, "위치정보 가져올 수 없음", "위치 퍼미션과 GPS 활성 여부 확인하세요.");
                    return;
                } else if (checkLocationServicesStatus()) {
                    if (this.mGoogleApiClient == null) {
                        buildGoogleApiClient();
                    }
                    if (VERSION.SDK_INT < 23) {
                        this.mGoogleMap.setMyLocationEnabled(true);
                        return;
                    } else if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        this.mGoogleMap.setMyLocationEnabled(true);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }
}
