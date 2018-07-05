package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

public final class zzad implements Creator<PlaceEntity> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzb.zzd(parcel);
        String str = null;
        List list = null;
        List list2 = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list3 = null;
        LatLng latLng = null;
        float f = 0.0f;
        LatLngBounds latLngBounds = null;
        String str6 = null;
        Uri uri = null;
        boolean z = false;
        float f2 = 0.0f;
        int i = 0;
        zzaj com_google_android_gms_location_places_internal_zzaj = null;
        zzal com_google_android_gms_location_places_internal_zzal = null;
        zzae com_google_android_gms_location_places_internal_zzae = null;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (SupportMenu.USER_MASK & readInt) {
                case 1:
                    str = zzb.zzq(parcel, readInt);
                    break;
                case 2:
                    bundle = zzb.zzs(parcel, readInt);
                    break;
                case 3:
                    com_google_android_gms_location_places_internal_zzaj = (zzaj) zzb.zza(parcel, readInt, zzaj.CREATOR);
                    break;
                case 4:
                    latLng = (LatLng) zzb.zza(parcel, readInt, LatLng.CREATOR);
                    break;
                case 5:
                    f = zzb.zzl(parcel, readInt);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) zzb.zza(parcel, readInt, LatLngBounds.CREATOR);
                    break;
                case 7:
                    str6 = zzb.zzq(parcel, readInt);
                    break;
                case 8:
                    uri = (Uri) zzb.zza(parcel, readInt, Uri.CREATOR);
                    break;
                case 9:
                    z = zzb.zzc(parcel, readInt);
                    break;
                case 10:
                    f2 = zzb.zzl(parcel, readInt);
                    break;
                case 11:
                    i = zzb.zzg(parcel, readInt);
                    break;
                case 13:
                    list2 = zzb.zzB(parcel, readInt);
                    break;
                case 14:
                    str3 = zzb.zzq(parcel, readInt);
                    break;
                case 15:
                    str4 = zzb.zzq(parcel, readInt);
                    break;
                case 16:
                    str5 = zzb.zzq(parcel, readInt);
                    break;
                case 17:
                    list3 = zzb.zzC(parcel, readInt);
                    break;
                case 19:
                    str2 = zzb.zzq(parcel, readInt);
                    break;
                case 20:
                    list = zzb.zzB(parcel, readInt);
                    break;
                case 21:
                    com_google_android_gms_location_places_internal_zzal = (zzal) zzb.zza(parcel, readInt, zzal.CREATOR);
                    break;
                case 22:
                    com_google_android_gms_location_places_internal_zzae = (zzae) zzb.zza(parcel, readInt, zzae.CREATOR);
                    break;
                default:
                    zzb.zzb(parcel, readInt);
                    break;
            }
        }
        zzb.zzF(parcel, zzd);
        return new PlaceEntity(str, list, list2, bundle, str2, str3, str4, str5, list3, latLng, f, latLngBounds, str6, uri, z, f2, i, com_google_android_gms_location_places_internal_zzaj, com_google_android_gms_location_places_internal_zzal, com_google_android_gms_location_places_internal_zzae);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PlaceEntity[i];
    }
}
