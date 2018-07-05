package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzbo;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlacesOptions;
import com.google.android.gms.location.places.zzm;
import java.util.Locale;

public final class zzaa extends zzz<zzp> {
    private final Locale zzbjV;
    private final zzat zzbko;

    private zzaa(Context context, Looper looper, zzq com_google_android_gms_common_internal_zzq, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str, PlacesOptions placesOptions) {
        super(context, looper, 67, com_google_android_gms_common_internal_zzq, connectionCallbacks, onConnectionFailedListener);
        this.zzbjV = Locale.getDefault();
        this.zzbko = new zzat(str, this.zzbjV, com_google_android_gms_common_internal_zzq.getAccount() != null ? com_google_android_gms_common_internal_zzq.getAccount().name : null, null, 0);
    }

    public final void zza(zzm com_google_android_gms_location_places_zzm, PlaceFilter placeFilter) throws RemoteException {
        if (placeFilter == null) {
            placeFilter = PlaceFilter.zzvS();
        }
        ((zzp) zzrf()).zza(placeFilter, this.zzbko, (zzv) com_google_android_gms_location_places_zzm);
    }

    public final void zza(zzm com_google_android_gms_location_places_zzm, PlaceReport placeReport) throws RemoteException {
        zzbo.zzu(placeReport);
        ((zzp) zzrf()).zza(placeReport, this.zzbko, (zzv) com_google_android_gms_location_places_zzm);
    }

    protected final /* synthetic */ IInterface zzd(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
        return queryLocalInterface instanceof zzp ? (zzp) queryLocalInterface : new zzq(iBinder);
    }

    protected final String zzdb() {
        return "com.google.android.gms.location.places.PlaceDetectionApi";
    }

    protected final String zzdc() {
        return "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
    }
}
