package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.zzn;

final class zzcdg extends zzn {
    private final zzbdv<LocationListener> zzaEU;

    zzcdg(zzbdv<LocationListener> com_google_android_gms_internal_zzbdv_com_google_android_gms_location_LocationListener) {
        this.zzaEU = com_google_android_gms_internal_zzbdv_com_google_android_gms_location_LocationListener;
    }

    public final synchronized void onLocationChanged(Location location) {
        this.zzaEU.zza(new zzcdh(this, location));
    }

    public final synchronized void release() {
        this.zzaEU.clear();
    }
}
