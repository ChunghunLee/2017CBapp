package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzd;
import com.google.android.gms.common.internal.zzbe;
import java.util.Arrays;
import java.util.List;

@Deprecated
public final class zzcdx extends zza {
    public static final Creator<zzcdx> CREATOR = new zzcdz();
    private final String zzakh;
    private final String zzbjI;
    private final List<zzcdv> zzbll;

    zzcdx(String str, String str2, List<zzcdv> list) {
        this.zzakh = str;
        this.zzbjI = str2;
        this.zzbll = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcdx)) {
            return false;
        }
        zzcdx com_google_android_gms_internal_zzcdx = (zzcdx) obj;
        return this.zzakh.equals(com_google_android_gms_internal_zzcdx.zzakh) && this.zzbjI.equals(com_google_android_gms_internal_zzcdx.zzbjI) && this.zzbll.equals(com_google_android_gms_internal_zzcdx.zzbll);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzakh, this.zzbjI, this.zzbll});
    }

    public final String toString() {
        return zzbe.zzt(this).zzg("accountName", this.zzakh).zzg("placeId", this.zzbjI).zzg("placeAliases", this.zzbll).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzd.zze(parcel);
        zzd.zza(parcel, 1, this.zzakh, false);
        zzd.zza(parcel, 2, this.zzbjI, false);
        zzd.zzc(parcel, 6, this.zzbll, false);
        zzd.zzI(parcel, zze);
    }
}
