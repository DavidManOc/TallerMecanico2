package com.example.tallermecanico.clases;

public class Pedido {

    private int Usuario_dni;
    private int Producto_idProducto;
    private int Numero_Pedido;
    private double Precio_Venta;
    //-------------------------------------

    public Pedido(int usuario_dni, int producto_idProducto, int numero_Pedido, double precio_Venta) {
        Usuario_dni = usuario_dni;
        Producto_idProducto = producto_idProducto;
        Numero_Pedido = numero_Pedido;
        Precio_Venta = precio_Venta;
    }
    //--------------------------------------


    public int getUsuario_dni() {
        return Usuario_dni;
    }

    public void setUsuario_dni(int usuario_dni) {
        Usuario_dni = usuario_dni;
    }

    public int getProducto_idProducto() {
        return Producto_idProducto;
    }

    public void setProducto_idProducto(int producto_idProducto) {
        Producto_idProducto = producto_idProducto;
    }

    public int getNumero_Pedido() {
        return Numero_Pedido;
    }

    public void setNumero_Pedido(int numero_Pedido) {
        Numero_Pedido = numero_Pedido;
    }

    public double getPrecio_Venta() {
        return Precio_Venta;
    }

    public void setPrecio_Venta(double precio_Venta) {
        Precio_Venta = precio_Venta;
    }
    //-------------------------------------
    @Override
    public String toString() {
        return "Pedido{" +
                "Usuario_dni=" + Usuario_dni +
                ", Producto_idProducto=" + Producto_idProducto +
                ", Numero_Pedido=" + Numero_Pedido +
                ", Precio_Venta=" + Precio_Venta +
                '}';
    }
}
