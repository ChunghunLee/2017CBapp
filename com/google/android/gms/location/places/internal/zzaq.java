package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.zzd;
import com.google.android.gms.location.places.zze;

final class zzaq extends zze<zzm> {
    private /* synthetic */ int zzbla;
    private /* synthetic */ int zzblb;
    private /* synthetic */ zzap zzblc;

    zzaq(zzap com_google_android_gms_location_places_internal_zzap, Api api, GoogleApiClient googleApiClient, int i, int i2) {
        this.zzblc = com_google_android_gms_location_places_internal_zzap;
        this.zzbla = i;
        this.zzblb = i2;
        super(api, googleApiClient);
    }

    protected final /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        ((zzm) com_google_android_gms_common_api_Api_zzb).zza(new zzd((zze) this), this.zzblc.zzbkY, this.zzbla, this.zzblb, this.zzblc.mIndex);
    }
}
