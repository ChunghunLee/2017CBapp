package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.zzm;
import com.google.android.gms.location.places.zzm.zzc;

final class zzi extends zzc<zzm> {
    private /* synthetic */ AddPlaceRequest zzbkj;

    zzi(zzh com_google_android_gms_location_places_internal_zzh, Api api, GoogleApiClient googleApiClient, AddPlaceRequest addPlaceRequest) {
        this.zzbkj = addPlaceRequest;
        super(api, googleApiClient);
    }

    protected final /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        ((zzm) com_google_android_gms_common_api_Api_zzb).zza(new zzm((zzc) this), this.zzbkj);
    }
}
