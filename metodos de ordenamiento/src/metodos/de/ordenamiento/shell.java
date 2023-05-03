/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos.de.ordenamiento;


public class shell {

     public void Metodoshell(int[] a) {
        int salto, i, j, k, temp;
        salto = a.length / 2;
        while (salto > 0) {
            for (i = salto; i < a.length; i++) {
                j = i - salto;
                while (j >= 0) {
                    k = j + salto;
                    if (a[j] <= a[k]) {
                        j = -1;
                    } else {
                        temp = a[j];
                        a[j] = a[k];
                        a[k] = temp;
                        j -= salto;
                    }
                }
            }
            salto = salto / 2;
        }
    }
}
    

