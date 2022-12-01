/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controladorr;


import com.mycompany.modeloo.Modelo;
import com.mycompany.vistaa.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author ASUS
 */
public class controlador implements ActionListener {
   
    private final Vista vista;
    private final Modelo modelo;

    public controlador (Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.addActionListener(this);
}
    public void iniciar()
    {
    vista.SetTitle ("MVC proyecto");
    vista.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed (ActionEvent e){
        modelo.setNombre( );
        
    }
}

