/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package burbuja;

import java.util.Random;

public class Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n = 150; // Número de elementos en la matriz
        int[] a = new int[n]; // Crear matriz de tamaño n

        // Generar números aleatorios y agregarlos a la matriz
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(151); // Generar número aleatorio entre 0 y 150
        }

        // Ordenar la matriz utilizando el método de burbuja
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // Intercambiar elementos si el elemento actual es mayor que el siguiente
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        // Imprimir la matriz ordenada
        System.out.println("Matriz ordenada:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
    
