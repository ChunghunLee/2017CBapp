package com.google.android.gms.location.places;

import android.os.RemoteException;
import com.google.android.gms.location.places.internal.zzu;

public final class zzd extends zzu {
    private final zzf zzbjq;
    private final zze zzbjr;

    public zzd(zze com_google_android_gms_location_places_zze) {
        this.zzbjq = null;
        this.zzbjr = com_google_android_gms_location_places_zze;
    }

    public zzd(zzf com_google_android_gms_location_places_zzf) {
        this.zzbjq = com_google_android_gms_location_places_zzf;
        this.zzbjr = null;
    }

    public final void zza(PlacePhotoMetadataResult placePhotoMetadataResult) throws RemoteException {
        this.zzbjq.setResult(placePhotoMetadataResult);
    }

    public final void zza(PlacePhotoResult placePhotoResult) throws RemoteException {
        this.zzbjr.setResult(placePhotoResult);
    }
}
