package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.zzd;
import com.google.android.gms.location.places.zzf;

final class zzj extends zzf<zzm> {
    private /* synthetic */ String zzbkk;

    zzj(zzh com_google_android_gms_location_places_internal_zzh, Api api, GoogleApiClient googleApiClient, String str) {
        this.zzbkk = str;
        super(api, googleApiClient);
    }

    protected final /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        ((zzm) com_google_android_gms_common_api_Api_zzb).zza(new zzd((zzf) this), this.zzbkk);
    }
}
