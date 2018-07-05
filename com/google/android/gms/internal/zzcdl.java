package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzbo;
import com.google.android.gms.location.LocationSettingsResult;

final class zzcdl extends zzcdb {
    private zzbay<LocationSettingsResult> zzbiT;

    public zzcdl(zzbay<LocationSettingsResult> com_google_android_gms_internal_zzbay_com_google_android_gms_location_LocationSettingsResult) {
        zzbo.zzb(com_google_android_gms_internal_zzbay_com_google_android_gms_location_LocationSettingsResult != null, (Object) "listener can't be null.");
        this.zzbiT = com_google_android_gms_internal_zzbay_com_google_android_gms_location_LocationSettingsResult;
    }

    public final void zza(LocationSettingsResult locationSettingsResult) throws RemoteException {
        this.zzbiT.setResult(locationSettingsResult);
        this.zzbiT = null;
    }
}
