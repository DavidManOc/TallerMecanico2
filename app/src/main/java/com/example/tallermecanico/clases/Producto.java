package com.example.tallermecanico.clases;

public class Producto {

    private int idProducto;
    private String Nombre;
    private String Categoria;
    private String Marca;
    private String Material;
    private String Descripcion;
    private double Precio;
    private int Stock;
    //---------------------------------
    public Producto(int idProducto, String nombre, String categoria, String marca, String material, String descripcion, double precio, int stock) {
        this.idProducto = idProducto;
        Nombre = nombre;
        Categoria = categoria;
        Marca = marca;
        Material = material;
        Descripcion = descripcion;
        Precio = precio;
        Stock = stock;
    }
    //------------------------------------
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }
    //------------------------------------
    @Override
    public String toString() {
        return "Pedido{" +
                "idProducto=" + idProducto +
                ", Nombre='" + Nombre + '\'' +
                ", Categoria='" + Categoria + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Material='" + Material + '\'' +
                ", Descripcion='" + Descripcion + '\'' +
                ", Precio=" + Precio +
                ", Stock=" + Stock +
                '}';
    }

}
