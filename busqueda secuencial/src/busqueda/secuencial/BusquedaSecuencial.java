package busqueda.secuencial;

import java.util.Scanner;

public class BusquedaSecuencial {

    public static int busquedaSecuencial(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamano = scanner.nextInt();

        int[] arreglo = new int[tamano];
        System.out.println("Ingrese los elementos del arreglo:");

        for (int i = 0; i < tamano; i++) {
            arreglo[i] = scanner.nextInt();
        }

        System.out.print("Ingrese el elemento a buscar: ");
        int elementoBuscado = scanner.nextInt();

        int indice = busquedaSecuencial(arreglo, elementoBuscado);

        if (indice != -1) {
            System.out.println("El elemento " + elementoBuscado + " se encuentra en el índice " + indice);
        } else {
            System.out.println("El elemento " + elementoBuscado + " no se encuentra en el arreglo");
        }

        scanner.close();
    }
}

