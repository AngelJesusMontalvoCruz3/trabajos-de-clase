
package busqueda.binaria;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del arreglo: ");
        int longitud = scanner.nextInt();

        int[] arreglo = new int[longitud];
        System.out.println("Ingrese los elementos del arreglo:");

        for (int i = 0; i < longitud; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        Arrays.sort(arreglo); 

        System.out.print("Ingrese el número objetivo: ");
        int objetivo = scanner.nextInt();

        System.out.println("Arreglo: " + Arrays.toString(arreglo));
        System.out.println("Objetivo: " + objetivo);

        int indice = busquedaBinaria(arreglo, objetivo);

        if (indice != -1) {
            System.out.println("El valor " + objetivo + " se encuentra en el índice " + indice + ".");
        } else {
            System.out.println("El valor " + objetivo + " no se encuentra en el arreglo.");
        }

        scanner.close();
    }

    public static int busquedaBinaria(int[] arreglo, int objetivo) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            int valorMedio = arreglo[medio];

            if (valorMedio == objetivo) {
                return medio;
            } else if (valorMedio < objetivo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1; 
    }
}
 