package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;

final class zzccj extends zzccl {
    private /* synthetic */ LocationListener zzbiE;

    zzccj(zzcca com_google_android_gms_internal_zzcca, GoogleApiClient googleApiClient, LocationListener locationListener) {
        this.zzbiE = locationListener;
        super(googleApiClient);
    }

    protected final /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        ((zzcdi) com_google_android_gms_common_api_Api_zzb).zza(zzbdz.zza(this.zzbiE, LocationListener.class.getSimpleName()), new zzccm(this));
    }
}
