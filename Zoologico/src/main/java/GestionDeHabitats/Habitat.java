package GestionDeHabitats;

public class Habitat {
    protected double temperatura;
    protected double humedad;
    protected boolean limpieza;

    public Habitat(double temperatura, double humedad, boolean limpieza) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public boolean isLimpieza() {
        return limpieza;
    }
}