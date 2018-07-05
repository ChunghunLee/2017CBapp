package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationServices.zza;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

final class zzcdu extends zza<LocationSettingsResult> {
    private /* synthetic */ LocationSettingsRequest zzbjg;
    private /* synthetic */ String zzbjh = null;

    zzcdu(zzcdt com_google_android_gms_internal_zzcdt, GoogleApiClient googleApiClient, LocationSettingsRequest locationSettingsRequest, String str) {
        this.zzbjg = locationSettingsRequest;
        super(googleApiClient);
    }

    protected final /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        ((zzcdi) com_google_android_gms_common_api_Api_zzb).zza(this.zzbjg, (zzbay) this, this.zzbjh);
    }

    public final /* synthetic */ Result zzb(Status status) {
        return new LocationSettingsResult(status);
    }
}
