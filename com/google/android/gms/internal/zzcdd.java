package com.google.android.gms.internal;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzk;

final class zzcdd extends zzk {
    private final zzbdv<LocationCallback> zzaEU;

    zzcdd(zzbdv<LocationCallback> com_google_android_gms_internal_zzbdv_com_google_android_gms_location_LocationCallback) {
        this.zzaEU = com_google_android_gms_internal_zzbdv_com_google_android_gms_location_LocationCallback;
    }

    public final void onLocationAvailability(LocationAvailability locationAvailability) {
        this.zzaEU.zza(new zzcdf(this, locationAvailability));
    }

    public final void onLocationResult(LocationResult locationResult) {
        this.zzaEU.zza(new zzcde(this, locationResult));
    }

    public final synchronized void release() {
        this.zzaEU.clear();
    }
}
