/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto;

import com.mycompany.controladorr.controlador;
import com.mycompany.modeloo.Modelo;
import com.mycompany.vistaa.Vista;

/**
 *
 * @author ASUS
 */
public class Proyecto {

    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador (vista, modelo);
        
        vista.setVisible (true);
        
    }

    private static class Controlador {

        public Controlador() {
        }

        private Controlador(Vista vista, Modelo modelo) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
