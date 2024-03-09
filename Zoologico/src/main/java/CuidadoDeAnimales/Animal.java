package CuidadoDeAnimales;

public class Animal {
    protected String nombre;
    protected int salud;
    protected String alimentacion;

    public Animal(String nombre, int salud, String alimentacion) {
        this.nombre = nombre;
        this.salud = salud;
        this.alimentacion = alimentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getInfo() {
        return "Nombre: " + nombre + ", Salud: " + salud + ", Alimentación: " + alimentacion;
    }
}