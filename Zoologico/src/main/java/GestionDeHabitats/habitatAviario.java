package GestionDeHabitats;

public class habitatAviario extends Habitat {
    private double altura;

    public habitatAviario(double temperatura, double humedad, boolean limpieza, double altura) {
        super(temperatura, humedad, limpieza);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
