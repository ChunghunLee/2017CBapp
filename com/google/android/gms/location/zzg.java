package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.internal.zzbdv;
import com.google.android.gms.internal.zzbed;
import com.google.android.gms.internal.zzcdi;
import com.google.android.gms.internal.zzcdm;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzg extends zzbed<zzcdi, LocationCallback> {
    private /* synthetic */ zzcdm zzbhD;
    private /* synthetic */ zzbdv zzbhE;

    zzg(FusedLocationProviderClient fusedLocationProviderClient, zzbdv com_google_android_gms_internal_zzbdv, zzcdm com_google_android_gms_internal_zzcdm, zzbdv com_google_android_gms_internal_zzbdv2) {
        this.zzbhD = com_google_android_gms_internal_zzcdm;
        this.zzbhE = com_google_android_gms_internal_zzbdv2;
        super(com_google_android_gms_internal_zzbdv);
    }

    protected final /* synthetic */ void zzb(zzb com_google_android_gms_common_api_Api_zzb, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zzcdi) com_google_android_gms_common_api_Api_zzb).zza(this.zzbhD, this.zzbhE, new zza(taskCompletionSource));
    }
}
