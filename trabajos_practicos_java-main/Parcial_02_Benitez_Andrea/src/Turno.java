
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andrea
 */
public class Turno {
    private int nro_turno;
    private Date fecha_turno;
    private Paciente paci;
    private Secretaria sec;

    public Turno(int nro_turno, Date fecha_turno, Paciente paci, Secretaria sec) {
        this.nro_turno = nro_turno;
        this.fecha_turno = fecha_turno;
        this.paci = paci;
        this.sec = sec;
    }

    public int getNro_turno() {
        return nro_turno;
    }

    public void setNro_turno(int nro_turno) {
        this.nro_turno = nro_turno;
    }

    public Date getFecha_turno() {
        return fecha_turno;
    }

    public void setFecha_turno(Date fecha_turno) {
        this.fecha_turno = fecha_turno;
    }

    public Paciente getPaci() {
        return paci;
    }

    public void setPaci(Paciente paci) {
        this.paci = paci;
    }

    public Secretaria getSec() {
        return sec;
    }

    public void setSec(Secretaria sec) {
        this.sec = sec;
    }
    
    
        

        
}
