package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzd;
import com.google.android.gms.common.internal.zzbe;

public final class zzcby extends zza {
    public static final Creator<zzcby> CREATOR = new zzcbz();
    private String packageName;
    private int uid;

    public zzcby(int i, String str) {
        this.uid = i;
        this.packageName = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof zzcby)) {
            return false;
        }
        zzcby com_google_android_gms_internal_zzcby = (zzcby) obj;
        return com_google_android_gms_internal_zzcby.uid == this.uid && zzbe.equal(com_google_android_gms_internal_zzcby.packageName, this.packageName);
    }

    public final int hashCode() {
        return this.uid;
    }

    public final String toString() {
        return String.format("%d:%s", new Object[]{Integer.valueOf(this.uid), this.packageName});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzd.zze(parcel);
        zzd.zzc(parcel, 1, this.uid);
        zzd.zza(parcel, 2, this.packageName, false);
        zzd.zzI(parcel, zze);
    }
}
