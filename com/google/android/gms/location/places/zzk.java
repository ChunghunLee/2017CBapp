package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.zzb;

public final class zzk implements Creator<PlacePhotoResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzb.zzd(parcel);
        BitmapTeleporter bitmapTeleporter = null;
        Status status = null;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (SupportMenu.USER_MASK & readInt) {
                case 1:
                    status = (Status) zzb.zza(parcel, readInt, Status.CREATOR);
                    break;
                case 2:
                    bitmapTeleporter = (BitmapTeleporter) zzb.zza(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                default:
                    zzb.zzb(parcel, readInt);
                    break;
            }
        }
        zzb.zzF(parcel, zzd);
        return new PlacePhotoResult(status, bitmapTeleporter);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PlacePhotoResult[i];
    }
}
