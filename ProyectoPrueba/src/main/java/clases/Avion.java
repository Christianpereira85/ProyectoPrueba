
package clases;

public class Avion extends Vehiculo{
    public double longitud;
    public int cantPasajeros;

    public Avion(int idVehiculo, String nomVehiculo, String color, double longitud, int cantPasajeros) {
        super(idVehiculo, nomVehiculo, color);
        this.longitud = longitud;
        this.cantPasajeros = cantPasajeros;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getNomVehiculo() {
        return nomVehiculo;
    }

    public void setNomVehiculo(String nomVehiculo) {
        this.nomVehiculo = nomVehiculo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
