package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzd;
import com.google.android.gms.common.internal.zzbe;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

public final class zzcdm extends zza {
    public static final Creator<zzcdm> CREATOR = new zzcdn();
    static final List<zzcby> zzbiU = Collections.emptyList();
    @Nullable
    private String mTag;
    private LocationRequest zzaXb;
    @Nullable
    private String zzanK;
    private List<zzcby> zzbiV;
    private boolean zzbiW;
    private boolean zzbiX;
    private boolean zzbiY;
    private boolean zzbiZ = true;

    zzcdm(LocationRequest locationRequest, List<zzcby> list, @Nullable String str, boolean z, boolean z2, boolean z3, String str2) {
        this.zzaXb = locationRequest;
        this.zzbiV = list;
        this.mTag = str;
        this.zzbiW = z;
        this.zzbiX = z2;
        this.zzbiY = z3;
        this.zzanK = str2;
    }

    @Deprecated
    public static zzcdm zza(LocationRequest locationRequest) {
        return new zzcdm(locationRequest, zzbiU, null, false, false, false, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcdm)) {
            return false;
        }
        zzcdm com_google_android_gms_internal_zzcdm = (zzcdm) obj;
        return zzbe.equal(this.zzaXb, com_google_android_gms_internal_zzcdm.zzaXb) && zzbe.equal(this.zzbiV, com_google_android_gms_internal_zzcdm.zzbiV) && zzbe.equal(this.mTag, com_google_android_gms_internal_zzcdm.mTag) && this.zzbiW == com_google_android_gms_internal_zzcdm.zzbiW && this.zzbiX == com_google_android_gms_internal_zzcdm.zzbiX && this.zzbiY == com_google_android_gms_internal_zzcdm.zzbiY && zzbe.equal(this.zzanK, com_google_android_gms_internal_zzcdm.zzanK);
    }

    public final int hashCode() {
        return this.zzaXb.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.zzaXb.toString());
        if (this.mTag != null) {
            stringBuilder.append(" tag=").append(this.mTag);
        }
        if (this.zzanK != null) {
            stringBuilder.append(" moduleId=").append(this.zzanK);
        }
        stringBuilder.append(" hideAppOps=").append(this.zzbiW);
        stringBuilder.append(" clients=").append(this.zzbiV);
        stringBuilder.append(" forceCoarseLocation=").append(this.zzbiX);
        if (this.zzbiY) {
            stringBuilder.append(" exemptFromBackgroundThrottle");
        }
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzd.zze(parcel);
        zzd.zza(parcel, 1, this.zzaXb, i, false);
        zzd.zzc(parcel, 5, this.zzbiV, false);
        zzd.zza(parcel, 6, this.mTag, false);
        zzd.zza(parcel, 7, this.zzbiW);
        zzd.zza(parcel, 8, this.zzbiX);
        zzd.zza(parcel, 9, this.zzbiY);
        zzd.zza(parcel, 10, this.zzanK, false);
        zzd.zzI(parcel, zze);
    }
}
