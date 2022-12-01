/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author Andres Gomez
 */
public class Anuncio {
    private String marca;
    private TipoPago tp;
    private TipoAnuncio ta;

    public Anuncio(String marca,TipoPago tp, TipoAnuncio ta) {
        this.marca = marca;
        this.tp = tp;
        this.ta = ta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public TipoPago getTp() {
        return tp;
    }

    public void setTp(TipoPago tp) {
        this.tp = tp;
    }

    public TipoAnuncio getTa() {
        return ta;
    }

    public void setTa(TipoAnuncio ta) {
        this.ta = ta;
    }

    @Override
    public String toString() {
        return "marca=" + marca + ", tp=" + tp + ", ta=" + ta + '}';
    }
    
    
}
