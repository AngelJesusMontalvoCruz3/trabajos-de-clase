/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos.de.ordenamiento;


public class Hanoi {
 public void moverDiscos(int n, char torreOrigen, char torreDestino, char torreAuxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + torreOrigen + " a " + torreDestino);
        } else {
            moverDiscos(n - 1, torreOrigen, torreAuxiliar, torreDestino);
            System.out.println("Mover disco " + n + " de " + torreOrigen + " a " + torreDestino);
            moverDiscos(n - 1, torreAuxiliar, torreDestino, torreOrigen);
        }
    }
}
   
    
