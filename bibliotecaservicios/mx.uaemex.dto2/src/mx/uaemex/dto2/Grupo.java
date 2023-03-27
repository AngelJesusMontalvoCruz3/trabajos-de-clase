package mx.uaemex.dto2;

import java.util.List;

public class Grupo extends Artista{

    private int id;
    private String nombre;
    
    private List<Artista> Artista;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Artista> getArtista() {
        return Artista;
    }

    public void setArtista(List<Artista> Artista) {
        this.Artista = Artista;
    }

    @Override
    public String toString() {
        return "Grupo{" + "id=" + id + ", nombre=" + nombre + ", Artista=" + Artista + '}';
    }
    
    

}
