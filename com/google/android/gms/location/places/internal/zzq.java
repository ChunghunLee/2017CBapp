package com.google.android.gms.location.places.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.zzed;
import com.google.android.gms.internal.zzef;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;

public final class zzq extends zzed implements zzp {
    zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
    }

    public final void zza(PlaceFilter placeFilter, zzat com_google_android_gms_location_places_internal_zzat, zzv com_google_android_gms_location_places_internal_zzv) throws RemoteException {
        Parcel zzZ = zzZ();
        zzef.zza(zzZ, (Parcelable) placeFilter);
        zzef.zza(zzZ, (Parcelable) com_google_android_gms_location_places_internal_zzat);
        zzef.zza(zzZ, (IInterface) com_google_android_gms_location_places_internal_zzv);
        zzb(6, zzZ);
    }

    public final void zza(PlaceReport placeReport, zzat com_google_android_gms_location_places_internal_zzat, zzv com_google_android_gms_location_places_internal_zzv) throws RemoteException {
        Parcel zzZ = zzZ();
        zzef.zza(zzZ, (Parcelable) placeReport);
        zzef.zza(zzZ, (Parcelable) com_google_android_gms_location_places_internal_zzat);
        zzef.zza(zzZ, (IInterface) com_google_android_gms_location_places_internal_zzv);
        zzb(7, zzZ);
    }
}
