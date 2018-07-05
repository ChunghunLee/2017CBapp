package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzaa;

public interface zzccy extends IInterface {
    void zza(long j, boolean z, PendingIntent pendingIntent) throws RemoteException;

    void zza(zzcct com_google_android_gms_internal_zzcct) throws RemoteException;

    void zza(zzcdo com_google_android_gms_internal_zzcdo) throws RemoteException;

    void zza(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzccw com_google_android_gms_internal_zzccw) throws RemoteException;

    void zza(LocationSettingsRequest locationSettingsRequest, zzcda com_google_android_gms_internal_zzcda, String str) throws RemoteException;

    void zza(zzaa com_google_android_gms_location_zzaa, zzccw com_google_android_gms_internal_zzccw) throws RemoteException;

    void zzai(boolean z) throws RemoteException;

    void zzc(PendingIntent pendingIntent) throws RemoteException;

    void zzc(Location location) throws RemoteException;

    Location zzdv(String str) throws RemoteException;

    LocationAvailability zzdw(String str) throws RemoteException;
}
