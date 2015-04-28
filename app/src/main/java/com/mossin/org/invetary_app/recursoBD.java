package com.mossin.org.invetary_app;
import android.provider.BaseColumns;

public class recursoBD {

    public static final String NAME_DATABASE = "CAPUFEINVETARIOV1";
    public static final int VERSION_DATABASE = 1;
    public static final String TABLA_USUARIO = "USUARIO";
    public static final String TABLA_CARGO = "CARGO";
    public static final String TABLA_PRIVILEGIO = "PRIVILEGIO";
    public static final String TABLA_EJE = "EJE";
    public static final String TABLA_TRAMO = "TRAMO";
    public static final String TABLA_PRINCIPAL = "PRINCIPAL";
    public static final String TABLA_OBJETO = "OBJETO";

    public static class Usuario {
        private static final String USU_ID = BaseColumns._ID;
        private static final String USU_NAME = "UsuNombre";
        private static final String USU_LASTNAME = "UsuApellido";
        private static final String USU_PASS = "UsuContrasena";
        private static final String USU_NUM = "UsuNum";
        private static final String USU_BORR ="Borrado";
        private static final String CARG_ID = "CargId";
        private static final String PRIV_ID ="PriVId";
    }
    public static class Cargo {
        private static final String CARG_ID = BaseColumns._ID;
        private static final String CARG_NAME = "CargNombre";
    }
    public static class Privilegio {
        private static final String PRIV_ID =  BaseColumns._ID;
        private static final String PRIV_NAME ="PrivNombre";
    }
    public static class Eje {
        private static final String EJE_ID = BaseColumns._ID;
        private static final String EJE_NOMBRE ="EjeNombre";
    }
    public static class Tramo {
        private static final String TRAMO_ID = BaseColumns._ID;
        private static final String TRAMO_NAME ="TraNombre";
        private static final String EJE_ID= " EjeId";
    }
    public static class Principal {
        private static final String PRI_ID = BaseColumns._ID;
        private static final String PRI_CODE = "PriCode";
        private static final String PRI_PRECIO = "PriPrecio";
        private static final String PRI_FECH_LEVANTA = "FechaLevantamiento";
        private static final String PRI_FECH_COMPRA = "FechaCompra";
        private static final String PRI_REEMPLZ = "Reemplazo";
        private static final String PRI_DESCRI = "Descripcion";
        private static final String PRI_MARCA = "Marca";
        private static final String PRI_MODELO = "Modelo";
        private static final String PRI_FOTO = "Foto";
        private static final String PRI_KLM = "Kilometro";
        private static final String PRI_MTS = "Metros";
        private static final String TRAMO_ID ="TraId";
        private static final String OBJ_ID = "ObjId";
    }
    public static class Objeto {
      private static final String OBJ_ID = BaseColumns._ID;
      private static final String OBJ_NAME = "ObjId";
    }

    /* QUERY CREACION TABLA USUARIO*/
    public static String creaUsuario = "CREATE TABLE "+TABLA_USUARIO +" ( "+
         Usuario.USU_ID +" INTEGER AUTOINCREMENT PRIMARY KEY "+" , "+
         Usuario.USU_NAME+ " TEXT NOT NULL "+","+
         Usuario.USU_LASTNAME+" TEXT NOT NULL "+","+
         Usuario.USU_PASS+" TEXT NOT NULL "+","+
         Usuario.USU_NUM+" INTEGER NOT NULL "+","+
         Usuario.USU_BORR+" INTEGER NOT NULL "+","+
         Usuario.CARG_ID+" INTEGER NOT NULL "+","+
         Usuario.PRIV_ID+" INTEGER NOT NULL " +","+
         "FOREIGN KEY(" +Usuario.CARG_ID+") REFERENCES "+TABLA_CARGO +" ("+Cargo.CARG_ID+")"+","+
         "FOREIGN KEY(" +Usuario.PRIV_ID+ ") REFERENCES "+ TABLA_PRIVILEGIO +" ("+Privilegio.PRIV_ID +" )"+")" ;

       /* QUERY CREACION TABLA CARGO*/
    public static String creaCargo = " CREATE TABLE "+ TABLA_CARGO +" ( "+
            Cargo.CARG_ID+" INTEGER AUTOINCREMENT PRIMARY KEY" +","+
            Cargo.CARG_NAME+" TEXT NOT NULL " +" )";

       /*QUERY CREACION TABLA PRIVILEGIO */
    public  static  String  creaPrivilegio = "CREATE TABLE "+ TABLA_PRIVILEGIO +" ( "+
            Privilegio.PRIV_ID+" INTEGER AUTOINCREMENT PRIMARY KEY "+","+
            Privilegio.PRIV_NAME+ " TEXT NOT NULL "+ ")";

    public static String creaEje = "CREATE TEABLE "+TABLA_EJE + "( "+
            Eje.EJE_ID+" INTEGER AUTOINCREMENT PRIMARY KEY"+ " ,"+
            Eje.EJE_NOMBRE +" TEXT NOT NULL " +")";

    public static String creaTramo ="CREATE TABLE "+TABLA_TRAMO +" ( "+
            Tramo.TRAMO_ID+ " INTEGER AUTOINCREMENT PRIMARY KEY"+ " , "+
            Tramo.TRAMO_NAME+ " TEXT NOT NULL"+" , "+
            Tramo.EJE_ID +" INTEGER NOT NULL" +" , "+
            "FOREIGN KEY("+Tramo.EJE_ID+")"+" REFERENCES "+TABLA_EJE+ " ("+Eje.EJE_ID+")"+")" ;

    public static String creaObjeto ="CREATE TABLE "+ TABLA_OBJETO +" ( "+
            Objeto.OBJ_ID+ " INTEGER AUTOINCREMENT PRIMARY KEY" +" , "+
             Objeto.OBJ_NAME+ " TEXT NOT NULL " +" ) ";

    public static  String creaPrincipal ="CREATE TABLE "+TABLA_PRINCIPAL+" ("+
            Principal.PRI_ID+" INTEGER AUTOINCREMENT PRIMARY KEY"+" , "+
            Principal.PRI_CODE+" TEXT NOT NULL "+" , "+
            Principal.PRI_PRECIO+" REAL NOT NULL"+ " , "+
            Principal.PRI_FECH_LEVANTA+" DATE "+"DEFAULT " +" , "+
            Principal.PRI_FECH_COMPRA+" DATE NOT NULL" +" , "+
            Principal.PRI_REEMPLZ+" INTEGER NOT NULL" +" , "+
            Principal.PRI_DESCRI+" TEXT NOT NULL" +" , "+
            Principal.PRI_MARCA+" TEXT NOT NULL"+" , "+
            Principal.PRI_MODELO+" TEXT NOT NULL"+" , "+
            Principal.PRI_FOTO+" TEXT NOT NULL "+" , "+
            Principal.PRI_KLM+" INTEGER NOT NULL"+ " , "+
            Principal.PRI_MTS+" INTEGER NOT NULL" +" , "+
            Principal.TRAMO_ID+" INTEGER NOT NULL" +", "+
            Principal.OBJ_ID+ " INTEGER NOT NULL"+" , "+
              " ) ";




}
