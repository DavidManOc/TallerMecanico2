package com.example.tallermecanico.tareas;

import com.example.tallermecanico.clases.Producto;
import com.example.tallermecanico.modelo.ProductoDB;

import java.util.concurrent.Callable;

public class Tarea_ActualizarCurso implements Callable<Boolean> {

    private Producto p = null;
    private String productoantiguo = null;

    public Tarea_ActualizarCurso(Producto p, String producto) {
        this.p = p;
        this.productoantiguo = productoantiguo;
    }

    @Override
    public Boolean call() throws Exception {
        try{
            boolean actualizadoOK = ProductoDB.actualizarProducto(p, productoantiguo);
            return actualizadoOK;

        }
        catch(Exception e){
            return false;
        }


    }
}
