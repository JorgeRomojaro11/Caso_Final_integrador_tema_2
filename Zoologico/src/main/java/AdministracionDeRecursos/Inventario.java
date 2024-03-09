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

    // Métodos para eliminar y verificar la cantidad de un recurso específico
}