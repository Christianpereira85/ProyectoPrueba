
package clases;

public class Vehiculo {
    public int idVehiculo;
    public String nomVehiculo;
    public String color;

    public Vehiculo(int idVehiculo, String nomVehiculo, String color) {
        this.idVehiculo = idVehiculo;
        this.nomVehiculo = nomVehiculo;
        this.color = color;
    }
    
    public Vehiculo(){
        
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public void setNomVehiculo(String nomVehiculo) {
        this.nomVehiculo = nomVehiculo;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
