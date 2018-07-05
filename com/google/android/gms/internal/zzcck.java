package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;

final class zzcck extends zzccl {
    private /* synthetic */ PendingIntent zzbiz;

    zzcck(zzcca com_google_android_gms_internal_zzcca, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        this.zzbiz = pendingIntent;
        super(googleApiClient);
    }

    protected final /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        ((zzcdi) com_google_android_gms_common_api_Api_zzb).zza(this.zzbiz, new zzccm(this));
    }
}
