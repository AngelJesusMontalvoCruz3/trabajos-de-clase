
package mx.uaemex.dto2;


public class Artista extends Persona{
    
    private int id;
    private String nombreArtista;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    @Override
    public String toString() {
        return "Artista{" + "id=" + id + ", nombreArtista=" + nombreArtista + '}';
    }
    
    
    
    
}
