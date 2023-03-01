
package mx.uaemex.dto2;

import java.util.List;


public class Cancion {
     private int id;
    private String nombre;
    private String compositor;
    private String genero;
    private int Fechalanzamineto;
    private List<Persona>Persona;

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

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getFechalanzamineto() {
        return Fechalanzamineto;
    }

    public void setFechalanzamineto(int Fechalanzamineto) {
        this.Fechalanzamineto = Fechalanzamineto;
    }

    public List<Persona> getPersona() {
        return Persona;
    }

    public void setPersona(List<Persona> Persona) {
        this.Persona = Persona;
    }

    @Override
    public String toString() {
        return "Cancion{" + "id=" + id + ", nombre=" + nombre + ", compositor=" + compositor + ", genero=" + genero + ", Fechalanzamineto=" + Fechalanzamineto + ", Persona=" + Persona + '}';
    }
    
    
}
