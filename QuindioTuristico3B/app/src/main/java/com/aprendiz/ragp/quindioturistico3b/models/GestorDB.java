package com.aprendiz.ragp.quindioturistico3b.models;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class GestorDB extends SQLiteOpenHelper{
    public GestorDB(Context context) {
        super(context, Constants.DATABASE_NAME, null, Constants.DATABASE_VALUE);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Constants.script);
    }

    public void inputSitio(Sitio sitio){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("IMAGEN", Integer.toString(sitio.getImagen()));
        values.put("NOMBRE",sitio.getNombre());
        values.put("DESCRIPCIONC",sitio.getDescripcionc());
        values.put("UBICACION",sitio.getUbicacion());
        values.put("DESCRIPCION",sitio.getDescripcion());
        values.put("LATITUD",sitio.getLatitud());
        values.put("LONGITUD",sitio.getLongitud());
        values.put("LUGAR",sitio.getLugar());
        db.insert("SITIOS",null,values);
        db.close();
    }

    public List<Sitio> listarSitios(String lugar){
        List<Sitio> results = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM SITIOS WHERE LUGAR='"+lugar+"'; ",null);
        if (cursor.moveToFirst()){
            do {
                Sitio sitio = new Sitio();
                sitio.setImagen(Integer.parseInt(cursor.getString(0)));
                sitio.setNombre(cursor.getString(1));
                sitio.setDescripcionc(cursor.getString(2));
                sitio.setUbicacion(cursor.getString(3));
                sitio.setDescripcion(cursor.getString(4));
                sitio.setLatitud(cursor.getFloat(5));
                sitio.setLongitud(cursor.getFloat(6));
                sitio.setLugar(cursor.getString(7));

                results.add(sitio);

            }while (cursor.moveToNext());
        }

        cursor.close();
        db.close();

        return results;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
