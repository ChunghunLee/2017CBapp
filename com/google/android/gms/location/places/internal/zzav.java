package com.google.android.gms.location.places.internal;

import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zze;
import com.google.android.gms.internal.ik;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class zzav extends zzc {
    public zzav(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    private final byte[] zzb(String str, byte[] bArr) {
        return (!zzcv(str) || zzcx(str)) ? null : getByteArray(str);
    }

    protected final String zzD(String str, String str2) {
        return (!zzcv(str) || zzcx(str)) ? str2 : getString(str);
    }

    protected final float zza(String str, float f) {
        return (!zzcv(str) || zzcx(str)) ? f : getFloat(str);
    }

    protected final <E extends SafeParcelable> E zza(String str, Creator<E> creator) {
        byte[] zzb = zzb(str, null);
        return zzb == null ? null : zze.zza(zzb, creator);
    }

    protected final <E extends SafeParcelable> List<E> zza(String str, Creator<E> creator, List<E> list) {
        byte[] zzb = zzb(str, null);
        if (zzb == null) {
            return list;
        }
        try {
            ik zzz = ik.zzz(zzb);
            if (zzz.zzbUS == null) {
                return list;
            }
            List<E> arrayList = new ArrayList(zzz.zzbUS.length);
            for (byte[] zza : zzz.zzbUS) {
                arrayList.add(zze.zza(zza, creator));
            }
            return arrayList;
        } catch (Throwable e) {
            if (!Log.isLoggable("SafeDataBufferRef", 6)) {
                return list;
            }
            Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
            return list;
        }
    }

    protected final List<Integer> zza(String str, List<Integer> list) {
        byte[] zzb = zzb(str, null);
        if (zzb == null) {
            return list;
        }
        try {
            ik zzz = ik.zzz(zzb);
            if (zzz.zzbUR == null) {
                return list;
            }
            List<Integer> arrayList = new ArrayList(zzz.zzbUR.length);
            for (int valueOf : zzz.zzbUR) {
                arrayList.add(Integer.valueOf(valueOf));
            }
            return arrayList;
        } catch (Throwable e) {
            if (!Log.isLoggable("SafeDataBufferRef", 6)) {
                return list;
            }
            Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
            return list;
        }
    }

    protected final List<String> zzb(String str, List<String> list) {
        byte[] zzb = zzb(str, null);
        if (zzb != null) {
            try {
                ik zzz = ik.zzz(zzb);
                if (zzz.zzbUQ != null) {
                    list = Arrays.asList(zzz.zzbUQ);
                }
            } catch (Throwable e) {
                if (Log.isLoggable("SafeDataBufferRef", 6)) {
                    Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
                }
            }
        }
        return list;
    }

    protected final int zzu(String str, int i) {
        return (!zzcv(str) || zzcx(str)) ? i : getInteger(str);
    }
}
