package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.zzbo;
import com.google.android.gms.internal.zzbax;
import com.google.android.gms.internal.zzcca;
import com.google.android.gms.internal.zzccp;
import com.google.android.gms.internal.zzcdi;
import com.google.android.gms.internal.zzcdt;

public class LocationServices {
    public static final Api<NoOptions> API = new Api("LocationServices.API", zzajS, zzajR);
    public static final FusedLocationProviderApi FusedLocationApi = new zzcca();
    public static final GeofencingApi GeofencingApi = new zzccp();
    public static final SettingsApi SettingsApi = new zzcdt();
    private static final zzf<zzcdi> zzajR = new zzf();
    private static final com.google.android.gms.common.api.Api.zza<zzcdi, NoOptions> zzajS = new zzs();

    public static abstract class zza<R extends Result> extends zzbax<R, zzcdi> {
        public zza(GoogleApiClient googleApiClient) {
            super(LocationServices.API, googleApiClient);
        }

        public final /* bridge */ /* synthetic */ void setResult(Object obj) {
            super.setResult((Result) obj);
        }
    }

    private LocationServices() {
    }

    public static FusedLocationProviderClient getFusedLocationProviderClient(@NonNull Activity activity) {
        return new FusedLocationProviderClient(activity);
    }

    public static FusedLocationProviderClient getFusedLocationProviderClient(@NonNull Context context) {
        return new FusedLocationProviderClient(context);
    }

    public static GeofencingClient getGeofencingClient(@NonNull Activity activity) {
        return new GeofencingClient(activity);
    }

    public static GeofencingClient getGeofencingClient(@NonNull Context context) {
        return new GeofencingClient(context);
    }

    public static SettingsClient getSettingsClient(@NonNull Activity activity) {
        return new SettingsClient(activity);
    }

    public static SettingsClient getSettingsClient(@NonNull Context context) {
        return new SettingsClient(context);
    }

    public static zzcdi zzg(GoogleApiClient googleApiClient) {
        boolean z = true;
        zzbo.zzb(googleApiClient != null, (Object) "GoogleApiClient parameter is required.");
        zzcdi com_google_android_gms_internal_zzcdi = (zzcdi) googleApiClient.zza(zzajR);
        if (com_google_android_gms_internal_zzcdi == null) {
            z = false;
        }
        zzbo.zza(z, (Object) "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return com_google_android_gms_internal_zzcdi;
    }
}
