/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto;

import com.mycompany.controlador.Controlador;
import com.mycompany.modelo.Modelo;
import com.mycompany.vista.Vista;

/**
 *
 * @author Andres Gomez
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo mod=new Modelo();
        Vista view=new Vista();
        Controlador cont=new Controlador(view,mod);
        
        view.setVisible(true);
        
    }
    
}
