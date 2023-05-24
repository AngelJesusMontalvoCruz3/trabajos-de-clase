/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.monedascodicioso;

import java.util.Arrays;

public class Monedascodicioso {

    public static void main(String[] args) {
     
    int[] monedas = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int cantidad = 1522;

        int[][] resultado = codiciosoMonedas(monedas, cantidad);

        System.out.println("Cantidad mínima de monedas necesarias: " + resultado[0][0]);
        System.out.println("Monedas utilizadas: " + Arrays.toString(resultado[1]));
    }

    public static int[][] codiciosoMonedas(int[] monedas, int cantidad) {
        int[][] resultado = new int[2][monedas.length];
        int[] seleccionadas = new int[monedas.length];

        Arrays.sort(monedas);
        for (int i = 0; i < monedas.length / 2; i++) {
            int temp = monedas[i];
            monedas[i] = monedas[monedas.length - 1 - i];
            monedas[monedas.length - 1 - i] = temp;
        }

        int monedasUtilizadas = 0;
        for (int i = 0; i < monedas.length; i++) {
            if (cantidad >= monedas[i]) {
                int count = cantidad / monedas[i];
                cantidad -= count * monedas[i];
                monedasUtilizadas += count;
                seleccionadas[i] = count;
            }
        }

        resultado[0][0] = monedasUtilizadas;
        resultado[1] = seleccionadas;
        return resultado;
    }
}






