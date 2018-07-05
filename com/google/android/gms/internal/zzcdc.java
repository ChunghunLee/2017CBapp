package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzbo;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.zzj;
import com.google.android.gms.location.zzm;
import java.util.HashMap;
import java.util.Map;

public final class zzcdc {
    private final Context mContext;
    private final Map<zzbdx<LocationListener>, zzcdg> zzaWU = new HashMap();
    private final zzcds<zzccy> zzbiB;
    private ContentProviderClient zzbiM = null;
    private boolean zzbiN = false;
    private final Map<zzbdx<LocationCallback>, zzcdd> zzbiO = new HashMap();

    public zzcdc(Context context, zzcds<zzccy> com_google_android_gms_internal_zzcds_com_google_android_gms_internal_zzccy) {
        this.mContext = context;
        this.zzbiB = com_google_android_gms_internal_zzcds_com_google_android_gms_internal_zzccy;
    }

    private final zzcdg zzf(zzbdv<LocationListener> com_google_android_gms_internal_zzbdv_com_google_android_gms_location_LocationListener) {
        zzcdg com_google_android_gms_internal_zzcdg;
        synchronized (this.zzaWU) {
            com_google_android_gms_internal_zzcdg = (zzcdg) this.zzaWU.get(com_google_android_gms_internal_zzbdv_com_google_android_gms_location_LocationListener.zzqG());
            if (com_google_android_gms_internal_zzcdg == null) {
                com_google_android_gms_internal_zzcdg = new zzcdg(com_google_android_gms_internal_zzbdv_com_google_android_gms_location_LocationListener);
            }
            this.zzaWU.put(com_google_android_gms_internal_zzbdv_com_google_android_gms_location_LocationListener.zzqG(), com_google_android_gms_internal_zzcdg);
        }
        return com_google_android_gms_internal_zzcdg;
    }

    private final zzcdd zzg(zzbdv<LocationCallback> com_google_android_gms_internal_zzbdv_com_google_android_gms_location_LocationCallback) {
        zzcdd com_google_android_gms_internal_zzcdd;
        synchronized (this.zzbiO) {
            com_google_android_gms_internal_zzcdd = (zzcdd) this.zzbiO.get(com_google_android_gms_internal_zzbdv_com_google_android_gms_location_LocationCallback.zzqG());
            if (com_google_android_gms_internal_zzcdd == null) {
                com_google_android_gms_internal_zzcdd = new zzcdd(com_google_android_gms_internal_zzbdv_com_google_android_gms_location_LocationCallback);
            }
            this.zzbiO.put(com_google_android_gms_internal_zzbdv_com_google_android_gms_location_LocationCallback.zzqG(), com_google_android_gms_internal_zzcdd);
        }
        return com_google_android_gms_internal_zzcdd;
    }

