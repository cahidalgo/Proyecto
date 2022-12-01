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
        this.view.jButton1.addActionListener(this);
    }
    
    public void iniciar(){
        view.setTitle("Registrar");
        view.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==view.txtnombre) {
           nombre=view.jTextField1.getText();
            bar=new Bar(nombre);
            modelo.setBar(bar);
            modelo.setModel(bar);
            view.Lista1.setModel(modelo.getModel());
            view.jTextField1.setText("");
        }else if(e.getSource()==view.jButton1){
            String dato=view. jTextField2.getText();
            modelo.deleteModel(dato);
            view.Lista1.setModel(modelo.getModel());
            view.jTextField1.setText("");
        }
        
   
    }
    
  
}
