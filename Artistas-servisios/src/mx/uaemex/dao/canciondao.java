/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.dao;

import mx.uaemex.dto2.*;
import java.util.List;
import java.util.ArrayList;

public class canciondao {
    
    List<Cancion> canciones = new ArrayList<Cancion>();
	int id=0; 

	public void agregarCancion(Cancion cancion) {
		cancion.setId(id+1);
		canciones.add(cancion);
		id++;	
	}

	public void actualizarCancion (Cancion cancion) {
		  for (int i = 0; i < canciones.size(); i++) {
	          if(canciones.get(i).getId()== cancion.getId()){
	  canciones.get(i).setNombre(cancion.getNombre());
	  canciones.get(i).setCompositor(cancion.getCompositor());
	  canciones.get(i).setFechalanzamiento(cancion.getFechalanzamiento());         
          canciones.get(i).setGenero(cancion.getGenero());
	          }
		  }
	}


	public void eliminarCancion(Cancion cancion) {
		canciones.remove(cancion);

	}
	 public List<Cancion> MostrarListaDeCanciones() {
		 return canciones;
		 }
}