    public final Location getLastLocation() {
        this.zzbiB.zzre();
        try {
            return ((zzccy) this.zzbiB.zzrf()).zzdv(this.mContext.getPackageName());
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public final void removeAllListeners() {
        try {
            synchronized (this.zzaWU) {
                for (zzm com_google_android_gms_location_zzm : this.zzaWU.values()) {
                    if (com_google_android_gms_location_zzm != null) {
                        ((zzccy) this.zzbiB.zzrf()).zza(zzcdo.zza(com_google_android_gms_location_zzm, null));
                    }
                }
                this.zzaWU.clear();
            }
            synchronized (this.zzbiO) {
                for (zzj com_google_android_gms_location_zzj : this.zzbiO.values()) {
                    if (com_google_android_gms_location_zzj != null) {
                        ((zzccy) this.zzbiB.zzrf()).zza(zzcdo.zza(com_google_android_gms_location_zzj, null));
                    }
                }
                this.zzbiO.clear();
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zza(PendingIntent pendingIntent, zzcct com_google_android_gms_internal_zzcct) throws RemoteException {
        this.zzbiB.zzre();
        ((zzccy) this.zzbiB.zzrf()).zza(new zzcdo(2, null, null, pendingIntent, null, com_google_android_gms_internal_zzcct != null ? com_google_android_gms_internal_zzcct.asBinder() : null));
    }

    public final void zza(zzbdx<LocationListener> com_google_android_gms_internal_zzbdx_com_google_android_gms_location_LocationListener, zzcct com_google_android_gms_internal_zzcct) throws RemoteException {
        this.zzbiB.zzre();
        zzbo.zzb((Object) com_google_android_gms_internal_zzbdx_com_google_android_gms_location_LocationListener, (Object) "Invalid null listener key");
        synchronized (this.zzaWU) {
            zzm com_google_android_gms_location_zzm = (zzcdg) this.zzaWU.remove(com_google_android_gms_internal_zzbdx_com_google_android_gms_location_LocationListener);
            if (com_google_android_gms_location_zzm != null) {
                com_google_android_gms_location_zzm.release();
                ((zzccy) this.zzbiB.zzrf()).zza(zzcdo.zza(com_google_android_gms_location_zzm, com_google_android_gms_internal_zzcct));
            }
        }
    }

    public final void zza(zzcct com_google_android_gms_internal_zzcct) throws RemoteException {
        this.zzbiB.zzre();
        ((zzccy) this.zzbiB.zzrf()).zza(com_google_android_gms_internal_zzcct);
    }

    public final void zza(zzcdm com_google_android_gms_internal_zzcdm, zzbdv<LocationCallback> com_google_android_gms_internal_zzbdv_com_google_android_gms_location_LocationCallback, zzcct com_google_android_gms_internal_zzcct) throws RemoteException {
        this.zzbiB.zzre();
        ((zzccy) this.zzbiB.zzrf()).zza(new zzcdo(1, com_google_android_gms_internal_zzcdm, null, null, zzg(com_google_android_gms_internal_zzbdv_com_google_android_gms_location_LocationCallback).asBinder(), com_google_android_gms_internal_zzcct != null ? com_google_android_gms_internal_zzcct.asBinder() : null));
    }

    public final void zza(LocationRequest locationRequest, PendingIntent pendingIntent, zzcct com_google_android_gms_internal_zzcct) throws RemoteException {
        this.zzbiB.zzre();
        ((zzccy) this.zzbiB.zzrf()).zza(new zzcdo(1, zzcdm.zza(locationRequest), null, pendingIntent, null, com_google_android_gms_internal_zzcct != null ? com_google_android_gms_internal_zzcct.asBinder() : null));
    }

    public final void zza(LocationRequest locationRequest, zzbdv<LocationListener> com_google_android_gms_internal_zzbdv_com_google_android_gms_location_LocationListener, zzcct com_google_android_gms_internal_zzcct) throws RemoteException {
        this.zzbiB.zzre();
        ((zzccy) this.zzbiB.zzrf()).zza(new zzcdo(1, zzcdm.zza(locationRequest), zzf(com_google_android_gms_internal_zzbdv_com_google_android_gms_location_LocationListener).asBinder(), null, null, com_google_android_gms_internal_zzcct != null ? com_google_android_gms_internal_zzcct.asBinder() : null));
    }

    public final void zzai(boolean z) throws RemoteException {
        this.zzbiB.zzre();
        ((zzccy) this.zzbiB.zzrf()).zzai(z);
        this.zzbiN = z;
    }

    public final void zzb(zzbdx<LocationCallback> com_google_android_gms_internal_zzbdx_com_google_android_gms_location_LocationCallback, zzcct com_google_android_gms_internal_zzcct) throws RemoteException {
        this.zzbiB.zzre();
        zzbo.zzb((Object) com_google_android_gms_internal_zzbdx_com_google_android_gms_location_LocationCallback, (Object) "Invalid null listener key");
        synchronized (this.zzbiO) {
            zzj com_google_android_gms_location_zzj = (zzcdd) this.zzbiO.remove(com_google_android_gms_internal_zzbdx_com_google_android_gms_location_LocationCallback);
            if (com_google_android_gms_location_zzj != null) {
                com_google_android_gms_location_zzj.release();
                ((zzccy) this.zzbiB.zzrf()).zza(zzcdo.zza(com_google_android_gms_location_zzj, com_google_android_gms_internal_zzcct));
            }
        }
    }

    public final void zzc(Location location) throws RemoteException {
        this.zzbiB.zzre();
        ((zzccy) this.zzbiB.zzrf()).zzc(location);
    }

    public final LocationAvailability zzvQ() {
        this.zzbiB.zzre();
        try {
            return ((zzccy) this.zzbiB.zzrf()).zzdw(this.mContext.getPackageName());
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzvR() {
        if (this.zzbiN) {
            try {
                zzai(false);
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
