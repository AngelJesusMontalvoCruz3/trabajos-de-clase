package mx.uaemex.dto2;

import java.util.List;

public class Album {

    private int id;
    private String nombre;
    private int Fechalanzamineto;
    List<Cancion>Cancion;
    private String Genero;
    
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

    public int getFechalanzamiento() {
        return Fechalanzamineto;
    }

    public void setFechalanzamiento(int Fechalanzamineto) {
        this.Fechalanzamineto = Fechalanzamineto;
    }

    public List<Cancion> getCancion() {
        return Cancion;
    }

    public void setCancion(List<Cancion> Cancion) {
        this.Cancion = Cancion;
    }
    public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
    }

    @Override
    public String toString() {
        return "Album{" + "id=" + id + ", nombre=" + nombre + ", Fechalanzamineto=" + Fechalanzamineto + ", Cancion=" + Cancion + '}';
    }
    

}
