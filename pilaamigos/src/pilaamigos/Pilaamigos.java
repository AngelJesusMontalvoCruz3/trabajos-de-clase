/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilaamigos;


import java.util.Stack;

public class Pilaamigos {

   
    public static void main(String[] args) {
     
 Stack<Persona> pila = new Stack<>();
        
        Persona persona1 = new Persona();
        persona1.setNombre("Pedro");
        persona1.setEdad(24);
        
        Persona persona2 = new Persona();
        persona2.setNombre("Eduardo");
        persona2.setEdad(25);
        
        Persona persona3 = new Persona();
        persona3.setNombre("Abraham");
        persona3.setEdad(23);
        
        pila.push(persona1);
        pila.push(persona2);
        pila.push(persona3);
        
        System.out.println(pila);
        
        pila.pop();
        
        System.out.println(pila);
    }
    
}
