package com.google.android.gms.internal;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

final class zzcce extends zzccl {
    private /* synthetic */ Location zzbiH;

    zzcce(zzcca com_google_android_gms_internal_zzcca, GoogleApiClient googleApiClient, Location location) {
        this.zzbiH = location;
        super(googleApiClient);
    }

    protected final /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        ((zzcdi) com_google_android_gms_common_api_Api_zzb).zzc(this.zzbiH);
        setResult(Status.zzaBm);
    }
}
