package mx.uaemex.dto;

public class Alumno  {

    private int id;
    private int numerodeCuenta;
    private String nombre;
    private String  ApellidoPaterno;
    private String ApellidoMaterno;
    
   
    public int getId() {
        return id;
    }

   
    public void setId(int id) {
        this.id = id;
    }

    public int getNumerodeCuenta() {
        return numerodeCuenta;
    }

    public void setNumerodeCuenta(int numerodeCuenta) {
        this.numerodeCuenta = numerodeCuenta;
    }

    
    public String getNombre() {
        return nombre;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", numerodeCuenta=" + numerodeCuenta + ", nombre=" + nombre + ", ApellidoPaterno=" + ApellidoPaterno + ", ApellidoMaterno=" + ApellidoMaterno + '}';
    
    }
    
}

    
   
  
