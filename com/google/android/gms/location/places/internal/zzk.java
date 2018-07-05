package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.zzm;
import com.google.android.gms.location.places.zzm.zzc;
import java.util.Arrays;

final class zzk extends zzc<zzm> {
    private /* synthetic */ String[] zzbkl;

    zzk(zzh com_google_android_gms_location_places_internal_zzh, Api api, GoogleApiClient googleApiClient, String[] strArr) {
        this.zzbkl = strArr;
        super(api, googleApiClient);
    }

    protected final /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        ((zzm) com_google_android_gms_common_api_Api_zzb).zza(new zzm((zzc) this), Arrays.asList(this.zzbkl));
    }
}
