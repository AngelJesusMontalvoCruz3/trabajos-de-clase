/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;



public class Pila {
private Nodo top;
    private int tamanio;

    public Pila() {
        top = null;
        tamanio = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return tamanio;
    }

    public Nodo top() {
        if (isEmpty()) {
            return null;
        } else {
            return top;
        }
    }

    public Nodo pop(Nodo i) {
        System.out.println("Inicia método POP");
        System.out.println("Valor de i " + i.getElemento());
        Nodo s = new Nodo(0, null);
        while (i.getSiguiente() != null) {
            s = i.getSiguiente();
            if (s.getSiguiente() == null) {
                Nodo aux = s.getSiguiente();
                System.out.println("Valor sacado" + s.getElemento());
                i.setSiguiente(null);
                top = i;
                return top;
            } else {
                i = s;
            }
        }
        this.tamanio--;
        top = i;
        return top;
    }

    public Nodo push(Nodo i, Nodo nv) {
        if (i.getSiguiente() == null) {
            i.setSiguiente(nv);
            System.out.println("Valor insertado " + nv.getElemento());
            top = i;
            return top;
        } else {
            Nodo s = visitarPila(i);
            if (s.getSiguiente() == null) {
                System.out.println("Valor insertado " + nv.getElemento());
                s.setSiguiente(nv);
                top = s.getSiguiente();
                this.tamanio++;
                return top;
            }
        }
        return top;
    }

    public Nodo visitarPila(Nodo i) {
        System.out.println("Inicia metodo recorrer Pila ");
        System.out.println("Valor de i " + i.getElemento());
        Nodo s = new Nodo(0, null);
        while (i.getSiguiente() != null) {
            s = i.getSiguiente();
            System.out.println("Valor visitado " + s.getElemento());
            i = s;
        }
        return i;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "La pila está vacía";
        } else {
            String resultado = "";
            Nodo aux = top;
            while (aux != null) {
                resultado += aux.toString();
                aux = aux.getSiguiente();
            }
            return resultado;
        }
    }
}
