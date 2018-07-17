package com.aprendiz.ragp.quindioturistico3b.maps;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.aprendiz.ragp.quindioturistico3b.R;
import com.aprendiz.ragp.quindioturistico3b.models.Sitio;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class Ubi extends FragmentActivity implements OnMapReadyCallback {

    LocationManager locationManager;
    Location location;
    private GoogleMap mMap;
    Marker marker;
    double latitud = 0.0;
    double longitud = 0.0;

    final  int MY_LOCATION = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubi);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        miUbicacion();

    }


    public void agregarMarcador(double latitud, double longitud) {

        LatLng marac = new LatLng(latitud, longitud);
        CameraUpdate miubicacion = CameraUpdateFactory.newLatLngZoom( marac, 14);
        if (marker != null) marker.remove();
        marker =mMap.addMarker(new MarkerOptions().position(marac).title("Aquí Estas"));
        mMap.animateCamera(miubicacion);
    }


    public void actualizarUbicacion() {

        if (location != null){
            latitud = location.getLatitude();
            longitud = location.getLongitude();
            agregarMarcador(latitud, longitud);
        }
    }


    LocationListener locationListener = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {
            actualizarUbicacion();
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onProviderDisabled(String provider) {

        }
    };

    private void miUbicacion() {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED)
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, MY_LOCATION);

        {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED){
                return;
            }

            locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            location= locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
            actualizarUbicacion();
            locationManager.requestLocationUpdates(locationManager.GPS_PROVIDER, 1500, 0, locationListener);
        }
    }
}
