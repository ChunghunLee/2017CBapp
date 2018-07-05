package com.google.android.gms.internal;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;

final class zzcdf implements zzbdy<LocationCallback> {
    private /* synthetic */ LocationAvailability zzbiQ;

    zzcdf(zzcdd com_google_android_gms_internal_zzcdd, LocationAvailability locationAvailability) {
        this.zzbiQ = locationAvailability;
    }

    public final void zzpT() {
    }

    public final /* synthetic */ void zzq(Object obj) {
        ((LocationCallback) obj).onLocationAvailability(this.zzbiQ);
    }
}
