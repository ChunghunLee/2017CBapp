package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public final class zzao implements Creator<zzal> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        List list = null;
        int zzd = zzb.zzd(parcel);
        List list2 = null;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (SupportMenu.USER_MASK & readInt) {
                case 1:
                    list2 = zzb.zzc(parcel, readInt, zzam.CREATOR);
                    break;
                case 2:
                    list = zzb.zzc(parcel, readInt, zzan.CREATOR);
                    break;
                default:
                    zzb.zzb(parcel, readInt);
                    break;
            }
        }
        zzb.zzF(parcel, zzd);
        return new zzal(list2, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzal[i];
    }
}
