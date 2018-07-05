package com.google.android.gms.location.places.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

public interface zzr extends IInterface {
    void zza(AddPlaceRequest addPlaceRequest, zzat com_google_android_gms_location_places_internal_zzat, zzv com_google_android_gms_location_places_internal_zzv) throws RemoteException;

    void zza(String str, int i, int i2, int i3, zzat com_google_android_gms_location_places_internal_zzat, zzt com_google_android_gms_location_places_internal_zzt) throws RemoteException;

    void zza(String str, zzat com_google_android_gms_location_places_internal_zzat, zzt com_google_android_gms_location_places_internal_zzt) throws RemoteException;

    void zza(String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter, zzat com_google_android_gms_location_places_internal_zzat, zzv com_google_android_gms_location_places_internal_zzv) throws RemoteException;

    void zza(List<String> list, zzat com_google_android_gms_location_places_internal_zzat, zzv com_google_android_gms_location_places_internal_zzv) throws RemoteException;
}
