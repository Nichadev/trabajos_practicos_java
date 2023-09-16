
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andrea
 */
public class Profesional extends Persona {
    private int id_profesional;
    private ArrayList<Especialidad> esp;

    public Profesional(int id_profesional, String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.id_profesional = id_profesional;
    }

    public int getId_profesional() {
        return id_profesional;
    }

    public void setId_profesional(int id_profesional) {
        this.id_profesional = id_profesional;
    }

    public ArrayList<Especialidad> getEsp() {
        return esp;
    }

    public void setEsp(ArrayList<Especialidad> esp) {
        this.esp = esp;
    }
    
    
    
    
    
    
    
    
}
