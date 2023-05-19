/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

public class ejemplopila {
    public static void main(String[] args) {
    
        // Construcción del nodo inicial
        Nodo inicial = new Nodo(1, null); // Se construye el nodo base de la pila con valor 1 y sin apuntar a otro nodo
        System.out.println("inicial: " + inicial.getElemento()); // Se muestra la base de la pila

        Pila mipila = new Pila(); // Iniciamos la construcción de la pila
        System.out.println(mipila.toString()); // Se muestra el contenido de la pila

        Nodo pvalor = new Nodo(3, null); // Construcción de un nuevo nodo
        Nodo top = mipila.push(inicial, pvalor); // Se inserta el nodo en la pila
        System.out.println("valor Top " + top.getElemento());

        top = mipila.push(inicial, new Nodo(78, null));
        System.out.println("Valor Top " + top.getElemento());

        // Se insertan varios nodos
        mipila.push(inicial, new Nodo(23, null));
        mipila.push(inicial, new Nodo(45, null));
        mipila.push(inicial, new Nodo(89, null));
        mipila.push(inicial, new Nodo(48, null));
        mipila.push(inicial, new Nodo(45, null));
        mipila.push(inicial, new Nodo(12, null));
        mipila.push(inicial, new Nodo(78, null));
        mipila.push(inicial, new Nodo(15, null));

        System.out.println("***Después de agregar nodos***");
        System.out.println(mipila.toString()); // Se muestra el contenido de la pila
        
        System.out.println("Valor Top: " + mipila.top().getElemento()); // Muestra el valor top de la pila
    }
}

