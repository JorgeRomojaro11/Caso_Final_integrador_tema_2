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

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public boolean isLimpieza() {
        return limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }
    public String getInfo() {
        return "Temperatura: " + temperatura + ", Humedad: " + humedad + ", Limpieza: " + (limpieza ? "Sí" : "No");
    }


}