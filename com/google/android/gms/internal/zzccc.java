package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationCallback;

final class zzccc extends zzccl {
    private /* synthetic */ LocationCallback zzbiF;

    zzccc(zzcca com_google_android_gms_internal_zzcca, GoogleApiClient googleApiClient, LocationCallback locationCallback) {
        this.zzbiF = locationCallback;
        super(googleApiClient);
    }

    protected final /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        ((zzcdi) com_google_android_gms_common_api_Api_zzb).zzb(zzbdz.zza(this.zzbiF, LocationCallback.class.getSimpleName()), new zzccm(this));
    }
}
