package MantenimientoYSeguridad;

public class Camara extends DispositivoSeguridad {
    private String resolucion;

    public Camara(String ubicacion, String resolucion) {
        super(ubicacion);
        this.resolucion = resolucion;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
}
