/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.registrar;

import com.mycompany.registrar.controlador.Controlador;
import com.mycompany.registrar.modelo.Bar;
import com.mycompany.registrar.modelo.Modelo;
import com.mycompany.registrar.vista.Vista;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author User
 */
public class Registrar {

    public static void main(String[] args) {
        List <Bar> bares=new ArrayList<>();
      DefaultListModel model=new DefaultListModel();
       Modelo modelo=new Modelo(bares, model);
       Vista view=new Vista();
       Bar b=new Bar();
       
       Controlador ctrl=new Controlador(modelo, view,b);
       ctrl.iniciar();
       view.setVisible(true);
    }
}
