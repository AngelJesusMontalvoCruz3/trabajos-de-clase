/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;

/**
 *
 * @author eq13
 */
public class arbolB {
    
    Nodo padre;
    Nodo raiz;
    public arbolB(){
        raiz=null;
    }
    public void InsertarNodo(int elem){
        if(raiz==null){
        raiz=new Nodo(elem);
        }else{
        raiz.InsertaBinario(elem);
    }
}
    public void preorden (Nodo Nodo){
        if(Nodo==null)return;
        else{
           System.out.print(Nodo.getElemento()+"");
           preorden(Nodo.getRamaiz());
           preorden(Nodo.getRamaDer());
                  
        }
            
}
    public void Postorden(Nodo Nodo){
        if(Nodo==null){
        }else{
        Postorden(Nodo.getRamaiz());
            Postorden(Nodo.getRamaDer());
            System.out.print(Nodo.getElemento()+"");
                             
    }
}
    public void Inorden(Nodo Nodo){
        
    }
}