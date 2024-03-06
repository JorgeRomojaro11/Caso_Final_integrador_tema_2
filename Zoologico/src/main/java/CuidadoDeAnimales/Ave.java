package CuidadoDeAnimales;

public class Ave extends Animal {
    private boolean vuela;

    public Ave(String nombre, int salud, String alimentacion, boolean vuela) {
        super(nombre, salud, alimentacion);
        this.vuela = vuela;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
}
