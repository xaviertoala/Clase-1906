/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1906;

/**
 *
 * @author User
 */
public class Gatos implements IGatos {
    private Gato[] gatos;
    private int totalGatos;
    //contructor 0

    public Gatos(int dimension) {
       gatos = new Gato [dimension];
       totalGatos = 0;
    }
    public boolean agregarGatos(Gato gato){
      if (totalGatos == gatos.length){
       return false;   
    } 
      else{
      gatos[totalGatos]=gato;
      totalGatos=totalGatos+1;
       return true;
      }
}
    public void imprimirDatos(){
        for (int i = 0; i < totalGatos; i++) {
            System.out.println("Nombre: "+gatos[i].getNombre());
            System.out.println("Edad: "+gatos[i].getEdad());
        }    
    }
    public boolean acatualizarDatos(int i, Gato gato){
        gatos[i]=gato;
    return true;
    }
    
}
