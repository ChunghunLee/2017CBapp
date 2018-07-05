package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.zzbh;
import com.google.android.gms.common.internal.zzbo;
import com.google.android.gms.internal.zzbar;
import com.google.android.gms.internal.zzbdv;
import com.google.android.gms.internal.zzbdx;
import com.google.android.gms.internal.zzbdz;
import com.google.android.gms.internal.zzbed;
import com.google.android.gms.internal.zzbeq;
import com.google.android.gms.internal.zzbex;
import com.google.android.gms.internal.zzccn;
import com.google.android.gms.internal.zzccu;
import com.google.android.gms.internal.zzcdm;
import com.google.android.gms.internal.zzcea;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public class FusedLocationProviderClient extends GoogleApi<NoOptions> {

    static class zza extends zzccu {
        private final TaskCompletionSource<Void> zzalE;

        public zza(TaskCompletionSource<Void> taskCompletionSource) {
            this.zzalE = taskCompletionSource;
        }

        public final void zza(zzccn com_google_android_gms_internal_zzccn) {
            zzbeq.zza(com_google_android_gms_internal_zzccn.getStatus(), null, this.zzalE);
        }
    }

    public FusedLocationProviderClient(@NonNull Activity activity) {
        super(activity, LocationServices.API, null, new zzbar());
    }

    public FusedLocationProviderClient(@NonNull Context context) {
        super(context, LocationServices.API, null, new zzbar());
    }

    public Task<Void> flushLocations() {
        return zzbh.zzb(LocationServices.FusedLocationApi.flushLocations(zzpi()));
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Location> getLastLocation() {
        return zza(new zze(this));
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<LocationAvailability> getLocationAvailability() {
        return zza(new zzf(this));
    }

    public Task<Void> removeLocationUpdates(PendingIntent pendingIntent) {
        return zzbh.zzb(LocationServices.FusedLocationApi.removeLocationUpdates(zzpi(), pendingIntent));
    }

    public Task<Void> removeLocationUpdates(LocationCallback locationCallback) {
        zzbdx zza = zzbdz.zza(locationCallback, LocationCallback.class.getSimpleName());
        zzbo.zzb((Object) zza, (Object) "Listener key cannot be null.");
        return this.zzaAN.zza((GoogleApi) this, zza);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent) {
        return zzbh.zzb(LocationServices.FusedLocationApi.requestLocationUpdates(zzpi(), locationRequest, pendingIntent));
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> requestLocationUpdates(LocationRequest locationRequest, LocationCallback locationCallback, @Nullable Looper looper) {
        zzcdm zza = zzcdm.zza(locationRequest);
        zzbdv zzb = zzbdz.zzb(locationCallback, zzcea.zzb(looper), LocationCallback.class.getSimpleName());
        zzbed com_google_android_gms_location_zzg = new zzg(this, zzb, zza, zzb);
        zzbex com_google_android_gms_location_zzh = new zzh(this, zzb.zzqG());
        zzbo.zzu(com_google_android_gms_location_zzg);
        zzbo.zzu(com_google_android_gms_location_zzh);
        zzbo.zzb(com_google_android_gms_location_zzg.zzqG(), (Object) "Listener has already been released.");
        zzbo.zzb(com_google_android_gms_location_zzh.zzqG(), (Object) "Listener has already been released.");
        zzbo.zzb(com_google_android_gms_location_zzg.zzqG().equals(com_google_android_gms_location_zzh.zzqG()), (Object) "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zzaAN.zza((GoogleApi) this, com_google_android_gms_location_zzg, com_google_android_gms_location_zzh);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> setMockLocation(Location location) {
        return zzbh.zzb(LocationServices.FusedLocationApi.setMockLocation(zzpi(), location));
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> setMockMode(boolean z) {
        return zzbh.zzb(LocationServices.FusedLocationApi.setMockMode(zzpi(), z));
    }
}
