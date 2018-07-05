package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationStatusCodes;

final class zzcdk extends zzccx {
    private zzbay<Status> zzbiT;

    public zzcdk(zzbay<Status> com_google_android_gms_internal_zzbay_com_google_android_gms_common_api_Status) {
        this.zzbiT = com_google_android_gms_internal_zzbay_com_google_android_gms_common_api_Status;
    }

    private final void zzbl(int i) {
        if (this.zzbiT == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times");
            return;
        }
        this.zzbiT.setResult(LocationStatusCodes.zzbk(LocationStatusCodes.zzbj(i)));
        this.zzbiT = null;
    }

    public final void zza(int i, PendingIntent pendingIntent) {
        zzbl(i);
    }

    public final void zza(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult");
    }

    public final void zzb(int i, String[] strArr) {
        zzbl(i);
    }
}
