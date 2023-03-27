/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int numTerminos;
        do {
            System.out.println("Ingresa el número de términos para la serie de Fibonacci (debe ser mayor que 0):");
            numTerminos = scanner.nextInt();
        } while (numTerminos <= 0);
        
        int[] serieFibonacci = new int[numTerminos];
        for (int i = 0; i < numTerminos; i++) {
            serieFibonacci[i] = fibonacci(i, serieFibonacci);
            System.out.print(serieFibonacci[i] + " ");
        }
    }

    public static int fibonacci(int n, int[] memoria) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (memoria[n] != 0) {
            return memoria[n];
        }
          int resultado = fibonacci(n - 1, memoria) + fibonacci(n - 2, memoria);
        memoria[n] = resultado;
        return resultado;
    }
}
                     
    
