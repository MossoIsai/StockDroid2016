package com.mossin.org.invetary_app;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BDHelper extends SQLiteOpenHelper {
    //Contructor
    public BDHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
     //Metodo para Crear la Base de Datos
        db.execSQL(recursoBD.creaCargo);
        db.execSQL(recursoBD.creaPrivilegio);
        db.execSQL(recursoBD.creaUsuario);

        /*Pruebas en consola*/
        System.err.println(recursoBD.creaCargo);
        System.err.println(recursoBD.creaPrivilegio);
        System.err.println(recursoBD.creaUsuario);

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
