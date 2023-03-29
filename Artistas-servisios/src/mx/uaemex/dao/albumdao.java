/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uaemex.dto2.Album;

public class albumdao {
    
    List<Album> albums= new ArrayList<Album>();
	int id=0;

	public void agregarAlbum(Album album) {
		album.setId(id+1);
		albums.add(album);
		id++;	
	}

	public void actualizarAlbum (Album album) {
		  for (int i = 0; i < albums.size(); i++) {
	          if(albums.get(i).getId()== album.getId()){
	              albums.get(i).setNombre(album.getNombre());
	               albums.get(i).setGenero(album.getGenero());
	                albums.get(i).setFechalanzamiento(album.getFechalanzamiento());
	          }
		  }
	}


	public void eliminarAlbum(Album album) {
		albums.remove(album);

	}
	 public List<Album> MostrarListaDeAlbums() {
		 return albums;
		 }
   
}
