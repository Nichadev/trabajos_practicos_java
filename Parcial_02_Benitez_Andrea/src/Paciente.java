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
    private String motivo;

    public Paciente(int id_paciente, String nombre, String apellido, int dni, String motivo) {
        super(nombre, apellido, dni);
        this.id_paciente = id_paciente;
        this.motivo = motivo;
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
    
    
    
    
    
}
