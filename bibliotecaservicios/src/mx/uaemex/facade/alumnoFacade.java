/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.facade;


import mx.uaemex.dao.*;
import mx.uaemex.dto.*;

public class alumnoFacade {
    alumnodao alumnodao= new alumnodao();

	public void agregarAlumno(Alumno alumno) {
		alumnodao.agregarAlumno(alumno);
	}

	public void leerAlumno(){
		alumnodao.MostrarListaDeALumnos();

	} 

	public void actualizarAlumno(Alumno alumno) {
		alumnodao.actualizarAlumno(alumno);
	}

	public void eliminarAlumno(Alumno alumno) {
		alumnodao.eliminarAlumno(alumno);
	}
}


