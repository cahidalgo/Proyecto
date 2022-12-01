package com.mycompany.registrar.modelo;

/**
 *
 * @author User
 */
public class Bar {
    private String nombre;

    public Bar(){
    }
    
    public Bar(String n){
        this.nombre=n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Bar{" + "nombre=" + nombre + '}';
    }
    
    
}
