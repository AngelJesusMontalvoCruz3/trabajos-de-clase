/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package potenciadeunnumero;
import java.util.Scanner;
public class Potenciadeunnumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int base, exponente;
        
        System.out.print("Ingrese la base: ");
        base = scanner.nextInt();
        
        do {
            System.out.print("Ingrese el exponente (debe ser un número entero positivo): ");
            exponente = scanner.nextInt();
        } while (exponente < 0);
        
        int resultado = potencia(base, exponente);
        System.out.println("El resultado es: " + resultado);
    }
    
    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
