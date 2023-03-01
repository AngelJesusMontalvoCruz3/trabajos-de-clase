package mx.uaemex.test2;

import java.util.ArrayList;
import java.util.List;
import mx.uaemex.dto2.*;

public class Artistas {

    public static void main(String[] args) {

        Artista Artista1 = new Artista();
        Artista1.setNombreArtista("queen");
        Artista1.setNombre("freddie");
        Artista1.setApellidoPaterno("Mercury");
        Artista1.setApellidpMaterno("null");
        Artista1.setId(2);

        Cancion cancion1 = new Cancion();
        cancion1.setCompositor("Freddie");
        cancion1.setFechalanzamineto(1975);
        cancion1.setGenero("rock");
        cancion1.setNombre("bhoemian");
        cancion1.setId(1);

        Album album1 = new Album();
        album1.setId(1);
        album1.setNombre("rhapsody");
        album1.setFechalanzamineto(2018);

        List<Artista> listaArtistas = new ArrayList<>();
        listaArtistas.add(Artista1);

        List<Persona> listaPersona = new ArrayList<>();
        listaPersona.add(Artista1);

        List<Cancion> listacancion = new ArrayList<>();
        listacancion.add(cancion1);

        for (Artista artista : listaArtistas) {
            System.out.println("Nombre: " + artista.getNombre() + " " + artista.getApellidoPaterno() + " " + artista.getApellidpMaterno());
            System.out.println("Nombre artístico: " + artista.getNombreArtista());
        }

        System.out.println(listacancion);
        System.out.println(listaPersona);
    }

}
