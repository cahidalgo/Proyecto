package com.mycompany.registrar;

import com.mycompany.registrar.controlador.Controlador;
import com.mycompany.registrar.modelo.Bar;
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
       Bar b=new Bar();
       
       Controlador ctrl=new Controlador(modelo, view,b);
       ctrl.iniciar();
       view.setVisible(true);
    }
}
