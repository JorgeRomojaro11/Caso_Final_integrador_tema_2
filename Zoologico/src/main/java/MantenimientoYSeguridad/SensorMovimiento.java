package MantenimientoYSeguridad;

public class SensorMovimiento extends DispositivoSeguridad {
    private int sensibilidad;

    public SensorMovimiento(String ubicacion, int sensibilidad) {
        super(ubicacion);
        this.sensibilidad = sensibilidad;
    }

    public int getSensibilidad() {
        return sensibilidad;
    }

    public void setSensibilidad(int sensibilidad) {
        this.sensibilidad = sensibilidad;
    }
}