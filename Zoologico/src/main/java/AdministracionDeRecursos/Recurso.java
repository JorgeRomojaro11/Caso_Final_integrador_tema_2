package AdministracionDeRecursos;

public abstract class Recurso {
    protected String nombre;
    protected int cantidad;
    protected String proveedor;

    public Recurso(String nombre, int cantidad, String proveedor) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }

    // Getters y setters
}
