/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1906;

public class Perros implements IPerros {
    
    private Perro [] perros ; 
    private int totalPerros; 

    public Perros(int dimension) {
        perros = new Perro [dimension];
        totalPerros =0; 
    }
    public boolean agregarPerros (Perro perro){
        if (totalPerros == perros.length){
            return false; 
        } else {
            perros [totalPerros] = perro; 
            totalPerros = totalPerros+1; 
            return true; 
        }
        
    }
    public void imprimirDatosP (){
        for (int i = 0; i < totalPerros; i++) {
            System.out.println("Nombre: "+ perros[i].getNombre());
            System.out.println("Edad: "+ perros[i].getEdad());
        }
    }
        
    public boolean actualizarDatos (int i, Perro perro){
        perros [i]= perro; 
        return true;
    }
}
    
    
    

