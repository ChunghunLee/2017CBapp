package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationStatusCodes;

final class zzcdj extends zzccx {
    private zzbay<Status> zzbiT;

    public zzcdj(zzbay<Status> com_google_android_gms_internal_zzbay_com_google_android_gms_common_api_Status) {
        this.zzbiT = com_google_android_gms_internal_zzbay_com_google_android_gms_common_api_Status;
    }

    public final void zza(int i, PendingIntent pendingIntent) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult");
    }

    public final void zza(int i, String[] strArr) {
        if (this.zzbiT == null) {
            Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
            return;
        }
        this.zzbiT.setResult(LocationStatusCodes.zzbk(LocationStatusCodes.zzbj(i)));
        this.zzbiT = null;
    }

    public final void zzb(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult");
    }
}
