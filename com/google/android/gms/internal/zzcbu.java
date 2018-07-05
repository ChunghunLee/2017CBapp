package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

final class zzcbu extends zzcbv {
    private /* synthetic */ PendingIntent zzbiz;

    zzcbu(zzcbs com_google_android_gms_internal_zzcbs, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        this.zzbiz = pendingIntent;
        super(googleApiClient);
    }

    protected final /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        ((zzcdi) com_google_android_gms_common_api_Api_zzb).zzc(this.zzbiz);
        setResult(Status.zzaBm);
    }
}
