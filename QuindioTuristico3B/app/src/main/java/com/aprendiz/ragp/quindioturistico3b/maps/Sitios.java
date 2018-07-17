package com.aprendiz.ragp.quindioturistico3b.maps;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.aprendiz.ragp.quindioturistico3b.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Sitios extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios);
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
        LatLng ubi1 = new LatLng(4.545695136892776, -75.67256734597161);
        mMap.addMarker(new MarkerOptions().position(ubi1).title("Centro Comercial Portal del Quindío."));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ubi1));


        LatLng ubi2 = new LatLng(4.537481262607865, -75.66655919777826);
        mMap.addMarker(new MarkerOptions().position(ubi2).title("Unicentro - Armenia."));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ubi2));

        LatLng ubi3 = new LatLng(4.5268715367044985, -75.68767354714349);
        mMap.addMarker(new MarkerOptions().position(ubi3).title("Calima Centro Comercial Armenia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ubi3));

        LatLng ubi4 = new LatLng(4.569482343671689, -75.74745929865719);
        mMap.addMarker(new MarkerOptions().position(ubi4).title("Parque del Café"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ubi4));

        LatLng ubi5 = new LatLng(4.622357223916545, -75.76650045717768);
        mMap.addMarker(new MarkerOptions().position(ubi5).title("Panaca"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ubi5));

        LatLng ubi6 = new LatLng(4.621929466163072, -75.76083563173823);
        mMap.addMarker(new MarkerOptions().position(ubi6).title("Salento"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ubi6));

        LatLng ubi7 = new LatLng(4.62470988694496, -75.7556428750854);
        mMap.addMarker(new MarkerOptions().position(ubi7).title("Eco Parque Peñas Blancas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ubi7));

        LatLng ubi8 = new LatLng(4.640840820686086, -75.56895314786989);
        mMap.addMarker(new MarkerOptions().position(ubi8).title("La Pequeña Granja de Mamá Lulú"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ubi8));

        LatLng ubi9 = new LatLng(4.531577482735009, -75.64214036690667);
        mMap.addMarker(new MarkerOptions().position(ubi9).title("Parque Los Arrieros "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ubi9));


    }
}
