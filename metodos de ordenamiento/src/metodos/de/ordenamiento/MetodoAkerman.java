/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos.de.ordenamiento;


public class MetodoAkerman {

     public int Metodoakerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return Metodoakerman(m - 1, 1);
        } else {
            return Metodoakerman(m - 1, Metodoakerman(m, n - 1));
            
        }
    }
}

