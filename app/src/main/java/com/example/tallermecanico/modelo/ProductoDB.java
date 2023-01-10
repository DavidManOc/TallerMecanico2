package com.example.tallermecanico.modelo;

import android.util.Log;

import com.example.tallermecanico.clases.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductoDB {
    //----------------------------------
    public static ArrayList<Producto> obtenerProductos() {
        Connection conexion = ConfiguracionDB.conectarConBaseDeDatos();
        if(conexion == null)
        {
            return null;
        }
        ArrayList<Producto> productos = new ArrayList<Producto>();
        try {
            Statement sentencia = conexion.createStatement();
            String ordenSQL = "SELECT * FROM producto ORDER BY idProducto";
            ResultSet resultado = sentencia.executeQuery(ordenSQL);
            while(resultado.next())
            {
                int idProducto = resultado.getInt("idProducto");
                String Nombre = resultado.getString("Nombre");
                String Categoria = resultado.getString("Categoria");
                String Marca = resultado.getString("Marca");
                String Material = resultado.getString("Material");
                String Descripcion = resultado.getString("Descripcion");
                double Precio = resultado.getDouble("Precio");
                int Stock = resultado.getInt("Stock");
                Producto losProductos = new Producto(idProducto, Nombre, Categoria, Marca, Material, Descripcion, Precio, Stock);

                productos.add(losProductos);
            }
            resultado.close();
            sentencia.close();
            conexion.close();
            return productos;
        } catch (SQLException e) {
            Log.i("sql", "error sql");
            return productos;
        }
    }
//-----------------------------------------------------------------
    public static boolean guardarProducto(Producto p) {
        Connection conexion = ConfiguracionDB.conectarConBaseDeDatos();
        if(conexion == null){
            return false;
        }
        try{
            String ordensql = "INSERT INTO producto (`idProducto`, `Nombre`, `Categoria`, `Marca`, `Material`, `Descripcion`, `Precio`, `Stock` ) VALUES (?,?,?,?,?,?,?,?);";
            PreparedStatement sentencia = conexion.prepareStatement(ordensql);
            sentencia.setInt(1, p.getIdProducto());
            sentencia.setString(2, p.getNombre());
            sentencia.setString(3, p.getCategoria());
            sentencia.setString(4, p.getMarca());
            sentencia.setString(5, p.getMaterial());
            sentencia.setString(6, p.getDescripcion());
            sentencia.setDouble(7, p.getPrecio());
            sentencia.setInt(8, p.getStock());

            int filasAfectadas = sentencia.executeUpdate();
            sentencia.close();
            conexion.close();

            if (filasAfectadas > 0){
                return true;
            }
            else{
                return false;
            }

        }
        catch(SQLException e){
            return false;
        }

    }
    //-------------------------------------------------------------------
    public static boolean borrarProducto(int elproducto){
        Connection conexion = ConfiguracionDB.conectarConBaseDeDatos();
        if(conexion == null){
            return false;
        }
        try{
            String ordensql = "DELETE FROM `productos` WHERE (`idProducto` = null);";
            PreparedStatement sentencia = conexion.prepareStatement(ordensql);
            sentencia.setString(1, String.valueOf(elproducto));

            int filasafectadas = sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
            if(filasafectadas > 0){
                return true;
            }
            else{
                return false;
            }
        }
        catch(SQLException e){
            return false;
        }


    }

    //-------------------------------------------------------------------
    public static boolean actualizarProducto(Producto p, String productoantiguo) {
        Connection conexion = ConfiguracionDB.conectarConBaseDeDatos();
        if (conexion == null){
            return false;
        }
        try{
            String ordensql = "UPDATE producto SET idProducto = ?, Nombre = ?, Categoria = ?, Marca = ?, Material = ?, Descripcion = ?, Precio = ?, Stock = ? WHERE idProducto = ?";
            PreparedStatement sentencia = conexion.prepareStatement(ordensql);
            sentencia.setInt(1, p.getIdProducto());
            sentencia.setString(2, p.getNombre());
            sentencia.setString(3, p.getCategoria());
            sentencia.setString(4, p.getMarca());
            sentencia.setString(5, p.getMaterial());
            sentencia.setString(6, p.getDescripcion());
            sentencia.setDouble(7, p.getPrecio());
            sentencia.setInt(8, p.getStock());
            sentencia.setInt(9, Integer.parseInt(productoantiguo));

            int filasafectadas = sentencia.executeUpdate();
            sentencia.close();
            conexion.close();

            if(filasafectadas > 0){
                return true;
            }
            else{
                return false;
            }
        }
        catch(SQLException e){
            return false;
        }
//-----------------------------------------------------------------------------------------------



    }
}
