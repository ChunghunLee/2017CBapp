package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.GeofencingRequest;

final class zzccq extends zzccs {
    private /* synthetic */ PendingIntent zzaVL;
    private /* synthetic */ GeofencingRequest zzbiK;

    zzccq(zzccp com_google_android_gms_internal_zzccp, GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        this.zzbiK = geofencingRequest;
        this.zzaVL = pendingIntent;
        super(googleApiClient);
    }

    protected final /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        ((zzcdi) com_google_android_gms_common_api_Api_zzb).zza(this.zzbiK, this.zzaVL, (zzbay) this);
    }
}
