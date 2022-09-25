
package clases;


public class Barco extends Vehiculo{
    public double eslora;
    public double manga;

    public Barco(int idVehiculo, String nomVehiculo, String color, double eslora, double manga) {
        super(idVehiculo, nomVehiculo, color);
        this.eslora = eslora;
        this.manga = manga;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public double getManga() {
        return manga;
    }

    public void setManga(double manga) {
        this.manga = manga;
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
