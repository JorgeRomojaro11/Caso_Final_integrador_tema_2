package GestionDeHabitats;

public class HabitatAcuatico extends Habitat {
    private int capacidad;

    public HabitatAcuatico(double temperatura, double humedad, boolean limpieza, int capacidad) {
        super(temperatura, humedad, limpieza);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
