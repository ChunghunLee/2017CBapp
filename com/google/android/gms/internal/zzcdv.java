package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzd;
import com.google.android.gms.common.internal.zzbe;
import java.util.Arrays;

@Deprecated
public final class zzcdv extends zza {
    public static final Creator<zzcdv> CREATOR = new zzcdw();
    private static zzcdv zzbli = new zzcdv("Home");
    private static zzcdv zzblj = new zzcdv("Work");
    private final String zzblk;

    zzcdv(String str) {
        this.zzblk = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcdv)) {
            return false;
        }
        return zzbe.equal(this.zzblk, ((zzcdv) obj).zzblk);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzblk});
    }

    public final String toString() {
        return zzbe.zzt(this).zzg("alias", this.zzblk).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzd.zze(parcel);
        zzd.zza(parcel, 1, this.zzblk, false);
        zzd.zzI(parcel, zze);
    }
}
