package mx.uaemex.dto;

public class Profesor extends Persona {

    private int id;
    private int numeroEmpleado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String toString() {
        return "Profesor{" + "id=" + id + ", numeroEmpleado=" + numeroEmpleado + '}';
    }
}
