/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos.de.ordenamiento;


public class inserciondirecta {
    public void inserciondirecta(int m[]){
        int a,r;
        int aux;
        for(a=1; a< m.length; a++){
            aux=m[a];
            r=a-1;
            while((r>=0) && (aux<m[a])){
                m[a+1]=m[a];
                a--;
           }
            m[a+1]=aux;
        }
        System.out.println("ordenar de menor a mayor:");
        for(int i=0; i<m.length;i++){
            System.out.print(m[i]+"");
        }
    }
    
}
