package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public final class zzc implements Creator<zza> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        List list = null;
        int zzd = zzb.zzd(parcel);
        int i = 0;
        String str = null;
        List list2 = null;
        String str2 = null;
        List list3 = null;
        String str3 = null;
        List list4 = null;
        String str4 = null;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (SupportMenu.USER_MASK & readInt) {
                case 1:
                    str3 = zzb.zzq(parcel, readInt);
                    break;
                case 2:
                    str4 = zzb.zzq(parcel, readInt);
                    break;
                case 3:
                    list4 = zzb.zzB(parcel, readInt);
                    break;
                case 4:
                    list3 = zzb.zzc(parcel, readInt, zzb.CREATOR);
                    break;
                case 5:
                    i = zzb.zzg(parcel, readInt);
                    break;
                case 6:
                    str2 = zzb.zzq(parcel, readInt);
                    break;
                case 7:
                    list2 = zzb.zzc(parcel, readInt, zzb.CREATOR);
                    break;
                case 8:
                    str = zzb.zzq(parcel, readInt);
                    break;
                case 9:
                    list = zzb.zzc(parcel, readInt, zzb.CREATOR);
                    break;
                default:
                    zzb.zzb(parcel, readInt);
                    break;
            }
        }
        zzb.zzF(parcel, zzd);
        return new zza(str4, list4, i, str3, list3, str2, list2, str, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zza[i];
    }
}
