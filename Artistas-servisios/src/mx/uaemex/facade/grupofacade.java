/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.facade;

import mx.uaemex.dto2.*;
import mx.uaemex.dao.*;
import mx.uaemex.servisios;

public abstract class grupofacade implements servisios{

	grupodao grupoDao= new grupodao();

	@Override
	public void agregarGrupo(Grupo grupo) {
	grupoDao.agregarGrupo(grupo);
	}

	@Override
		public void actualizarGrupo(Grupo grupo) {
	grupoDao.actualizarGrupo(grupo);
	}

	@Override
		public void mostrarGrupo() {
	grupoDao.MostrarListaDeGrupos();
	}

	@Override
		public void eliminarGrupo(Grupo grupo) {
	grupoDao.eliminarGrupo(grupo);
	}
    
    
}
