/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;

/**
 *
 * @author PC
 */
public class Nodo {
    private int elemento;
    private Nodo ramaiz;
    private Nodo ramaDer;

    public Nodo(int elemento) {
        this.elemento = elemento;
        ramaiz = null;
        ramaDer = null;
    }

    public void InsertaBinario(int elem) {
        if (elem < this.elemento) {
            if (ramaiz == null)
                ramaiz = new Nodo(elem);
            else
                ramaiz.InsertaBinario(elem);
        } else {
            if (elem > this.elemento) {
                if (ramaDer == null)
                    ramaDer = new Nodo(elem);
                else
                    ramaDer.InsertaBinario(elem);
            }
        }
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public Nodo getRamaiz() {
        return ramaiz;
    }

    public void setRamaiz(Nodo ramaiz) {
        this.ramaiz = ramaiz;
    }

    public Nodo getRamaDer() {
        return ramaDer;
    }

    public void setRamaDer(Nodo ramaDer) {
        this.ramaDer = ramaDer;
    }

    @Override
    public String toString() {
        return "Nodo{" + "elemento=" + elemento + ", ramaiz=" + ramaiz + ", ramaDer=" + ramaDer + '}';
    }
}