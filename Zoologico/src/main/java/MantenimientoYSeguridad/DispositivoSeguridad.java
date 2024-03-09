package MantenimientoYSeguridad;

public abstract class DispositivoSeguridad {
    protected String ubicacion;
    protected boolean estado;

    public DispositivoSeguridad(String ubicacion) {
        this.ubicacion = ubicacion;
        this.estado = false;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
