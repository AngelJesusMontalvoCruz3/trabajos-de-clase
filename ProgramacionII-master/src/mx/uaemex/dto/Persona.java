package mx.uaemex.dto;

public class Persona {

    private int id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidpMaterno;
    private String genero;

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

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidpMaterno() {
        return apellidpMaterno;
    }

    public void setApellidpMaterno(String apellidpMaterno) {
        this.apellidpMaterno = apellidpMaterno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidpMaterno=" + apellidpMaterno + ", genero=" + genero + '}';
    }
    

}
