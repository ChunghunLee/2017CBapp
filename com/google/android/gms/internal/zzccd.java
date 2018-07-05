package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

final class zzccd extends zzccl {
    private /* synthetic */ boolean zzbiG;

    zzccd(zzcca com_google_android_gms_internal_zzcca, GoogleApiClient googleApiClient, boolean z) {
        this.zzbiG = z;
        super(googleApiClient);
    }

    protected final /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        ((zzcdi) com_google_android_gms_common_api_Api_zzb).zzai(this.zzbiG);
        setResult(Status.zzaBm);
    }
}
