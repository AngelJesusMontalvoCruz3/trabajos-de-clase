/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleccion;

import java.util.Random;

public class Seleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int n = 150; // Número de elementos en la matriz
        int[] a = new int[n]; // Crear matriz de tamaño n

        // Generar números aleatorios y agregarlos a la matriz
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(151); // Generar número aleatorio entre 0 y 151
        }

        // Ordenar la matriz utilizando el método de selección
        for (int i = 0; i < n - 1; i++) {
            int min = i; // Índice del elemento mínimo
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    // Actualizar el índice del elemento mínimo si se encuentra uno más pequeño
                    min = j;
                }
            }
            // Intercambiar el elemento actual con el mínimo encontrado
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        // Imprimir la matriz ordenada
        System.out.println("Matriz ordenada:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
} 
 
