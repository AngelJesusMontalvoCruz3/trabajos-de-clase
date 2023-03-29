/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.facade;

import mx.uaemex.dto2.*;
import mx.uaemex.dao.*;
import mx.uaemex.servisios;
        
public abstract class albumfacade implements servisios {

	albumdao albumDao= new albumdao();

	@Override
	public void agregarAlbum(Album album) {
		albumDao.agregarAlbum(album);
	}

	@Override
		public void actualizarAlbum(Album album) {
		albumDao.actualizarAlbum(album);
	}

	@Override
		public void mostrarAlbum() {
		albumDao.MostrarListaDeAlbums();
	}

	@Override
		public void eliminarAlbum(Album album) {
		albumDao.eliminarAlbum(album);
	}
    
    
}
