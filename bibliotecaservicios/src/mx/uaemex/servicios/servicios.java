package mx.uaemex.servicios;

import mx.uaemex.dto.*;
import mx.uaemex.facade.*;

public class servicios {
    
    alumnoFacade alumnoservicio= new alumnoFacade();
    librofacade libroservicio= new librofacade();
    Profesorfacade profesorservicio= new Profesorfacade();
    Prestamofacade prestamoservicio= new Prestamofacade();


	public void agregarAlumno(Alumno alumno) {
		alumnoservicio.agregarAlumno(alumno);
	}
	public void mostrarAlumno() {
		alumnoservicio.leerAlumno();
	}
	public void actualizarAlumno(Alumno alumno) {
		alumnoservicio.actualizarAlumno(alumno);
	}
	public void eliminarAlumno(Alumno alumno) {
		alumnoservicio.eliminarAlumno(alumno);
	}


	public void agregarProfesor(Profesor profesor) {
		profesorservicio.agregarProfesor(profesor);
	}
	public void mostrarProfesor() {
		profesorservicio.leerProfesor();
	}
	public void actualizarProfesor(Profesor profesor) {
		profesorservicio.actualizarProfesor(profesor);
	}
	public void eliminarProfesor(Profesor profesor) {
		profesorservicio.eliminarProfesor(profesor);
	}


	public void agregarLibro(Libro libro) {
		libroservicio.agregarLibro(libro);
	}
	public void mostrarLibro() {
		libroservicio.leerLibro();
	}
	public void actualizarLibro(Libro libro) {
		libroservicio.actualizarLibro(libro);
	}
	public void eliminarLibro(Libro libro) {
		libroservicio.eliminarLibro(libro);
	}



	public void agregarPrestamo(Prestamo prestamo) {
		prestamoservicio.agregarPrestamo(prestamo);
	}
	public void mostrarPrestamo() {
		prestamoservicio.leerPrestamo();
	}
	public void actualizarPrestamo(Prestamo prestamo) {
		prestamoservicio.actualizarPrestamo(prestamo);
	}
	public void eliminarPrestamo(Prestamo prestamo) {
		prestamoservicio.eliminarPrestamo(prestamo);
	}
}


