/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1906;


public class Practica1906 {

    public static void main(String[] args) {
  
        IGatos gt=new Gatos(5);
        
        Gato gato1=new Gato("Pecas", 2 );
        Gato gato2=new Gato("Pancho", 4 );
        
        gt.agregarGatos(gato2);
        gt.agregarGatos(gato1);
        System.out.println("Datos de Gatos");
        gt.imprimirDatos();
        
        System.out.println("Datos de Perro");
        
        IPerros x = new Perros (2);
        
        Perro perroU = new Perro ("Elinor", 4);
        Perro perroD = new Perro ("Bela", 5);
        
        x.agregarPerros(perroU);
        x.agregarPerros(perroD);
        
        x.imprimirDatosP();
        
    }
}
