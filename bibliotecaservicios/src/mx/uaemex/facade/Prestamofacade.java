/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.facade;

import mx.uaemex.dao.*;
import mx.uaemex.dto.*;

public class Prestamofacade {
    Prestamodao prestamodao= new Prestamodao();

	public void agregarPrestamo(Prestamo prestamo) {
		prestamodao.AgregarPrestamo(prestamo);
	}

	public void leerPrestamo() {
		prestamodao.MostrarLista();

	}

	public void actualizarPrestamo(Prestamo prestamo) {
		prestamodao.ActualizarPrestamos(prestamo);
	}
	public void eliminarPrestamo(Prestamo prestamo) {
		prestamodao.EliminarPrestamo(prestamo);
	}

}
