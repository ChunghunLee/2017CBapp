package com.chan.testapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import android.widget.Filterable;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.ArrayList;
import java.util.Iterator;
import noman.googleplaces.Place;

class CustomAdapter extends ArrayAdapter implements Filterable {
    private static LayoutInflater inflater = null;
    String[] PhoneNumber;
    String[] UrlName;
    String[] address;
    Context context;
    private ArrayList<Place> filteredItemList = this.listViewItemList;
    private Place[] item_places;
    Filter listFilter;
    Place listViewItem;
    private ArrayList<Place> listViewItemList = new ArrayList();
    GoogleMap mGoogleMap;
    Bitmap[] place_image;

    private class ListFilter extends Filter {
        private ListFilter() {
        }

        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();
            if (constraint == null || constraint.length() == 0) {
                results.values = CustomAdapter.this.listViewItemList;
                results.count = CustomAdapter.this.listViewItemList.size();
            } else {
                ArrayList<Place> itemList = new ArrayList();
                Iterator it = CustomAdapter.this.listViewItemList.iterator();
                while (it.hasNext()) {
                    Place item = (Place) it.next();
                    if (item.getName().toUpperCase().contains(constraint.toString().toUpperCase())) {
                        itemList.add(item);
                    }
                }
                results.values = itemList;
                results.count = itemList.size();
            }
            return results;
        }

        protected void publishResults(CharSequence constraint, FilterResults results) {
            CustomAdapter.this.filteredItemList = (ArrayList) results.values;
            if (results.count > 0) {
                CustomAdapter.this.notifyDataSetChanged();
            } else {
                CustomAdapter.this.notifyDataSetInvalidated();
            }
        }
    }

    @NonNull
    public Filter getFilter() {
        if (this.listFilter == null) {
            this.listFilter = new ListFilter();
        }
        return this.listFilter;
    }

    public CustomAdapter(Context context, Place[] item_places, String[] PhoneNumber, String[] UrlName, String[] address, Bitmap[] image, GoogleMap mGoogleMap) {
        super(context, C0273R.layout.listview_inflate, item_places);
        this.item_places = item_places;
        this.PhoneNumber = PhoneNumber;
        this.place_image = image;
        this.UrlName = UrlName;
        this.address = address;
        this.context = context;
        this.mGoogleMap = mGoogleMap;
    }

    public int getCount() {
        return this.filteredItemList.size();
    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        View listview_inflate = ((Activity) this.context).getLayoutInflater().inflate(C0273R.layout.listview_inflate, null);
        ImageButton imagebutton = (ImageButton) listview_inflate.findViewById(C0273R.id.imageButton);
        TextView txt = (TextView) listview_inflate.findViewById(C0273R.id.textView1);
        TextView txt2 = (TextView) listview_inflate.findViewById(C0273R.id.textView2);
        Log.e("tag", "filtersize" + this.filteredItemList.size());
        Log.e("tag", "position " + position);
        if (position < this.filteredItemList.size()) {
            this.listViewItem = (Place) this.filteredItemList.get(position);
            txt.setText(this.listViewItem.getName());
            txt2.setText(this.address[position]);
            Log.e("tag", this.listViewItem.getName());
        }
        listview_inflate.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                int new_position = position;
                for (int i = 0; i < CustomAdapter.this.item_places.length; i++) {
                    if (CustomAdapter.this.item_places[i].getPlaceId().equals(((Place) CustomAdapter.this.filteredItemList.get(position)).getPlaceId())) {
                        new_position = i;
                    }
                }
                final int new_pos = new_position;
                LatLng currentlatLng = new LatLng(CustomAdapter.this.item_places[new_pos].getLatitude(), CustomAdapter.this.item_places[new_pos].getLongitude());
                CustomAdapter.this.mGoogleMap.moveCamera(CameraUpdateFactory.newLatLng(currentlatLng));
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.position(currentlatLng);
                markerOptions.title(CustomAdapter.this.item_places[new_pos].getName());
                markerOptions.snippet(CustomAdapter.this.item_places[new_pos].getVicinity());
                CustomAdapter.this.mGoogleMap.addMarker(markerOptions).showInfoWindow();
                CustomAdapter.this.mGoogleMap.setOnInfoWindowClickListener(new OnInfoWindowClickListener() {
                    public void onInfoWindowClick(Marker marker) {
                        Intent intent = new Intent(".ThirdActivity");
                        intent.putExtra("place_name", CustomAdapter.this.item_places[new_pos].getName());
                        intent.putExtra("place_addr", CustomAdapter.this.address[new_pos]);
                        intent.putExtra("place_PhoneNumber", CustomAdapter.this.PhoneNumber[new_pos]);
                        intent.putExtra("place_UrlName", CustomAdapter.this.UrlName[new_pos]);
                        CustomAdapter.this.context.startActivity(new Intent(intent));
                    }
                });
            }
        });
        imagebutton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                int new_position = position;
                for (int i = 0; i < CustomAdapter.this.item_places.length; i++) {
                    if (CustomAdapter.this.item_places[i].getPlaceId().equals(((Place) CustomAdapter.this.filteredItemList.get(position)).getPlaceId())) {
                        new_position = i;
                    }
                }
                Intent intent = new Intent(".ThirdActivity");
                intent.putExtra("place_name", CustomAdapter.this.item_places[new_position].getName());
                intent.putExtra("place_addr", CustomAdapter.this.address[new_position]);
                intent.putExtra("place_PhoneNumber", CustomAdapter.this.PhoneNumber[new_position]);
                intent.putExtra("place_UrlName", CustomAdapter.this.UrlName[new_position]);
                CustomAdapter.this.context.startActivity(new Intent(intent));
            }
        });
        return listview_inflate;
    }

    @Nullable
    public Object getItem(int position) {
        return this.filteredItemList.get(position);
    }

    public long getItemId(int position) {
        return (long) position;
    }

    public void addItem() {
        Place item = new Place();
        for (Place item2 : this.item_places) {
            this.listViewItemList.add(item2);
        }
    }
}
