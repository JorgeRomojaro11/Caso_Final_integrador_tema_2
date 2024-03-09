package MantenimientoYSeguridad;

import java.util.Date;

public class ReparacionUrgente extends Tarea {
    private String prioridad;

    public ReparacionUrgente(String nombre, String descripcion, Date fechaProgramada, String prioridad) {
        super(nombre, descripcion, fechaProgramada);
        this.prioridad = prioridad;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
}
