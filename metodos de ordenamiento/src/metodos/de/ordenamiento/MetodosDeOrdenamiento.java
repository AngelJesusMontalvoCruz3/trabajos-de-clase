  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos.de.ordenamiento;

import java.util.Arrays;
import java.util.Scanner;

public class MetodosDeOrdenamiento {

    
    public static void main(String[] args) {
       
     int opc;
     Metodollenar llenar =new Metodollenar();
     burbuja MB=new burbuja();
     inserciondirecta MID=new inserciondirecta();
     seleccion MS=new seleccion();
     Quicksort MQ = new Quicksort();
     Hanoi hanoi = new Hanoi();
     shell sh = new shell();
     MetodoAkerman MA = new MetodoAkerman();
     
System.out.println("metodos de ordenamiento");
Scanner Oas = new Scanner(System.in);
System.out.println("dame el tamaño de las filas");
int F = Oas.nextInt();

int[]m=new int[F];

System.out.println("MENU PARA ORDENAR");
System.out.println("1.METODO BURBUJA");
System.out.println("2.METODO DE INSERCION");
System.out.println("3.METODO DE SELECCION");
System.out.println("4.METODO DE QUICKSORT");
System.out.println("5.METODO HANOI");
System.out.println("6.METODO SHELL");
System.out.println("7.METODO AKERMAN");

opc = Oas.nextInt();

switch (opc){
    
    case 1:
        llenar.llenarnumeros(m);
        MB.burbuja(m);
        
        break;
        
    case 2:
        llenar.llenarnumeros(m);
        MID.inserciondirecta(m);
        
        break;
        
    case 3:
        llenar.llenarnumeros(m);
        MS.seleccion(m);
    
        break;
    
     case 4:
           llenar.llenarnumeros(m);
           Quicksort.quicksort(m, 0, m.length - 1);
           System.out.println(Arrays.toString(m));
           
           break;

     case 5:
            System.out.println("Moviendo discos con el método de Hanoi");
            System.out.println("Ingrese la cantidad de discos:");
            int n = Oas.nextInt();
            hanoi.moverDiscos(n, 'A', 'C', 'B');
            break;

     case 6:
            llenar.llenarnumeros(m);
            System.out.println("Arreglo original: " + Arrays.toString(m));
            sh.Metodoshell(m);
            System.out.println("Arreglo ordenado: " + Arrays.toString(m));
            
            break;
            
    case 7:
    
            llenar.llenarnumeros(m);
            Quicksort.quicksort(m, 0, m.length - 1);
            System.out.println(Arrays.toString(m));
            
            break;
   
             
}
    }
}


    








