/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insercion;

import java.util.Random;

public class Insercion {

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

        // Ordenar la matriz utilizando el método de inserción directa
        for (int i = 1; i < n; i++) {
            int k = a[i]; 
            int j = i - 1; 

            // Mover todos los elementos mayores que el elemento actual una posición hacia la derecha
            while (j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = k; // Insertar el elemento actual en su posición correcta
        }

        // Imprimir la matriz ordenada
        System.out.println("Matriz ordenada:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+"");
        }
    }
}