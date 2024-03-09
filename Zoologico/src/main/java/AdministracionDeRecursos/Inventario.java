package AdministracionDeRecursos;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Alimento> alimentos;
    private List<Medicina> medicinas;
    private List<Equipamiento> equipamientos;

    public Inventario() {
        this.alimentos = new ArrayList<>();
        this.medicinas = new ArrayList<>();
        this.equipamientos = new ArrayList<>();
    }

    public void agregarAlimento(Alimento alimento) {
        alimentos.add(alimento);
    }

    public void agregarMedicina(Medicina medicina) {
        medicinas.add(medicina);
    }

    public void agregarEquipamiento(Equipamiento equipamiento) {
        equipamientos.add(equipamiento);
    }

    public void eliminarAlimento(Alimento alimento) {
        alimentos.remove(alimento);
    }

    public void eliminarMedicina(Medicina medicina) {
        medicinas.remove(medicina);
    }

    public void eliminarEquipamiento(Equipamiento equipamiento) {
        equipamientos.remove(equipamiento);
    }

    public int verificarCantidadAlimento(String nombre) {
        int cantidad = 0;
        for (Alimento alimento : alimentos) {
            if (alimento.getNombre().equals(nombre)) {
                cantidad += alimento.getCantidad();
            }
        }
        return cantidad;
    }

    public int verificarCantidadMedicina(String nombre) {
        int cantidad = 0;
        for (Medicina medicina : medicinas) {
            if (medicina.getNombre().equals(nombre)) {
                cantidad += medicina.getCantidad();
            }
        }
        return cantidad;
    }

    public int verificarCantidadEquipamiento(String nombre) {
        int cantidad = 0;
        for (Equipamiento equipamiento : equipamientos) {
            if (equipamiento.getNombre().equals(nombre)) {
                cantidad += equipamiento.getCantidad();
            }
        }
        return cantidad;
    }
}