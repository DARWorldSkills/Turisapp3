package com.aprendiz.ragp.quindioturistico3b.controllers;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aprendiz.ragp.quindioturistico3b.R;
import com.aprendiz.ragp.quindioturistico3b.maps.Todos;
import com.aprendiz.ragp.quindioturistico3b.models.GestorDB;
import com.aprendiz.ragp.quindioturistico3b.models.ListasSitios;
import com.aprendiz.ragp.quindioturistico3b.models.Sitio;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        inputData();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, MenuMapa.class);
                startActivity(intent);
                finish();
            }
        };

        Timer timer = new Timer();
        timer.schedule(timerTask,2000);
    }

    private void inputData() {
        GestorDB gestorDB = new GestorDB(this);
        SQLiteDatabase db = gestorDB.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM SITIOS",null);
        if (!cursor.moveToFirst()) {
            for (int i = 0; i < ListasSitios.listaHoteles.length; i++) {
                Sitio sitio = ListasSitios.listaHoteles[i];
                gestorDB.inputSitio(sitio);
            }
        }

        if (!cursor.moveToFirst()) {
            for (int i = 0; i < ListasSitios.listaRestaurantes.length; i++) {
                Sitio sitio = ListasSitios.listaRestaurantes[i];
                gestorDB.inputSitio(sitio);
            }
        }

        if (!cursor.moveToFirst()) {
            for (int i = 0; i < ListasSitios.listaSitios.length; i++) {
                Sitio sitio = ListasSitios.listaSitios[i];
                gestorDB.inputSitio(sitio);
            }
        }

        cursor.close();
        db.close();
    }
}
