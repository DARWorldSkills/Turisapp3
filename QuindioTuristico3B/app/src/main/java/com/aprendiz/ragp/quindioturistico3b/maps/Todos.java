package com.aprendiz.ragp.quindioturistico3b.maps;

import android.graphics.Camera;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.aprendiz.ragp.quindioturistico3b.R;
import com.aprendiz.ragp.quindioturistico3b.models.ListasSitios;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Todos extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todos);
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

        // Add a marker in Sydney and move the camera

        LatLng ubi1 = new LatLng(4.447555758701706, -75.78938483278806);
        mMap.addMarker(new MarkerOptions().position(ubi1).title("Allure Aroma Mocawa Hotel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ubi1));


        LatLng ubi2 = new LatLng(4.45234778794663, -75.78196047823484);
        mMap.addMarker(new MarkerOptions().position(ubi2).title("Hotel Bolivar Plaza"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ubi2));

        LatLng ubi3 = new LatLng(4.624838213794354, -75.762595160852);
        mMap.addMarker(new MarkerOptions().position(ubi3).title("Hotel Bolivar Plaza"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ubi3));

        LatLng ubi4 = new LatLng(4.637932138866702, -75.57060538862306);
        mMap.addMarker(new MarkerOptions().position(ubi4).title("Hotel Zuldemayda"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ubi4));

        LatLng ubi5 = new LatLng(4.622357223916545, -75.76650045717768);
        mMap.addMarker(new MarkerOptions().position(ubi5).title("Hotel Decameron Panaca"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ubi5));

        LatLng ubi6 = new LatLng(4.621929466163072, -75.76083563173823);
        mMap.addMarker(new MarkerOptions().position(ubi6).title("Decameron Las Heliconias"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ubi6));

        LatLng ubi7 = new LatLng(4.5659102936329115, -75.75595653681637);
        mMap.addMarker(new MarkerOptions().position(ubi7).title("Hotel Arrayanes del Quindio"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ubi7));

        LatLng ubi8 = new LatLng(4.566295305869581, -75.75057066111447);
        mMap.addMarker(new MarkerOptions().position(ubi8).title("Finca Hotel La Esperanza"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ubi8));


    }
}
