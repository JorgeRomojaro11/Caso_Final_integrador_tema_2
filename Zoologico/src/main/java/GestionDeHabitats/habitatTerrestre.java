package GestionDeHabitats;

public class habitatTerrestre extends Habitat {
    private String vegetacion;

    public habitatTerrestre(double temperatura, double humedad, boolean limpieza, String vegetacion) {
        super(temperatura, humedad, limpieza);
        this.vegetacion = vegetacion;
    }

    public String getVegetacion() {
        return vegetacion;
    }

    public void setVegetacion(String vegetacion) {
        this.vegetacion = vegetacion;
    }
}
