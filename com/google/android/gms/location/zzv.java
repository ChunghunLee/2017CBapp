package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public final class zzv implements Creator<LocationSettingsRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        zzt com_google_android_gms_location_zzt = null;
        boolean z = false;
        int zzd = zzb.zzd(parcel);
        boolean z2 = false;
        List list = null;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (SupportMenu.USER_MASK & readInt) {
                case 1:
                    list = zzb.zzc(parcel, readInt, LocationRequest.CREATOR);
                    break;
                case 2:
                    z2 = zzb.zzc(parcel, readInt);
                    break;
                case 3:
                    z = zzb.zzc(parcel, readInt);
                    break;
                case 5:
                    com_google_android_gms_location_zzt = (zzt) zzb.zza(parcel, readInt, zzt.CREATOR);
                    break;
                default:
                    zzb.zzb(parcel, readInt);
                    break;
            }
        }
        zzb.zzF(parcel, zzd);
        return new LocationSettingsRequest(list, z2, z, com_google_android_gms_location_zzt);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }
}
