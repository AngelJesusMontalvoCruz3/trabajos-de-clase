/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.facade;

import mx.uaemex.dao.*;
import mx.uaemex.dto.*;

public class librofacade {
    librodao libroDao= new librodao();

	public void agregarLibro(Libro libro) {
		libroDao.AgregarLibro(libro);
	}

	public void leerLibro() {
		libroDao.MostrarLista();
	}

	public void actualizarLibro(Libro libro) {
		libroDao.ActualizarLibro(libro);
	}
	public void eliminarLibro(Libro libro) {
		libroDao.EliminarLibro(libro);
	}
}

    

