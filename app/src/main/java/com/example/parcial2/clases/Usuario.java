package com.example.parcial2.clases;

public class Usuario {
    private String nombre;
    //    Para saber si esta muerto o no
    private String estado;
    //    Para saber que raza es si es humano o que
    private String raza;

    private String imagen;


    public Usuario(String nombre, String estado, String raza, String imagen) {
        this.nombre = nombre;
        this.estado = estado;
        this.raza = raza;
        this.imagen = imagen;
    }
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre='" + nombre + '\'' + ", estado='" + estado + '\'' + ", raza='" + raza + '\'' + '}';
    }
}
