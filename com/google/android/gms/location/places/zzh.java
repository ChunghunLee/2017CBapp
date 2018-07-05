package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public final class zzh implements Creator<PlaceFilter> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        List list = null;
        int zzd = zzb.zzd(parcel);
        boolean z = false;
        List list2 = null;
        List list3 = null;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (SupportMenu.USER_MASK & readInt) {
                case 1:
                    list2 = zzb.zzB(parcel, readInt);
                    break;
                case 3:
                    z = zzb.zzc(parcel, readInt);
                    break;
                case 4:
                    list = zzb.zzc(parcel, readInt, zzo.CREATOR);
                    break;
                case 6:
                    list3 = zzb.zzC(parcel, readInt);
                    break;
                default:
                    zzb.zzb(parcel, readInt);
                    break;
            }
        }
        zzb.zzF(parcel, zzd);
        return new PlaceFilter(list2, z, list3, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PlaceFilter[i];
    }
}
