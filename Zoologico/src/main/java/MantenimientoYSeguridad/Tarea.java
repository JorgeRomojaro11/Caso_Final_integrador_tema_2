package MantenimientoYSeguridad;

import java.util.Date;

public abstract class Tarea {
    protected String nombre;
    protected String descripcion;
    protected Date fechaProgramada;
    protected String estado;

    public Tarea(String nombre, String descripcion, Date fechaProgramada) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaProgramada = fechaProgramada;
        this.estado = "Pendiente";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(Date fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}