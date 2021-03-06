package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.zzm;
import com.google.android.gms.location.places.zzm.zza;
import com.google.android.gms.maps.model.LatLngBounds;

final class zzl extends zza<zzm> {
    private /* synthetic */ String val$query;
    private /* synthetic */ LatLngBounds zzbkm;
    private /* synthetic */ AutocompleteFilter zzbkn;

    zzl(zzh com_google_android_gms_location_places_internal_zzh, Api api, GoogleApiClient googleApiClient, String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter) {
        this.val$query = str;
        this.zzbkm = latLngBounds;
        this.zzbkn = autocompleteFilter;
        super(api, googleApiClient);
    }

    protected final /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        ((zzm) com_google_android_gms_common_api_Api_zzb).zza(new zzm((zza) this), this.val$query, this.zzbkm, this.zzbkn);
    }
}
