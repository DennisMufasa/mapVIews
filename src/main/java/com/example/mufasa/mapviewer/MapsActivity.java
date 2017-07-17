package com.example.mufasa.mapviewer;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;


import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng nairobi = new LatLng(1.296115, 36.804718);
        mMap.addMarker(new MarkerOptions().position(nairobi).title("Nairobi Branch"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nairobi));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(17.0f));

        LatLng WestBranch= new LatLng(1.2683,36.8111);
        mMap.addMarker(new MarkerOptions().position(WestBranch).title("Nairobi Hospital Westlands Branch"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(WestBranch));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(17.0f));


        LatLng KahawaBranch= new LatLng(1.2683,36.8111);
        mMap.addMarker(new MarkerOptions().position(KahawaBranch).title("Nairobi Hospital Kahawa Branch"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KahawaBranch));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(17.0f));

        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
               if (marker.getTitle().toString()=="Nairobi"){
                   // Add a marker in Nairobi and move the camera


                   Toast.makeText(MapsActivity.this, "This is the CBD Branch of Nairobi Hospital", Toast.LENGTH_SHORT).show();


               }else if (marker.getTitle().toString()=="Nairobi Hospital Westlands Branch"){

                   Toast.makeText(MapsActivity.this, "This is the Westlands Branch of Nairobi Hospital", Toast.LENGTH_SHORT).show();

               }else{

                   Toast.makeText(MapsActivity.this, "This is the Kahawa Branch of Nairobi Hospital", Toast.LENGTH_SHORT).show();
               }
            }
        });
    }
}
