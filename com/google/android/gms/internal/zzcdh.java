package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.location.LocationListener;

final class zzcdh implements zzbdy<LocationListener> {
    private /* synthetic */ Location zzbiR;

    zzcdh(zzcdg com_google_android_gms_internal_zzcdg, Location location) {
        this.zzbiR = location;
    }

    public final void zzpT() {
    }

    public final /* synthetic */ void zzq(Object obj) {
        ((LocationListener) obj).onLocationChanged(this.zzbiR);
    }
}
