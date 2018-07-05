package com.google.android.gms.internal;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

final class zzccg extends zzccl {
    private /* synthetic */ LocationRequest zzbiD;
    private /* synthetic */ LocationListener zzbiE;
    private /* synthetic */ Looper zzbiI;

    zzccg(zzcca com_google_android_gms_internal_zzcca, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        this.zzbiD = locationRequest;
        this.zzbiE = locationListener;
        this.zzbiI = looper;
        super(googleApiClient);
    }

    protected final /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        ((zzcdi) com_google_android_gms_common_api_Api_zzb).zza(this.zzbiD, zzbdz.zzb(this.zzbiE, zzcea.zzb(this.zzbiI), LocationListener.class.getSimpleName()), new zzccm(this));
    }
}
