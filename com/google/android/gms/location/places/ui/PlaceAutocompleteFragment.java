package com.google.android.gms.location.places.ui;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.gms.C0286R;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceAutocomplete.IntentBuilder;
import com.google.android.gms.maps.model.LatLngBounds;

@TargetApi(12)
public class PlaceAutocompleteFragment extends Fragment {
    private View zzblm;
    private View zzbln;
    private EditText zzblo;
    private boolean zzblp;
    @Nullable
    private LatLngBounds zzblq;
    @Nullable
    private AutocompleteFilter zzblr;
    @Nullable
    private PlaceSelectionListener zzbls;

    private final void zzwb() {
        int i = 0;
        int i2 = !this.zzblo.getText().toString().isEmpty() ? 1 : 0;
        View view = this.zzbln;
        if (i2 == 0) {
            i = 8;
        }
        view.setVisibility(i);
    }

    private final void zzwc() {
        int i;
        int connectionStatusCode;
        try {
            Intent build = new IntentBuilder(2).setBoundsBias(this.zzblq).setFilter(this.zzblr).zzdB(this.zzblo.getText().toString()).zzbn(1).build(getActivity());
            this.zzblp = true;
            startActivityForResult(build, 30421);
            i = -1;
        } catch (Throwable e) {
            connectionStatusCode = e.getConnectionStatusCode();
            Log.e("Places", "Could not open autocomplete activity", e);
            i = connectionStatusCode;
        } catch (Throwable e2) {
            connectionStatusCode = e2.errorCode;
            Log.e("Places", "Could not open autocomplete activity", e2);
            i = connectionStatusCode;
        }
        if (i != -1) {
            GoogleApiAvailability.getInstance().showErrorDialogFragment(getActivity(), i, 30422);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.zzblp = false;
        if (i == 30421) {
            if (i2 == -1) {
                Place place = PlaceAutocomplete.getPlace(getActivity(), intent);
                if (this.zzbls != null) {
                    this.zzbls.onPlaceSelected(place);
                }
                setText(place.getName().toString());
            } else if (i2 == 2) {
                Status status = PlaceAutocomplete.getStatus(getActivity(), intent);
                if (this.zzbls != null) {
                    this.zzbls.onError(status);
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0286R.layout.place_autocomplete_fragment, viewGroup, false);
        this.zzblm = inflate.findViewById(C0286R.id.place_autocomplete_search_button);
        this.zzbln = inflate.findViewById(C0286R.id.place_autocomplete_clear_button);
        this.zzblo = (EditText) inflate.findViewById(C0286R.id.place_autocomplete_search_input);
        OnClickListener com_google_android_gms_location_places_ui_zzc = new zzc(this);
        this.zzblm.setOnClickListener(com_google_android_gms_location_places_ui_zzc);
        this.zzblo.setOnClickListener(com_google_android_gms_location_places_ui_zzc);
        this.zzbln.setOnClickListener(new zzd(this));
        zzwb();
        return inflate;
    }

    public void onDestroyView() {
        this.zzblm = null;
        this.zzbln = null;
        this.zzblo = null;
        super.onDestroyView();
    }

    public void setBoundsBias(@Nullable LatLngBounds latLngBounds) {
        this.zzblq = latLngBounds;
    }

    public void setFilter(@Nullable AutocompleteFilter autocompleteFilter) {
        this.zzblr = autocompleteFilter;
    }

    public void setHint(CharSequence charSequence) {
        this.zzblo.setHint(charSequence);
        this.zzblm.setContentDescription(charSequence);
    }

    public void setOnPlaceSelectedListener(PlaceSelectionListener placeSelectionListener) {
        this.zzbls = placeSelectionListener;
    }

    public void setText(CharSequence charSequence) {
        this.zzblo.setText(charSequence);
        zzwb();
    }
}
