package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.zzaa;

final class zzccr extends zzccs {
    private /* synthetic */ zzaa zzbiL;

    zzccr(zzccp com_google_android_gms_internal_zzccp, GoogleApiClient googleApiClient, zzaa com_google_android_gms_location_zzaa) {
        this.zzbiL = com_google_android_gms_location_zzaa;
        super(googleApiClient);
    }

    protected final /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        ((zzcdi) com_google_android_gms_common_api_Api_zzb).zza(this.zzbiL, (zzbay) this);
    }
}
