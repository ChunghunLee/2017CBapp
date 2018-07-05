package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzbo;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.zzaa;

public final class zzcdi extends zzcbw {
    private final zzcdc zzbiS;

    public zzcdi(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str) {
        this(context, looper, connectionCallbacks, onConnectionFailedListener, str, zzq.zzaA(context));
    }

    public zzcdi(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str, zzq com_google_android_gms_common_internal_zzq) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, str, com_google_android_gms_common_internal_zzq);
        this.zzbiS = new zzcdc(context, this.zzbiB);
    }

    public final void disconnect() {
        synchronized (this.zzbiS) {
            if (isConnected()) {
                try {
                    this.zzbiS.removeAllListeners();
                    this.zzbiS.zzvR();
                } catch (Throwable e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.disconnect();
        }
    }

    public final Location getLastLocation() {
        return this.zzbiS.getLastLocation();
    }

    public final void zza(long j, PendingIntent pendingIntent) throws RemoteException {
        zzre();
        zzbo.zzu(pendingIntent);
        zzbo.zzb(j >= 0, (Object) "detectionIntervalMillis must be >= 0");
        ((zzccy) zzrf()).zza(j, true, pendingIntent);
    }

    public final void zza(PendingIntent pendingIntent, zzcct com_google_android_gms_internal_zzcct) throws RemoteException {
        this.zzbiS.zza(pendingIntent, com_google_android_gms_internal_zzcct);
    }

    public final void zza(zzbdx<LocationListener> com_google_android_gms_internal_zzbdx_com_google_android_gms_location_LocationListener, zzcct com_google_android_gms_internal_zzcct) throws RemoteException {
        this.zzbiS.zza((zzbdx) com_google_android_gms_internal_zzbdx_com_google_android_gms_location_LocationListener, com_google_android_gms_internal_zzcct);
    }

    public final void zza(zzcct com_google_android_gms_internal_zzcct) throws RemoteException {
        this.zzbiS.zza(com_google_android_gms_internal_zzcct);
    }

    public final void zza(zzcdm com_google_android_gms_internal_zzcdm, zzbdv<LocationCallback> com_google_android_gms_internal_zzbdv_com_google_android_gms_location_LocationCallback, zzcct com_google_android_gms_internal_zzcct) throws RemoteException {
        synchronized (this.zzbiS) {
            this.zzbiS.zza(com_google_android_gms_internal_zzcdm, (zzbdv) com_google_android_gms_internal_zzbdv_com_google_android_gms_location_LocationCallback, com_google_android_gms_internal_zzcct);
        }
    }

    public final void zza(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzbay<Status> com_google_android_gms_internal_zzbay_com_google_android_gms_common_api_Status) throws RemoteException {
        zzre();
        zzbo.zzb((Object) geofencingRequest, (Object) "geofencingRequest can't be null.");
        zzbo.zzb((Object) pendingIntent, (Object) "PendingIntent must be specified.");
        zzbo.zzb((Object) com_google_android_gms_internal_zzbay_com_google_android_gms_common_api_Status, (Object) "ResultHolder not provided.");
        ((zzccy) zzrf()).zza(geofencingRequest, pendingIntent, new zzcdj(com_google_android_gms_internal_zzbay_com_google_android_gms_common_api_Status));
    }

    public final void zza(LocationRequest locationRequest, PendingIntent pendingIntent, zzcct com_google_android_gms_internal_zzcct) throws RemoteException {
        this.zzbiS.zza(locationRequest, pendingIntent, com_google_android_gms_internal_zzcct);
    }

    public final void zza(LocationRequest locationRequest, zzbdv<LocationListener> com_google_android_gms_internal_zzbdv_com_google_android_gms_location_LocationListener, zzcct com_google_android_gms_internal_zzcct) throws RemoteException {
        synchronized (this.zzbiS) {
            this.zzbiS.zza(locationRequest, (zzbdv) com_google_android_gms_internal_zzbdv_com_google_android_gms_location_LocationListener, com_google_android_gms_internal_zzcct);
        }
    }

    public final void zza(LocationSettingsRequest locationSettingsRequest, zzbay<LocationSettingsResult> com_google_android_gms_internal_zzbay_com_google_android_gms_location_LocationSettingsResult, String str) throws RemoteException {
        boolean z = true;
        zzre();
        zzbo.zzb(locationSettingsRequest != null, (Object) "locationSettingsRequest can't be null nor empty.");
        if (com_google_android_gms_internal_zzbay_com_google_android_gms_location_LocationSettingsResult == null) {
            z = false;
        }
        zzbo.zzb(z, (Object) "listener can't be null.");
        ((zzccy) zzrf()).zza(locationSettingsRequest, new zzcdl(com_google_android_gms_internal_zzbay_com_google_android_gms_location_LocationSettingsResult), str);
    }

    public final void zza(zzaa com_google_android_gms_location_zzaa, zzbay<Status> com_google_android_gms_internal_zzbay_com_google_android_gms_common_api_Status) throws RemoteException {
        zzre();
        zzbo.zzb((Object) com_google_android_gms_location_zzaa, (Object) "removeGeofencingRequest can't be null.");
        zzbo.zzb((Object) com_google_android_gms_internal_zzbay_com_google_android_gms_common_api_Status, (Object) "ResultHolder not provided.");
        ((zzccy) zzrf()).zza(com_google_android_gms_location_zzaa, new zzcdk(com_google_android_gms_internal_zzbay_com_google_android_gms_common_api_Status));
    }

    public final void zzai(boolean z) throws RemoteException {
        this.zzbiS.zzai(z);
    }

    public final void zzb(zzbdx<LocationCallback> com_google_android_gms_internal_zzbdx_com_google_android_gms_location_LocationCallback, zzcct com_google_android_gms_internal_zzcct) throws RemoteException {
        this.zzbiS.zzb(com_google_android_gms_internal_zzbdx_com_google_android_gms_location_LocationCallback, com_google_android_gms_internal_zzcct);
    }

    public final void zzc(PendingIntent pendingIntent) throws RemoteException {
        zzre();
        zzbo.zzu(pendingIntent);
        ((zzccy) zzrf()).zzc(pendingIntent);
    }

    public final void zzc(Location location) throws RemoteException {
        this.zzbiS.zzc(location);
    }

    public final LocationAvailability zzvQ() {
        return this.zzbiS.zzvQ();
    }
}
