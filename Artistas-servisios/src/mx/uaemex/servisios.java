/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.uaemex;

import mx.uaemex.dto2.Album;
import mx.uaemex.dto2.Artista;
import mx.uaemex.dto2.Cancion;
import mx.uaemex.dto2.Grupo;
        
public interface servisios {
    
    void agregarAlbum(Album album);
	void actualizarAlbum(Album album);
	void mostrarAlbum();
	void eliminarAlbum(Album album);

	void agregarArtista(Artista artista);
	void actualizarArtista(Artista artista);
	void mostrarArtista();
	void eliminarArtista(Artista artista);

	void agregarCancion(Cancion cancion);
	void actualizarCancion(Cancion cancion);
	void mostrarCancion();
	void eliminarCancion(Cancion cancion);

	void agregarGrupo(Grupo grupo);
	void actualizarGrupo(Grupo grupo);
	void mostrarGrupo();
	void eliminarGrupo(Grupo grupo);

    
}
