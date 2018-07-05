package com.google.android.gms.location.places.internal;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.util.Collection;
import java.util.List;

public final class zzg {
    public static CharSequence zza(String str, List<zzb> list, CharacterStyle characterStyle) {
        if (characterStyle == null) {
            return str;
        }
        CharSequence spannableString = new SpannableString(str);
        for (zzb com_google_android_gms_location_places_internal_zzb : list) {
            spannableString.setSpan(CharacterStyle.wrap(characterStyle), com_google_android_gms_location_places_internal_zzb.mOffset, com_google_android_gms_location_places_internal_zzb.mLength + com_google_android_gms_location_places_internal_zzb.mOffset, 0);
        }
        return spannableString;
    }

    public static String zzi(Collection<String> collection) {
        return (collection == null || collection.isEmpty()) ? null : TextUtils.join(", ", collection);
    }
}
