/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.facade;

import mx.uaemex.dto2.*;
import mx.uaemex.dao.*;
import mx.uaemex.servisios;

public abstract class cancionfacade implements servisios {

	canciondao cancionDao = new canciondao();

	@Override
	public void agregarCancion(Cancion cancion) {
	cancionDao.agregarCancion(cancion);
	}

	@Override
	public void actualizarCancion(Cancion cancion) {
	cancionDao.actualizarCancion(cancion);
	}

	@Override
	public void mostrarCancion() {
	cancionDao.MostrarListaDeCanciones();
}

	@Override
	public void eliminarCancion(Cancion cancion) {
	cancionDao.eliminarCancion(cancion);
}
    
    
}
