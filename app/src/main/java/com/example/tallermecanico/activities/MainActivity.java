package com.example.tallermecanico.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.tallermecanico.R;
import com.example.tallermecanico.modelo.ConfiguracionDB;

import java.sql.Connection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //-------------voy a probar si me conecta a la BBDD--------------
        Connection conexion = ConfiguracionDB.conectarConBaseDeDatos();
        if (conexion == null){
            System.out.println("NO CONECTO");
            Log.i("sql", "no se conecto a BBDD");
        }
        else{
            System.out.println("SI CONECTO CORRECTAMENTE");
            Log.i("sql", "conexion establecida correctamente");
        }

    }
    //------------------------------------------------------------------------------------------------
    public void gestionarProductos(View view) {
        Intent intent = new Intent(this, GestionProductosActivity.class);
        startActivity(intent);
    }
    //------------------------------------------------------------------------------------------------
    public void gestionarUsuarios(View view) {
        Intent intent = new Intent(this, GestionUsuariosActivity.class);
        startActivity(intent);
    }
    //------------------------------------------------------------------------------------------------
}