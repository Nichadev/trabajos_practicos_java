
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
    private String area;
    private ArrayList<Turno> tur;

    public Especialidad() {
        this.id_especialidad = 0;
        this.area = null;
    }
    public Especialidad(int id_especialidad, String area) {
        this.id_especialidad = id_especialidad;
        this.area = area;
    }

    public int getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public ArrayList<Turno> getTur() {
        return tur;
    }

    public void setTur(ArrayList<Turno> tur) {
        this.tur = tur;
    }
    
    
    
    
}
