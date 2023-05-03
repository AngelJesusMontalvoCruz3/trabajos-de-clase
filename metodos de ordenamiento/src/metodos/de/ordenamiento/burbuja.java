/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos.de.ordenamiento;

public class burbuja {
    
    public void burbuja(int m[]){
        
        for(int i=0; i < m.length - 1;i++){
            
            for(int j=0; j < m.length-i-1;j++){
                if(m[j]>m[j+1]){
                    int aux =m[j];
                    m[j]=m[j+1];
                    m[j+1]=aux;
                }
            }
        }
        System.out.println("ordenar de menor a mayor:");
        for(int i=0; i< m.length; i++){
            System.out.print(m[i]+"");
        }
    }
    
}
