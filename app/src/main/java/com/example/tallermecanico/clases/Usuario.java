package com.example.tallermecanico.clases;

public class Usuario {

    private int dni;
    private String Nombre;
    private String Poblacion;
    private String Telefono;
    //-----------------------------------


    public Usuario(int dni, String nombre, String poblacion, String telefono) {
        this.dni = dni;
        Nombre = nombre;
        Poblacion = poblacion;
        Telefono = telefono;
    }
    //--------------------------


    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(String poblacion) {
        Poblacion = poblacion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
    //------------------------------------

    @Override
    public String toString() {
        return "Usuario{" +
                "dni=" + dni +
                ", Nombre='" + Nombre + '\'' +
                ", Poblacion='" + Poblacion + '\'' +
                ", Telefono='" + Telefono + '\'' +
                '}';
    }
}
