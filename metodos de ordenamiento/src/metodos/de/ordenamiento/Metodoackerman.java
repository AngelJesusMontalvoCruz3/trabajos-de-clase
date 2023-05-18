/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos.de.ordenamiento;


public class Metodoackerman {

     public int Metodoackerman(int m, int n) {
         int acker=0;
        if (m == 0) {
            acker+= n+1;
        } else {
        if(n==0){
            acker+= Metodoackerman(m-1,1);
        } else if(m>0&&n>0) {
            acker+=Metodoackerman(m - 1, Metodoackerman(m, n - 1));   
            }
        }
        return acker;
    }
}


