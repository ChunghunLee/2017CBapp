package com.google.android.gms.internal;

import java.io.IOException;

public final class ik extends ada<ik> {
    public String[] zzbUQ;
    public int[] zzbUR;
    public byte[][] zzbUS;

    public ik() {
        this.zzbUQ = adj.EMPTY_STRING_ARRAY;
        this.zzbUR = adj.zzcsn;
        this.zzbUS = adj.zzcss;
        this.zzcrZ = null;
        this.zzcsi = -1;
    }

    public static ik zzz(byte[] bArr) throws adf {
        return (ik) adg.zza(new ik(), bArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ik)) {
            return false;
        }
        ik ikVar = (ik) obj;
        return !ade.equals(this.zzbUQ, ikVar.zzbUQ) ? false : !ade.equals(this.zzbUR, ikVar.zzbUR) ? false : !ade.zza(this.zzbUS, ikVar.zzbUS) ? false : (this.zzcrZ == null || this.zzcrZ.isEmpty()) ? ikVar.zzcrZ == null || ikVar.zzcrZ.isEmpty() : this.zzcrZ.equals(ikVar.zzcrZ);
    }

    public final int hashCode() {
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + ade.hashCode(this.zzbUQ)) * 31) + ade.hashCode(this.zzbUR)) * 31) + ade.zzc(this.zzbUS)) * 31;
        int hashCode2 = (this.zzcrZ == null || this.zzcrZ.isEmpty()) ? 0 : this.zzcrZ.hashCode();
        return hashCode2 + hashCode;
    }

    public final /* synthetic */ adg zza(acx com_google_android_gms_internal_acx) throws IOException {
        while (true) {
            int zzLy = com_google_android_gms_internal_acx.zzLy();
            int zzb;
            Object obj;
            switch (zzLy) {
                case 0:
                    break;
                case 10:
                    zzb = adj.zzb(com_google_android_gms_internal_acx, 10);
                    zzLy = this.zzbUQ == null ? 0 : this.zzbUQ.length;
                    obj = new String[(zzb + zzLy)];
                    if (zzLy != 0) {
                        System.arraycopy(this.zzbUQ, 0, obj, 0, zzLy);
                    }
                    while (zzLy < obj.length - 1) {
                        obj[zzLy] = com_google_android_gms_internal_acx.readString();
                        com_google_android_gms_internal_acx.zzLy();
                        zzLy++;
                    }
                    obj[zzLy] = com_google_android_gms_internal_acx.readString();
                    this.zzbUQ = obj;
                    continue;
                case 16:
                    zzb = adj.zzb(com_google_android_gms_internal_acx, 16);
                    zzLy = this.zzbUR == null ? 0 : this.zzbUR.length;
                    obj = new int[(zzb + zzLy)];
                    if (zzLy != 0) {
                        System.arraycopy(this.zzbUR, 0, obj, 0, zzLy);
                    }
                    while (zzLy < obj.length - 1) {
                        obj[zzLy] = com_google_android_gms_internal_acx.zzLD();
                        com_google_android_gms_internal_acx.zzLy();
                        zzLy++;
                    }
                    obj[zzLy] = com_google_android_gms_internal_acx.zzLD();
                    this.zzbUR = obj;
                    continue;
                case 18:
                    int zzcn = com_google_android_gms_internal_acx.zzcn(com_google_android_gms_internal_acx.zzLD());
                    zzb = com_google_android_gms_internal_acx.getPosition();
                    zzLy = 0;
                    while (com_google_android_gms_internal_acx.zzLI() > 0) {
                        com_google_android_gms_internal_acx.zzLD();
                        zzLy++;
                    }
                    com_google_android_gms_internal_acx.zzcp(zzb);
                    zzb = this.zzbUR == null ? 0 : this.zzbUR.length;
                    Object obj2 = new int[(zzLy + zzb)];
                    if (zzb != 0) {
                        System.arraycopy(this.zzbUR, 0, obj2, 0, zzb);
                    }
                    while (zzb < obj2.length) {
                        obj2[zzb] = com_google_android_gms_internal_acx.zzLD();
                        zzb++;
                    }
                    this.zzbUR = obj2;
                    com_google_android_gms_internal_acx.zzco(zzcn);
                    continue;
                case 26:
                    zzb = adj.zzb(com_google_android_gms_internal_acx, 26);
                    zzLy = this.zzbUS == null ? 0 : this.zzbUS.length;
                    obj = new byte[(zzb + zzLy)][];
                    if (zzLy != 0) {
                        System.arraycopy(this.zzbUS, 0, obj, 0, zzLy);
                    }
                    while (zzLy < obj.length - 1) {
                        obj[zzLy] = com_google_android_gms_internal_acx.readBytes();
                        com_google_android_gms_internal_acx.zzLy();
                        zzLy++;
                    }
                    obj[zzLy] = com_google_android_gms_internal_acx.readBytes();
                    this.zzbUS = obj;
                    continue;
                default:
                    if (!super.zza(com_google_android_gms_internal_acx, zzLy)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final void zza(acy com_google_android_gms_internal_acy) throws IOException {
        int i = 0;
        if (this.zzbUQ != null && this.zzbUQ.length > 0) {
            for (String str : this.zzbUQ) {
                if (str != null) {
                    com_google_android_gms_internal_acy.zzl(1, str);
                }
            }
        }
        if (this.zzbUR != null && this.zzbUR.length > 0) {
            for (int zzr : this.zzbUR) {
                com_google_android_gms_internal_acy.zzr(2, zzr);
            }
        }
        if (this.zzbUS != null && this.zzbUS.length > 0) {
            while (i < this.zzbUS.length) {
                byte[] bArr = this.zzbUS[i];
                if (bArr != null) {
                    com_google_android_gms_internal_acy.zzb(3, bArr);
                }
                i++;
            }
        }
        super.zza(com_google_android_gms_internal_acy);
    }

    protected final int zzn() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int zzn = super.zzn();
        if (this.zzbUQ == null || this.zzbUQ.length <= 0) {
            i = zzn;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.zzbUQ) {
                if (str != null) {
                    i3++;
                    i2 += acy.zzhQ(str);
                }
            }
            i = (zzn + i2) + (i3 * 1);
        }
        if (this.zzbUR != null && this.zzbUR.length > 0) {
            i3 = 0;
            for (int zzn2 : this.zzbUR) {
                i3 += acy.zzcr(zzn2);
            }
            i = (i + i3) + (this.zzbUR.length * 1);
        }
        if (this.zzbUS == null || this.zzbUS.length <= 0) {
            return i;
        }
        i2 = 0;
        i3 = 0;
        while (i4 < this.zzbUS.length) {
            byte[] bArr = this.zzbUS[i4];
            if (bArr != null) {
                i3++;
                i2 += acy.zzJ(bArr);
            }
            i4++;
        }
        return (i + i2) + (i3 * 1);
    }
}
