/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author PC
 */
public class arbolB {
  
Nodo raiz;

    public arbolB() {
        raiz = null;
    }

    public void insertaNodo(int elem) {
        if (raiz == null) {
            raiz = new Nodo(elem);
        } else {
            raiz.InsertaBinario(elem);
        }
    }

    public void preorden(Nodo nodo) {
        if (nodo == null) return;
        
        System.out.print(nodo.getElemento() + " ");
        preorden(nodo.getRamaiz());
        preorden(nodo.getRamaDer());
    }

    public void inorden(Nodo nodo) {
        if (nodo == null) return;

        inorden(nodo.getRamaiz());
        System.out.print(nodo.getElemento() + " ");
        inorden(nodo.getRamaDer());
    }

    public void postorden(Nodo nodo) {
        if (nodo == null) return;

        postorden(nodo.getRamaiz());
        postorden(nodo.getRamaDer());
        System.out.print(nodo.getElemento() + " ");
    }

    public void eliminarNodo(int elem) {
        raiz = eliminarNodo(raiz, elem);
    }

    private Nodo eliminarNodo(Nodo nodo, int elem) {
        if (nodo == null) return null;

        if (elem < nodo.getElemento()) {
            nodo.setRamaiz(eliminarNodo(nodo.getRamaiz(), elem));
        } else if (elem > nodo.getElemento()) {
            nodo.setRamaDer(eliminarNodo(nodo.getRamaDer(), elem));
        } else {
            if (nodo.getRamaiz() == null) {
                return nodo.getRamaDer();
            } else if (nodo.getRamaDer() == null) {
                return nodo.getRamaiz();
            }

            Nodo sucesor = encontrarSucesor(nodo.getRamaDer());
            nodo.setElemento(sucesor.getElemento());
            nodo.setRamaDer(eliminarNodo(nodo.getRamaDer(), sucesor.getElemento()));
        }

        return nodo;
    }

    private Nodo encontrarSucesor(Nodo nodo) {
        Nodo actual = nodo;
        while (actual.getRamaiz() != null) {
            actual = actual.getRamaiz();
        }
        return actual;
    }

    public void buscarElemento(int elem) {
        Nodo nodoEncontrado = buscarNodo(raiz, elem);
        if (nodoEncontrado != null) {
            System.out.println("El elemento " + elem + " se encontró en el árbol.");
        } else {
            System.out.println("El elemento " + elem + " no se encontró en el árbol.");
        }
    }

    private Nodo buscarNodo(Nodo nodo, int elem) {
        if (nodo == null || nodo.getElemento() == elem) {
            return nodo;
        }

        if (elem < nodo.getElemento()) {
            return buscarNodo(nodo.getRamaiz(), elem);
        } else {
            return buscarNodo(nodo.getRamaDer(), elem);
        }
    }

    public void recorridoAmplitud() {
        if (raiz == null) {
            System.out.println("El árbol está vacío.");
            return;
        }
        Queue<Nodo> cola = new LinkedList<>();
        cola.offer(raiz);

        while (!cola.isEmpty()) {
            Nodo nodo = cola.poll();
            System.out.print(nodo.getElemento() + " ");

            if (nodo.getRamaiz() != null) {
                cola.offer(nodo.getRamaiz());
            }

            if (nodo.getRamaDer() != null) {
                cola.offer(nodo.getRamaDer());
            }
        }

        System.out.println();
    }
}
    
