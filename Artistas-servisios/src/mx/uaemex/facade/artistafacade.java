/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.facade;

import mx.uaemex.dto2.*;
import mx.uaemex.dao.*;
import mx.uaemex.servisios;

public abstract class artistafacade implements servisios {

	artistasdao artistaDao = new artistasdao();

	@Override
	public void agregarArtista(Artista artista) {
	artistaDao.agregarArtista(artista);
}

	@Override
	public void actualizarArtista(Artista artista) {
	artistaDao.actualizarArtista(artista);
}

	@Override
	public void mostrarArtista() {
	artistaDao.MostrarListaDeArtistas();
}

	@Override
	public void eliminarArtista(Artista artista) {
	artistaDao.eliminarArtista(artista);
}
    
    
}
