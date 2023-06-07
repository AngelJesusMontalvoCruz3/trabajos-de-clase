/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbol;


import java.util.Scanner;

public class Arbol {

   
    public static void main(String[] args) {
    
             arbolB A = new arbolB();
        int opc = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("BIENVENIDO A ARBOL BINARIO ORDENADO");
        do {
            System.out.println("MENU");
            System.out.println("1. Insertar");
            System.out.println("2. Eliminar");
            System.out.println("3. Recorrido en Preorden");
            System.out.println("4. Recorrido en Inorden");
            System.out.println("5. Recorrido en Postorden");
            System.out.println("6. Buscar elemento");
            System.out.println("7. Recorrido por amplitud");
            System.out.println("8. Salir");
            System.out.println("Seleccione una opción: ");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese el número a insertar: ");
                    int p = leer.nextInt();
                    A.insertaNodo(p);
                    break;

                case 2:
                    System.out.println("Ingrese el número a eliminar: ");
                    int e = leer.nextInt();
                    A.eliminarNodo(e);
                    break;

                case 3:
                    System.out.println("El recorrido en preorden es:");
                    A.preorden(A.raiz);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("El recorrido en inorden es:");
                    A.inorden(A.raiz);
                    System.out.println();
                    break;

                case 5:
                    System.out.println("El recorrido en postorden es:");
                    A.postorden(A.raiz);
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Ingrese el número a buscar: ");
                    int b = leer.nextInt();
                    A.buscarElemento(b);
                    break;

                case 7:
                    System.out.println("El recorrido por amplitud es:");
                    A.recorridoAmplitud();
                    System.out.println();
                    break;
            }
        } while (opc != 8);
    }
}