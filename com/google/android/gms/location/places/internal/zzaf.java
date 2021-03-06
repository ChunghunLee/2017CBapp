package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public final class zzaf implements Creator<zzae> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Uri uri = null;
        int zzd = zzb.zzd(parcel);
        float f = 0.0f;
        int i = 0;
        String str = null;
        List list = null;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (SupportMenu.USER_MASK & readInt) {
                case 1:
                    list = zzb.zzB(parcel, readInt);
                    break;
                case 2:
                    str = zzb.zzq(parcel, readInt);
                    break;
                case 3:
                    uri = (Uri) zzb.zza(parcel, readInt, Uri.CREATOR);
                    break;
                case 4:
                    f = zzb.zzl(parcel, readInt);
                    break;
                case 5:
                    i = zzb.zzg(parcel, readInt);
                    break;
                default:
                    zzb.zzb(parcel, readInt);
                    break;
            }
        }
        zzb.zzF(parcel, zzd);
        return new zzae(list, str, uri, f, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzae[i];
    }
}
