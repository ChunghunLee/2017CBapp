package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.zzm;
import com.google.android.gms.location.places.zzm.zzd;

final class zzy extends zzd<zzaa> {
    private /* synthetic */ PlaceFilter zzbkp;

    zzy(zzx com_google_android_gms_location_places_internal_zzx, Api api, GoogleApiClient googleApiClient, PlaceFilter placeFilter) {
        this.zzbkp = placeFilter;
        super(api, googleApiClient);
    }

    protected final /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        ((zzaa) com_google_android_gms_common_api_Api_zzb).zza(new zzm((zzd) this), this.zzbkp);
    }
}
