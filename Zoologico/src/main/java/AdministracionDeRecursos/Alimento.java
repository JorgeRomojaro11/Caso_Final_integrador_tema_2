package AdministracionDeRecursos;

public class Alimento extends Recurso {
    private String tipo;

    public Alimento(String nombre, int cantidad, String proveedor, String tipo) {
        super(nombre, cantidad, proveedor);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}