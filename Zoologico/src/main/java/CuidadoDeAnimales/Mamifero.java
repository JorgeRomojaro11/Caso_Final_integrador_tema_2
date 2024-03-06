package CuidadoDeAnimales;

public class Mamifero extends Animal {
    private String tipoPelaje;

    public Mamifero(String nombre, int salud, String alimentacion, String tipoPelaje) {
        super(nombre, salud, alimentacion);
        this.tipoPelaje = tipoPelaje;
    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }
}
