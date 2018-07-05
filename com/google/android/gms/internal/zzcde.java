package com.google.android.gms.internal;

import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

final class zzcde implements zzbdy<LocationCallback> {
    private /* synthetic */ LocationResult zzbiP;

    zzcde(zzcdd com_google_android_gms_internal_zzcdd, LocationResult locationResult) {
        this.zzbiP = locationResult;
    }

    public final void zzpT() {
    }

    public final /* synthetic */ void zzq(Object obj) {
        ((LocationCallback) obj).onLocationResult(this.zzbiP);
    }
}
