 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos.de.ordenamiento;


public class seleccion {
    public void seleccion(int m[]){
        int a,r,menor,j,aux;
        for(a=0; a<m.length-1;a++ ){
            menor=m[a];
            j = a;
            for(r=a+1; r<m.length;r++){
                if(m[r]<menor){
                    menor =m[r];
                    j=r;
                    
                }
            }
            if(j !=a){
              aux =m[a];
              m[a]=m[j];
              m[j]=aux;
            }
        }
        System.out.println("ordenar de menor a mayor:");
        for(a=0;a<m.length;a++){
            System.out.print(m[a]+"");
        }
    }
    
}
