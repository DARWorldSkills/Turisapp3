package com.aprendiz.ragp.quindioturistico3b.models;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class GestorDB extends SQLiteOpenHelper{
    public GestorDB(Context context) {
        super(context, Constants.DATABASE_NAME, null, Constants.DATABASE_VALUE);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Constants.script);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
