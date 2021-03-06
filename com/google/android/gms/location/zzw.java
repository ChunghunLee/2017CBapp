package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zzb;

public final class zzw implements Creator<LocationSettingsResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzb.zzd(parcel);
        LocationSettingsStates locationSettingsStates = null;
        Status status = null;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (SupportMenu.USER_MASK & readInt) {
                case 1:
                    status = (Status) zzb.zza(parcel, readInt, Status.CREATOR);
                    break;
                case 2:
                    locationSettingsStates = (LocationSettingsStates) zzb.zza(parcel, readInt, LocationSettingsStates.CREATOR);
                    break;
                default:
                    zzb.zzb(parcel, readInt);
                    break;
            }
        }
        zzb.zzF(parcel, zzd);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsResult[i];
    }
}
