package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzd;
import com.google.android.gms.location.zzj;
import com.google.android.gms.location.zzk;
import com.google.android.gms.location.zzm;
import com.google.android.gms.location.zzn;

public final class zzcdo extends zza {
    public static final Creator<zzcdo> CREATOR = new zzcdp();
    private PendingIntent mPendingIntent;
    private int zzbja;
    private zzcdm zzbjb;
    private zzm zzbjc;
    private zzj zzbjd;
    private zzcct zzbje;

    zzcdo(int i, zzcdm com_google_android_gms_internal_zzcdm, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        zzcct com_google_android_gms_internal_zzcct = null;
        this.zzbja = i;
        this.zzbjb = com_google_android_gms_internal_zzcdm;
        this.zzbjc = iBinder == null ? null : zzn.zzZ(iBinder);
        this.mPendingIntent = pendingIntent;
        this.zzbjd = iBinder2 == null ? null : zzk.zzY(iBinder2);
        if (!(iBinder3 == null || iBinder3 == null)) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            com_google_android_gms_internal_zzcct = queryLocalInterface instanceof zzcct ? (zzcct) queryLocalInterface : new zzccv(iBinder3);
        }
        this.zzbje = com_google_android_gms_internal_zzcct;
    }

    public static zzcdo zza(zzj com_google_android_gms_location_zzj, @Nullable zzcct com_google_android_gms_internal_zzcct) {
        return new zzcdo(2, null, null, null, com_google_android_gms_location_zzj.asBinder(), com_google_android_gms_internal_zzcct != null ? com_google_android_gms_internal_zzcct.asBinder() : null);
    }

    public static zzcdo zza(zzm com_google_android_gms_location_zzm, @Nullable zzcct com_google_android_gms_internal_zzcct) {
        return new zzcdo(2, null, com_google_android_gms_location_zzm.asBinder(), null, null, com_google_android_gms_internal_zzcct != null ? com_google_android_gms_internal_zzcct.asBinder() : null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder = null;
        int zze = zzd.zze(parcel);
        zzd.zzc(parcel, 1, this.zzbja);
        zzd.zza(parcel, 2, this.zzbjb, i, false);
        zzd.zza(parcel, 3, this.zzbjc == null ? null : this.zzbjc.asBinder(), false);
        zzd.zza(parcel, 4, this.mPendingIntent, i, false);
        zzd.zza(parcel, 5, this.zzbjd == null ? null : this.zzbjd.asBinder(), false);
        if (this.zzbje != null) {
            iBinder = this.zzbje.asBinder();
        }
        zzd.zza(parcel, 6, iBinder, false);
        zzd.zzI(parcel, zze);
    }
}
