package com.example.tallermecanico.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tallermecanico.R;

public class GestionProductosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gestion_productos);
    }

    public void add_producto(View view){
        Intent intent = new Intent(this, NuevoProductoActivity.class);
        startActivity(intent);
    }

    public void mostrar_producto(View view){
        Intent intent = new Intent(this, MostrarProductoActivity.class);
        startActivity(intent);
    }

    public void borrar_producto(View view){
        Intent intent = new Intent(this, BorrarProductoActivity.class);
        startActivity(intent);
    }

    public void actualizar_producto(View view){
        Intent intent = new Intent(this, ActualizarProductoActivity.class);
        startActivity(intent);
    }

}
