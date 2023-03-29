/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.dao;

import mx.uaemex.dto2.*;
import java.util.List;
import java.util.ArrayList;

public class artistasdao {
    
    List<Artista> artistas= new ArrayList<Artista>();
	int id=0;

	public void agregarArtista(Artista artista) {
		artista.setId(id+1);
		artistas.add(artista);
		id++;	
	}

	public void actualizarArtista (Artista artista) {
		  for (int i = 0; i < artistas.size(); i++) {
	          if(artistas.get(i).getId()== artista.getId()){
	              artistas.get(i).setNombreArtista(artista.getNombreArtista());
	              	artistas.get(i).setId(artista.getId());
	          }
		  }
	}


	public void eliminarArtista(Artista artista) {
		artistas.remove(artista);

	}
	 public List<Artista> MostrarListaDeArtistas() {
		 return artistas;
		 }

}
    

