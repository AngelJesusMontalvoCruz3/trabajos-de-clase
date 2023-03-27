/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.test;

import java.util.ArrayList;
import java.util.List;
import mx.uaemex.dao.*;
import mx.uaemex.dto.*;

public class Testuaemex {
    alumnodao alumnodao = new alumnodao();
	Profesordao profesordao = new Profesordao();
	Prestamodao prestamodao = new Prestamodao();
	librodao librodao = new librodao();

	public void CrearPrestamo(Prestamo prestamo) {
		prestamodao.AgregarPrestamo(prestamo);
	}
	public void CrearLibro(Libro libro) {
		librodao.AgregarLibro(libro);
	}
	public void CrearALumno(Alumno alumno) {
		alumnodao.agregarAlumno(alumno);
	}
	public void CrearProfesor(Profesor profesor) {
		profesordao.AgregarProfesor(profesor);
	}

	public void ConsultarPrestamo(int id) {
		Prestamo p= prestamodao.Buscar(id);
		System.out.println("La busqueda desde id es: "+ p.toString());	
	}

	public void ConsultarTodos() {
		List<Prestamo> prestamos= prestamodao.MostrarLista();
		for (Prestamo p: prestamos) {
			System.out.println(p.toString());
		}

	}

    
}
