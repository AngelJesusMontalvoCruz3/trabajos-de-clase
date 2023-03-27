/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uaemex.dto.Prestamo;


public class Prestamodao {
    
    List<Prestamo> prestamos= new ArrayList<Prestamo>();
	int id=0;

	public void AgregarPrestamo(Prestamo prestamo) {
		prestamo.setId(id+1);
		prestamos.add(prestamo);
		id++;

	}

	public void ActualizarPrestamos (Prestamo prestamo) {
		for (int i = 0; i < prestamos.size(); i++) {
	        if(prestamos.get(i).getId()== prestamo.getId()) {
	 prestamos.get(i).setFolio(prestamo.getFolio());
	 prestamos.get(i).setLibros(prestamo.getLibros());
	 prestamos.get(i).setPersona(prestamo.getPersona());
	 prestamos.get(i).setEstatus(prestamo.getEstatus());
	          }
		 }
	}

	public Prestamo Buscar(int id) {
		for (int i = 0; i < prestamos.size(); i++) {
            Prestamo a = prestamos.get(i);
            if (a.getId() == id) {
               System.out.println(a.getId());
                return a;
                }
            }
		return null;
	}

	public void EliminarPrestamo(Prestamo prestamo) {
		prestamos.remove(prestamo);

	}
	public List<Prestamo> MostrarLista() {
		 return prestamos;
		 }
}


