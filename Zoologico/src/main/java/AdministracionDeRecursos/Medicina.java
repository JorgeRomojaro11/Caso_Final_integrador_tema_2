package AdministracionDeRecursos;

public class Medicina extends Recurso {
    private String uso;

    public Medicina(String nombre, int cantidad, String proveedor, String uso) {
        super(nombre, cantidad, proveedor);
        this.uso = uso;
    }

    // Getters y setters
}
