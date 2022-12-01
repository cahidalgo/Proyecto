/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author Andres Gomez
 */
public class Modelo {
   private Anuncio add;
   DoublyLinkedList<Anuncio> adds=new DoublyLinkedList();

    public Modelo() {
    }
    public void añadir(Anuncio u){
        adds.addFirst(u);
    }
    
    public void mostrar2(){
        for(Anuncio s: adds){
            System.out.println("Anuncio: "+ s.toString());
        }
    }
   
    
}
