/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.dao;


import java.util.ArrayList;
import java.util.List;
import mx.uaemex.dto.Profesor;

public class Profesordao {
    
    List <Profesor> profesores= new ArrayList<Profesor>();
	int id=0;

	public void AgregarProfesor(Profesor profesor) {
		profesor.setId(id+1);
		profesores.add(profesor);
		id++;

	}

	public void ActualizarProfesor (Profesor profesor) {
		for (int i = 0; i < profesores.size(); i++) {
	        if(profesores.get(i).getId()==profesor.getId()) {
	
        profesores.get(i).setNumeroEmpleado(profesor.getNumeroEmpleado());
	        	  }
	          }

	}

	public void EliminarProfesor(Profesor profesor) {
		profesores.remove(profesor);

	}
	public void MostrarLista() {
		 System.out.println(profesores);
		 }


   
}
