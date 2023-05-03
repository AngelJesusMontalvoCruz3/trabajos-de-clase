/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos.de.ordenamiento;


public class Quicksort {
    
  public static void Intercambio(int arr[], int i, int j) {
        int aux;
        aux = arr[i];
        arr[i] = arr[j];
        arr[j] = aux;
    }
    
    public static int Particion(int a[], int inicio, int end) {
        int pivote;
        pivote = a[end];
        int pIndex = inicio;
        for(int i = inicio; i < end; i++) {
            if(a[i] <= pivote) {
                Intercambio(a, i, pIndex);
                pIndex++;
            }
        }
        Intercambio(a, end, pIndex);
        return pIndex;
    }
    
    public static void quicksort(int a[], int inicio, int end) {
        if(inicio >= end) {
            return;
        }
        int pivote = Particion(a, inicio, end);
        quicksort(a, inicio, pivote - 1);
        quicksort(a, pivote + 1, end);
    }

   
}
