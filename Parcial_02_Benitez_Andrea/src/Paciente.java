/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andrea
 */
public class Paciente extends Persona {
    private int id_paciente;
    private int edad;
    private String motivo;
    private String obraSoc;
    private boolean estado;

    public Paciente(int id_paciente, String nombre, String apellido, int dni, String motivo) {
        super(nombre, apellido, dni);
        this.id_paciente = id_paciente;
        this.motivo = motivo;
    }
    
    

    public Paciente(int id_paciente, String nombre, String apellido, int edad, int dni, String motivo, String obraSoc, boolean estado) {
        super(nombre, apellido, dni);
        this.id_paciente = id_paciente;
        this.edad = edad;
        this.motivo = motivo;
        this.obraSoc = obraSoc;
        this.estado = estado;
    }


    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getObraSoc() {
        return obraSoc;
    }

    public void setObraSoc(String obraSoc) {
        this.obraSoc = obraSoc;
    }
    
    

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    
}
