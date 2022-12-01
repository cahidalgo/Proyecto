/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.mycompany.modelo.Video;
import com.mycompany.modelo.Anuncio;
import com.mycompany.modelo.Efectivo;
import com.mycompany.modelo.Imagen;
import com.mycompany.modelo.Modelo;
import com.mycompany.modelo.Tarjeta;
import com.mycompany.modelo.TipoAnuncio;
import com.mycompany.modelo.TipoPago;
import com.mycompany.vista.Vista;

/**
 *
 * @author Andres Gomez
 */
public class Controlador implements ActionListener {
    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.Registrar.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        
        String v=vista.Marca.getText();
        TipoPago t;
        TipoAnuncio y;
        if("1".equals(vista.TipoPago.getText())){
             t =new Efectivo();
        }
        else{
             t=new Tarjeta();
        }
        if("1".equals(vista.TipoAdd.getText())){
             y=new Imagen();
        }
        else{
             y=new Video();
        }
        
        Anuncio w=new Anuncio(v,t,y);
        modelo.añadir(w);
        vista.Resultado.setText("ANUNCIO REGISTRADO");
        
    }
}
