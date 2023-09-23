
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andrea
 */
public class Especialidad {
    private int id_especialidad;
    private String nombre;
    private ArrayList<Turno> tur;

    public Especialidad() {
        this.id_especialidad = 0;
        this.nombre = null;
    }
    public Especialidad(int id_especialidad, String nombre) {
        this.id_especialidad = id_especialidad;
        this.nombre = nombre;
    }

    public int getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String area) {
        this.nombre = area;
    }

    public ArrayList<Turno> getTur() {
        return tur;
    }

    public void setTur(ArrayList<Turno> tur) {
        this.tur = tur;
    }
    
    
    
    
}
