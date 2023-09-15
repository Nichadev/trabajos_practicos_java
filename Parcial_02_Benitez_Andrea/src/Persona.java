
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andrea
 */
public abstract class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private Date fecha_nacim;
    private String correo;

    public Persona(String nombre, String apellido, int dni, Date fecha_nacim, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_nacim = fecha_nacim;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFecha_nacim() {
        return fecha_nacim;
    }

    public void setFecha_nacim(Date fecha_nacim) {
        this.fecha_nacim = fecha_nacim;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
    
    
}
