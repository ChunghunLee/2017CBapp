package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.internal.zzbep;
import com.google.android.gms.internal.zzcdi;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzf extends zzbep<zzcdi, LocationAvailability> {
    zzf(FusedLocationProviderClient fusedLocationProviderClient) {
    }

    protected final /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb, TaskCompletionSource taskCompletionSource) throws RemoteException {
        taskCompletionSource.setResult(((zzcdi) com_google_android_gms_common_api_Api_zzb).zzvQ());
    }
}
