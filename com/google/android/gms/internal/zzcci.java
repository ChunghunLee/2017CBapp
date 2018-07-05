package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;

final class zzcci extends zzccl {
    private /* synthetic */ LocationRequest zzbiD;
    private /* synthetic */ PendingIntent zzbiz;

    zzcci(zzcca com_google_android_gms_internal_zzcca, GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        this.zzbiD = locationRequest;
        this.zzbiz = pendingIntent;
        super(googleApiClient);
    }

    protected final /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        ((zzcdi) com_google_android_gms_common_api_Api_zzb).zza(this.zzbiD, this.zzbiz, new zzccm(this));
    }
}
