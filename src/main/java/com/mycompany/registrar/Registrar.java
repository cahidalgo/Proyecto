/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.registrar;

import com.mycompany.registrar.controlador.Controlador;

import com.mycompany.registrar.modelo.Modelo;
import com.mycompany.registrar.vista.Vista;

/**
 *
 * @author User
 */
public class Registrar {

    public static void main(String[] args) {
        
       Modelo modelo=new Modelo();
       Vista view=new Vista();
       
      
       
       Controlador ctrl=new Controlador(modelo, view);
       ctrl.iniciar();
       view.setVisible(true);
    }
}
