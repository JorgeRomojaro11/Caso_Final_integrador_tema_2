package MantenimientoYSeguridad;

import java.util.ArrayList;
import java.util.List;

public class SistemaSeguridad {
    private List<Camara> camaras;
    private List<SensorMovimiento> sensoresMovimiento;

    public SistemaSeguridad() {
        this.camaras = new ArrayList<>();
        this.sensoresMovimiento = new ArrayList<>();
    }

    public void agregarCamara(Camara camara) {
        this.camaras.add(camara);
    }

    public void agregarSensorMovimiento(SensorMovimiento sensorMovimiento) {
        this.sensoresMovimiento.add(sensorMovimiento);
    }
}