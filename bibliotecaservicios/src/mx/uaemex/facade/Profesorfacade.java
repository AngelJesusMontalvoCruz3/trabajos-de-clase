/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.facade;

import mx.uaemex.dao.*;
import mx.uaemex.dto.*;

public class Profesorfacade {
    Profesordao profesordao= new Profesordao();

	public void agregarProfesor(Profesor profesor) {
		profesordao.AgregarProfesor(profesor);
	}

	public void leerProfesor() {
		profesordao.MostrarLista();
	}

	public void actualizarProfesor(Profesor profesor) {
		profesordao.ActualizarProfesor(profesor);
	}

	public void eliminarProfesor(Profesor profesor) {
		profesordao.EliminarProfesor(profesor);
	}   
}

    

