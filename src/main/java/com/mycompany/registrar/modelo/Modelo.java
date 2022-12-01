package com.mycompany.registrar.modelo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author User
 */
public class Modelo {
    private List <Bar> bares=new ArrayList<>();
    private DefaultListModel model=new DefaultListModel<>();

    
    public void deleteModel(String b){
        for(Bar ba:bares){
            if(b.equals(ba.getNombre()))
                model.removeElement(ba);
        }
    }
           
    public void setModel(Bar a){
        model.addElement(a);
    }
    
    public DefaultListModel getModel(){
        return model;
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
