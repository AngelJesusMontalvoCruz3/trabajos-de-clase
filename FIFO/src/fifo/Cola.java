/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fifo;



public class Cola {
    
    private Nodo frente;
    private int tamaño;

    public Cola() {
        frente = null;
        tamaño = 0;
    }

    public boolean isEmpty() {
        return frente == null;
    }

    public int size() {
        return tamaño;
    }

    public Nodo raiz() {
        return frente;
    }

    public void sacar() {
        if (isEmpty()) {
            System.out.println("La cola está vacía");
            return;
        }

        frente = frente.getSiguiente();
        tamaño--;
    }

    public void encolar(Nodo nv) {
        if (isEmpty()) {
            frente = nv;
        } else {
            Nodo actual = frente;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nv);
        }
        tamaño++;
    }

    public Nodo recorreCola() {
        return frente;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "La cola está vacía";
        }

        StringBuilder sb = new StringBuilder();
        Nodo actual = frente;
        while (actual != null) {
            sb.append(actual.toString()).append(" ");
            actual = actual.getSiguiente();
        }
        return sb.toString();
    }
}


