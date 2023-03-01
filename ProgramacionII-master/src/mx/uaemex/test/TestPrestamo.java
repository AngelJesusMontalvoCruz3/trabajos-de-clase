package mx.uaemex.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.uaemex.dto.*;

public class TestPrestamo {

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();

        alumno1.setId(1);
        alumno1.setNombre("joseluis");
        alumno1.setNumerodeCuenta(20227102);
        alumno1.setApellidoPaterno("Garcia");
        alumno1.setApellidpMaterno("Rivera");

        //nuevo alumno y prestamo 
        System.out.println(" ");
        Alumno alumno2 = new Alumno();
        alumno2.setId(2);
        alumno2.setNombre("Angelo");
        alumno2.setNumerodeCuenta(20227103);
        alumno2.setApellidoPaterno("Cortes");
        alumno2.setApellidpMaterno("Cortes");

        Alumno alumno3 = new Alumno();
        alumno3.setId(3);
        alumno3.setNombre("Manuel");
        alumno3.setNumerodeCuenta(2273927);
        alumno3.setApellidoPaterno("Martines");
        alumno3.setApellidpMaterno("Peralta");
        
        Alumno alumno4 = new Alumno();
        alumno4.setId(4);
        alumno4.setNombre("fernanda");
        alumno4.setNumerodeCuenta(1916973);
        alumno4.setApellidoPaterno("Fajardo");
        alumno4.setApellidpMaterno("Sanchez");
        
        Libro Libro1 = new Libro();
        Libro1.setId(1);
        Libro1.setNombre("Calculo");
        Libro1.setCategoria("Matematicas");
        Libro1.setEditorial("Alfaomega");
        Libro1.setIsbn(344);
        Libro1.setStock(2);

        Libro Libro2 = new Libro();
        Libro2.setId(2);
        Libro2.setNombre("Fundamentos de programacion");
        Libro2.setCategoria("Programacion");
        Libro2.setEditorial("Alfaomega");
        Libro2.setIsbn(2324);
        Libro2.setStock(5);
        
        Libro libro3 = new Libro();
        libro3.setId(3);
        libro3.setNombre("Introducción a la economía");
        libro3.setCategoria("Economía");
        libro3.setEditorial("Fondo de Cultura Económica");
        libro3.setIsbn(1254);
        libro3.setStock(3);

        Libro libro4 = new Libro();
        libro4.setId(4);
        libro4.setNombre("Historia de la filosofía");
        libro4.setCategoria("Filosofía");
        libro4.setEditorial("Siglo XXI Editores");
        libro4.setIsbn(3256);
        libro4.setStock(6);
        
        Libro libro5 = new Libro();
        libro5.setId(5);
        libro5.setNombre("Ingles 5");
        libro5.setCategoria("Lenguas Extranjeras");
        libro5.setEditorial("Oxford");
        libro5.setIsbn(3343);
        libro5.setStock(5);
        
        List<Libro> listalibros = new ArrayList<>();
        listalibros.add(Libro1);
        listalibros.add(Libro2);

        List<Libro> listalibros3 = new ArrayList<>();
        listalibros3.add(libro3);

        List<Libro> listalibros4 = new ArrayList<>();
        listalibros4.add(libro4);
        
        List<Libro> listalibros5 = new ArrayList<>();
        listalibros5.add(libro5);
        
        
        Prestamo prestamo1 = new Prestamo();
        Date fechaint = new Date();
        prestamo1.setId(1);
        prestamo1.setFolio(234);
        prestamo1.setFechainicio(fechaint);
        prestamo1.setLibros(listalibros);
        prestamo1.setPersona(alumno1);
        System.out.println(prestamo1);

        Prestamo prestamo3 = new Prestamo();
        Date fechaint3 = new Date();
        prestamo3.setId(2);
        prestamo3.setFolio(235);
        prestamo3.setFechainicio(fechaint3);
        prestamo3.setLibros(listalibros3);
        prestamo3.setPersona(alumno2);

        Prestamo prestamo4 = new Prestamo();
        Date fechaint4 = new Date();
        prestamo4.setId(3);
        prestamo4.setFolio(236);
        prestamo4.setFechainicio(fechaint4);
        prestamo4.setLibros(listalibros4);
        prestamo4.setPersona(alumno3);
        
        Prestamo prestamo5 = new Prestamo();
        Date fechaint5 = new Date();
        prestamo5.setId(4);
        prestamo5.setFolio(136);
        prestamo5.setFechainicio(fechaint5);
        prestamo5.setLibros(listalibros5);
        prestamo5.setPersona(alumno4);

        System.out.println(prestamo3);
        System.out.println(prestamo4);
        System.out.println(prestamo5);

    }

}
