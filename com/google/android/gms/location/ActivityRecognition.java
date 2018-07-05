package com.google.android.gms.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.internal.zzbax;
import com.google.android.gms.internal.zzcbs;
import com.google.android.gms.internal.zzcdi;

public class ActivityRecognition {
    public static final Api<NoOptions> API = new Api("ActivityRecognition.API", zzajS, zzajR);
    public static final ActivityRecognitionApi ActivityRecognitionApi = new zzcbs();
    public static final String CLIENT_NAME = "activity_recognition";
    private static final zzf<zzcdi> zzajR = new zzf();
    private static final com.google.android.gms.common.api.Api.zza<zzcdi, NoOptions> zzajS = new zza();

    public static abstract class zza<R extends Result> extends zzbax<R, zzcdi> {
        public zza(GoogleApiClient googleApiClient) {
            super(ActivityRecognition.API, googleApiClient);
        }

        public final /* bridge */ /* synthetic */ void setResult(Object obj) {
            super.setResult((Result) obj);
        }
    }

    private ActivityRecognition() {
    }
}
