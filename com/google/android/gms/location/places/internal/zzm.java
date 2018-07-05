package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzbo;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.AutocompleteFilter.Builder;
import com.google.android.gms.location.places.PlacesOptions;
import com.google.android.gms.location.places.zzd;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import java.util.Locale;

public final class zzm extends zzz<zzr> {
    private final zzat zzbko;

    private zzm(Context context, Looper looper, zzq com_google_android_gms_common_internal_zzq, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str, PlacesOptions placesOptions) {
        super(context, looper, 65, com_google_android_gms_common_internal_zzq, connectionCallbacks, onConnectionFailedListener);
        this.zzbko = new zzat(str, Locale.getDefault(), com_google_android_gms_common_internal_zzq.getAccount() != null ? com_google_android_gms_common_internal_zzq.getAccount().name : null, null, 0);
    }

    public final void zza(zzd com_google_android_gms_location_places_zzd, String str) throws RemoteException {
        zzbo.zzb((Object) str, (Object) "placeId cannot be null");
        ((zzr) zzrf()).zza(str, this.zzbko, (zzt) com_google_android_gms_location_places_zzd);
    }

    public final void zza(zzd com_google_android_gms_location_places_zzd, String str, int i, int i2, int i3) throws RemoteException {
        boolean z = true;
        zzbo.zzb((Object) str, (Object) "fifeUrl cannot be null");
        zzbo.zzb(i > 0, (Object) "width should be > 0");
        if (i <= 0) {
            z = false;
        }
        zzbo.zzb(z, (Object) "height should be > 0");
        ((zzr) zzrf()).zza(str, i, i2, i3, this.zzbko, com_google_android_gms_location_places_zzd);
    }

    public final void zza(com.google.android.gms.location.places.zzm com_google_android_gms_location_places_zzm, AddPlaceRequest addPlaceRequest) throws RemoteException {
        zzbo.zzb((Object) addPlaceRequest, (Object) "userAddedPlace == null");
        ((zzr) zzrf()).zza(addPlaceRequest, this.zzbko, (zzv) com_google_android_gms_location_places_zzm);
    }

    public final void zza(com.google.android.gms.location.places.zzm com_google_android_gms_location_places_zzm, String str, @Nullable LatLngBounds latLngBounds, @Nullable AutocompleteFilter autocompleteFilter) throws RemoteException {
        zzbo.zzb((Object) com_google_android_gms_location_places_zzm, (Object) "callback == null");
        ((zzr) zzrf()).zza(str == null ? "" : str, latLngBounds, autocompleteFilter == null ? new Builder().build() : autocompleteFilter, this.zzbko, com_google_android_gms_location_places_zzm);
    }

    public final void zza(com.google.android.gms.location.places.zzm com_google_android_gms_location_places_zzm, List<String> list) throws RemoteException {
        ((zzr) zzrf()).zza((List) list, this.zzbko, (zzv) com_google_android_gms_location_places_zzm);
    }

    protected final /* synthetic */ IInterface zzd(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
        return queryLocalInterface instanceof zzr ? (zzr) queryLocalInterface : new zzs(iBinder);
    }

    protected final String zzdb() {
        return "com.google.android.gms.location.places.GeoDataApi";
    }

    protected final String zzdc() {
        return "com.google.android.gms.location.places.internal.IGooglePlacesService";
    }
}
