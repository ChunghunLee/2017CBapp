package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.internal.zzbdx;
import com.google.android.gms.internal.zzbex;
import com.google.android.gms.internal.zzcdi;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzh extends zzbex<zzcdi, LocationCallback> {
    zzh(FusedLocationProviderClient fusedLocationProviderClient, zzbdx com_google_android_gms_internal_zzbdx) {
        super(com_google_android_gms_internal_zzbdx);
    }

    protected final /* synthetic */ void zzc(zzb com_google_android_gms_common_api_Api_zzb, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zzcdi) com_google_android_gms_common_api_Api_zzb).zzb(zzqG(), null);
    }
}
