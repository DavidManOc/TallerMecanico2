package com.example.tallermecanico.modelo;

import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracionDB {

    public static final String HOSTDB = "10.0.2.2";//direccion IP de mi ordenador
    public static final String NOMBREDB = "taller";//nombre de la base de datos
    public static final String USUARIODB = "root";
    public static final String CLAVEDB = "dam1";
    private static final String OPCIONESHORA = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    // las opciones de hora tambien las puedes poner en mysql
    // SET GLOBAL time_zone = '+1:00';
    public static final String PUERTOMYSQL = "3306";
    public static final String URLMYSQL = "jdbc:mysql://"+ HOSTDB +":"+PUERTOMYSQL + "/" + NOMBREDB + OPCIONESHORA;

    //----------------------------------------------------------....
    public static Connection conectarConBaseDeDatos() {
        try {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            Connection conexion = DriverManager.getConnection(URLMYSQL, USUARIODB, CLAVEDB);
            return conexion;
        } catch (SQLException e) {
            System.out.println("no se pudo establecer la conexion con la base de datos");
            return null;
        }
    }
    //-----------------------------------------------------------
}
