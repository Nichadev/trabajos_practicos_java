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
    private int dni;
    private String domicilio;
    private int celular;
    private String email;
    
    public Cliente() {
        this.setId(0);
        this.setApellido("");
        this.setNombre("");
        this.setDni(0);
        this.setDomicilio("");
        this.setCelular(0);
        this.setEmail("");
    }
    
    public Cliente(int id, String apellido, String nombre, int dni, String domicilio, int celular, String email) {
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
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
            getDni(), getDomicilio(), getCelular(), getEmail()
        };
        return info;
    }
    
    
    
    
}
