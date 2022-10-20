package com.example.form;

public class Usuario {
    private String nombre, usuario, descripcion;

    public Usuario(String n,  String u, String d){
        nombre = n;
        usuario = u;
        descripcion = d;
    }

    @Override
    public String toString(){
        return "El usuario " + this.nombre + " con el nick " + this.usuario + " tiene la siguiente descripcion: " +
                this.descripcion;
    }
}
