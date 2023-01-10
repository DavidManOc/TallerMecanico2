package com.example.tallermecanico.tareas;

import com.example.tallermecanico.clases.Producto;
import com.example.tallermecanico.modelo.ProductoDB;

import java.util.concurrent.Callable;

public class Tarea_InsertarProductos implements Callable<Boolean> {
    private Producto p = null;

    public Tarea_InsertarProductos(Producto p) { this.p = p;}

    @Override
    public Boolean call() throws Exception {
        try {
            boolean insercionOK = ProductoDB.guardarProducto(p);
            return insercionOK;
        }
        catch(Exception e){
            return false;
        }
    }
}
