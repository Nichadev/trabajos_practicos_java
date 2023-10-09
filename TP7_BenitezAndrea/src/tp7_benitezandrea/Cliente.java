/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7_benitezandrea;

/**
 *
 * @author andrea
 */
public class Cliente {
    private int id;
    private String apellido;
    private String nombre;
    private String domicilio;
    private String celular;
    private String email;
    private String dni;
    
    public Cliente() {
        this.setId(0);
        this.setApellido("");
        this.setNombre("");
        this.setDni("");
        this.setDomicilio("");
        this.setCelular("");
        this.setEmail("");
    }
    
    public Cliente(int id, String apellido, String nombre, String domicilio, String celular,String email, String dni) {
        this.setId(id);
        this.setApellido(apellido);
        this.setNombre(nombre);
        this.setDni(dni);
        this.setDomicilio(domicilio);
        this.setCelular(celular);
        this.setEmail(email);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Object[] toObject(){
        Object[] info = new Object[]{
            getId(), getApellido(), getNombre(),
            getDomicilio(), getCelular(), getEmail(), getDni()
        };
        return info;
    }
    
    
    
    
}
