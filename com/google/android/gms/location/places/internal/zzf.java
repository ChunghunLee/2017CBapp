package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public final class zzf implements Creator<zzan> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int zzd = zzb.zzd(parcel);
        List list = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (SupportMenu.USER_MASK & readInt) {
                case 1:
                    i6 = zzb.zzg(parcel, readInt);
                    break;
                case 2:
                    i5 = zzb.zzg(parcel, readInt);
                    break;
                case 3:
                    i4 = zzb.zzg(parcel, readInt);
                    break;
                case 4:
                    i3 = zzb.zzg(parcel, readInt);
                    break;
                case 5:
                    i2 = zzb.zzg(parcel, readInt);
                    break;
                case 6:
                    i = zzb.zzg(parcel, readInt);
                    break;
                case 7:
                    list = zzb.zzc(parcel, readInt, zzam.CREATOR);
                    break;
                default:
                    zzb.zzb(parcel, readInt);
                    break;
            }
        }
        zzb.zzF(parcel, zzd);
        return new zzan(i6, i5, i4, i3, i2, i, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzan[i];
    }
}
