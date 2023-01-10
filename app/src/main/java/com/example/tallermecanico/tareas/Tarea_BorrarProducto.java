package com.example.tallermecanico.tareas;

import com.example.tallermecanico.modelo.ProductoDB;

import java.util.concurrent.Callable;

public class Tarea_BorrarProducto implements Callable<Boolean> {

    private String producto = null;

    public Tarea_BorrarProducto(String producto) { this.producto = producto;}

    @Override
    public Boolean call() throws Exception {
        try{
            boolean borradoOK = ProductoDB.borrarProducto(Integer.parseInt(producto));
            return borradoOK;
        }
        catch(Exception e){
            return false;
        }
    }
}
