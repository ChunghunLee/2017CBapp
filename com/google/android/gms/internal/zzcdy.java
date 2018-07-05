package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzd;
import com.google.android.gms.common.internal.zzbo;
import com.google.android.gms.location.places.PlacesStatusCodes;

@Deprecated
public final class zzcdy extends zzd<zzcdx> implements Result {
    private final Status mStatus;

    public zzcdy(DataHolder dataHolder) {
        this(dataHolder, PlacesStatusCodes.zzaH(dataHolder.getStatusCode()));
    }

    private zzcdy(DataHolder dataHolder, Status status) {
        super(dataHolder, zzcdx.CREATOR);
        boolean z = dataHolder == null || dataHolder.getStatusCode() == status.getStatusCode();
        zzbo.zzaf(z);
        this.mStatus = status;
    }

    public final Status getStatus() {
        return this.mStatus;
    }
}
