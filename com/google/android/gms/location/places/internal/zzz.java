package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.zzm;
import com.google.android.gms.location.places.zzm.zzf;

final class zzz extends zzf<zzaa> {
    private /* synthetic */ PlaceReport zzbkq;

    zzz(zzx com_google_android_gms_location_places_internal_zzx, Api api, GoogleApiClient googleApiClient, PlaceReport placeReport) {
        this.zzbkq = placeReport;
        super(api, googleApiClient);
    }

    protected final /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        ((zzaa) com_google_android_gms_common_api_Api_zzb).zza(new zzm((zzf) this), this.zzbkq);
    }
}
