/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrar.modelo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author User
 */
public class Modelo {
    private List <Bar> bares;
    private DefaultListModel model;

    public Modelo(List<Bar> bares, DefaultListModel model) {
        this.bares = bares;
        this.model = model;
    }

    
    public void setModel(String a){
        model.addElement(a);
    }
    
    public int getSize(){
        return bares.size();
    }
    public void setBar(Bar bar){
        bares.add(bar);
    }
    public List<Bar> getBar(){
        return bares;
    }
}
