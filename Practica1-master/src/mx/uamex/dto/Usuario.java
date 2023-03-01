
package mx.uamex.dto;


public class Usuario {
    private String usuario;
private String passwordMD5;
private Integer anioNacimiento;
public Usuario(String usuario, String passwordMD5) {
this.usuario = usuario;
this.passwordMD5 = passwordMD5;
}
public String getUsuario() {
return usuario;
}
public void setUsuario(String usuario) {
this.usuario = usuario;
}
public String getPasswordMD5() {
return passwordMD5;
}
public void setPasswordMD5(String passwordMD5) {
this.passwordMD5 = passwordMD5;
}
public Integer getAnioNacimiento() {
return anioNacimiento;
}
public void setAnioNacimiento(Integer anioNacimiento) {
this.anioNacimiento = anioNacimiento;
}
// edad es un atributo derivado, tiene getter pero no setter
public Integer getEdad() {
return 2023 - anioNacimiento;
}
}
    

