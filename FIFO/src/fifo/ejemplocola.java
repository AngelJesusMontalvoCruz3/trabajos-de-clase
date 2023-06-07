/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fifo;

/**
 *
 * @author PC
 */
public class ejemplocola {
    
    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.encolar(new Nodo(1, null));
        cola.encolar(new Nodo(2, null));
        cola.encolar(new Nodo(3, null));
        cola.sacar();
        cola.encolar(new Nodo(4, null));
        System.out.println("Elementos en la cola: " + cola.toString());
        System.out.println("Tamaño de la cola: " + cola.size());
    }
}
