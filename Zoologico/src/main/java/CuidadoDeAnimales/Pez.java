package CuidadoDeAnimales;

public class Pez extends Animal {
    private String tipoAgua;

    public Pez(String nombre, int salud, String alimentacion, String tipoAgua) {
        super(nombre, salud, alimentacion);
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
}