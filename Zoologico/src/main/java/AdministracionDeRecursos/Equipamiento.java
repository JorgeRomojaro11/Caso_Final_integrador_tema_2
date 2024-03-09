package AdministracionDeRecursos;

public class Equipamiento extends Recurso {
    private String descripcion;

    public Equipamiento(String nombre, int cantidad, String proveedor, String descripcion) {
        super(nombre, cantidad, proveedor);
        this.descripcion = descripcion;
    }

    // Getters y setters
}