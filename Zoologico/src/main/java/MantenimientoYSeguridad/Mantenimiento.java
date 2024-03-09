package MantenimientoYSeguridad;

import java.util.Date;

public class Mantenimiento extends Tarea {
    private String frecuencia;

    public Mantenimiento(String nombre, String descripcion, Date fechaProgramada, String frecuencia) {
        super(nombre, descripcion, fechaProgramada);
        this.frecuencia = frecuencia;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }
}
