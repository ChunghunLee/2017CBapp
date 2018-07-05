package com.google.android.gms.internal;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;

final class zzcch extends zzccl {
    private /* synthetic */ LocationRequest zzbiD;
    private /* synthetic */ LocationCallback zzbiF;
    private /* synthetic */ Looper zzbiI;

    zzcch(zzcca com_google_android_gms_internal_zzcca, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        this.zzbiD = locationRequest;
        this.zzbiF = locationCallback;
        this.zzbiI = looper;
        super(googleApiClient);
    }

    protected final /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        ((zzcdi) com_google_android_gms_common_api_Api_zzb).zza(zzcdm.zza(this.zzbiD), zzbdz.zzb(this.zzbiF, zzcea.zzb(this.zzbiI), LocationCallback.class.getSimpleName()), new zzccm(this));
    }
}
