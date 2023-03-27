
package mx.uaemex.dao;


import java.util.ArrayList;
import java.util.List;
import mx.uaemex.dto.Libro;


public class librodao {
    
 List<Libro> libros= new ArrayList<Libro>();	
	int id=0;


	public void AgregarLibro(Libro libro) {
		libro.setId(id+1);
		libros.add(libro);
		id++;

	}

	public void ActualizarLibro (Libro libro) {
		for (int i = 0; i < libros.size(); i++) {
	          if(libros.get(i).getId()==libro.getId()) {
	 libros.get(i).setNombre(libro.getNombre());
	 libros.get(i).setCategoria(libro.getCategoria());
	 libros.get(i).setEditorial(libro.getEditorial());
	 libros.get(i).setIsbn(libro.getIsbn());
         libros.get(i).setStock(libro.getStock());;
	          }
	     }
	}

	public void EliminarLibro(Libro libro) {
		libros.remove(libro);

	}
	public List<Libro> MostrarLista() {
		 return libros;
		 }
}
