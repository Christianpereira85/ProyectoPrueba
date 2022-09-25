package clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Persona {

    public int idPersona;
    public String nombre;
    public String apellido;
    public String dptoResidencia;
    private Byte cantHijos;
    private String fechaNacimiento;
    
    
    private Barco barco;
    public Avion avion;

    public Persona(int idPersona, String nombre, String apellido, String dptoResidencia, Byte cantHijos, String fechaNacimiento, Barco barco, Avion avion) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dptoResidencia = dptoResidencia;
        this.cantHijos = cantHijos;
        this.fechaNacimiento = fechaNacimiento;
        this.barco = barco;
        this.avion = avion;
    }

    
    
    
    public Persona(){
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
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

    public String getDptoResidencia() {
        return dptoResidencia;
    }

    public void setDptoResidencia(String dptoResidencia) {
        this.dptoResidencia = dptoResidencia;
    }

    public Byte getCantHijos() {
        return cantHijos;
    }

    public void setCantHijos(Byte cantHijos) {
        this.cantHijos = cantHijos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", dptoResidencia=" + dptoResidencia + ", cantHijos=" + cantHijos + ", fechaNacimiento=" + fechaNacimiento + ", barco=" + barco + ", avion=" + avion + '}';
    }

    
    
    

   
    
    

}
