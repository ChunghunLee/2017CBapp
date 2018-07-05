package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzaa;

public final class zzccz extends zzed implements zzccy {
    zzccz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void zza(long j, boolean z, PendingIntent pendingIntent) throws RemoteException {
        Parcel zzZ = zzZ();
        zzZ.writeLong(j);
        zzef.zza(zzZ, true);
        zzef.zza(zzZ, (Parcelable) pendingIntent);
        zzb(5, zzZ);
    }

    public final void zza(zzcct com_google_android_gms_internal_zzcct) throws RemoteException {
        Parcel zzZ = zzZ();
        zzef.zza(zzZ, (IInterface) com_google_android_gms_internal_zzcct);
        zzb(67, zzZ);
    }

    public final void zza(zzcdo com_google_android_gms_internal_zzcdo) throws RemoteException {
        Parcel zzZ = zzZ();
        zzef.zza(zzZ, (Parcelable) com_google_android_gms_internal_zzcdo);
        zzb(59, zzZ);
    }

    public final void zza(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzccw com_google_android_gms_internal_zzccw) throws RemoteException {
        Parcel zzZ = zzZ();
        zzef.zza(zzZ, (Parcelable) geofencingRequest);
        zzef.zza(zzZ, (Parcelable) pendingIntent);
        zzef.zza(zzZ, (IInterface) com_google_android_gms_internal_zzccw);
        zzb(57, zzZ);
    }

    public final void zza(LocationSettingsRequest locationSettingsRequest, zzcda com_google_android_gms_internal_zzcda, String str) throws RemoteException {
        Parcel zzZ = zzZ();
        zzef.zza(zzZ, (Parcelable) locationSettingsRequest);
        zzef.zza(zzZ, (IInterface) com_google_android_gms_internal_zzcda);
        zzZ.writeString(str);
        zzb(63, zzZ);
    }

    public final void zza(zzaa com_google_android_gms_location_zzaa, zzccw com_google_android_gms_internal_zzccw) throws RemoteException {
        Parcel zzZ = zzZ();
        zzef.zza(zzZ, (Parcelable) com_google_android_gms_location_zzaa);
        zzef.zza(zzZ, (IInterface) com_google_android_gms_internal_zzccw);
        zzb(74, zzZ);
    }

    public final void zzai(boolean z) throws RemoteException {
        Parcel zzZ = zzZ();
        zzef.zza(zzZ, z);
        zzb(12, zzZ);
    }

    public final void zzc(PendingIntent pendingIntent) throws RemoteException {
        Parcel zzZ = zzZ();
        zzef.zza(zzZ, (Parcelable) pendingIntent);
        zzb(6, zzZ);
    }

    public final void zzc(Location location) throws RemoteException {
        Parcel zzZ = zzZ();
        zzef.zza(zzZ, (Parcelable) location);
        zzb(13, zzZ);
    }

    public final Location zzdv(String str) throws RemoteException {
        Parcel zzZ = zzZ();
        zzZ.writeString(str);
        Parcel zza = zza(21, zzZ);
        Location location = (Location) zzef.zza(zza, Location.CREATOR);
        zza.recycle();
        return location;
    }

    public final LocationAvailability zzdw(String str) throws RemoteException {
        Parcel zzZ = zzZ();
        zzZ.writeString(str);
        Parcel zza = zza(34, zzZ);
        LocationAvailability locationAvailability = (LocationAvailability) zzef.zza(zza, LocationAvailability.CREATOR);
        zza.recycle();
        return locationAvailability;
    }
}
