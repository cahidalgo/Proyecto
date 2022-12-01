/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrar.controlador;

import com.mycompany.registrar.modelo.Bar;
import com.mycompany.registrar.modelo.Modelo;
import com.mycompany.registrar.vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class Controlador implements ActionListener {
    
    private Vista view;
    private Modelo modelo;
    private Bar bar;
    private String nombre;
    

    public Controlador(Modelo modelo, Vista view, Bar b) {
        this.view = view;
        this.modelo = modelo;
        this.bar=b;
        this.view.txtnombre.addActionListener(this);
    }
    
    public void iniciar(){
        view.setTitle("Registrar");
        view.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
       nombre=view.txtnombre.getText();
       bar=new Bar(nombre);
       modelo.setBar(bar);
       
       for(Bar b:modelo.getBar()){
           view.texto.setText(b.toString());
       }
       
   
    }
}
