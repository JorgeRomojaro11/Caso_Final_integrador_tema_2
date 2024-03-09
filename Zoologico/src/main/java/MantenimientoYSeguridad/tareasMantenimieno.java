package MantenimientoYSeguridad;

import java.util.ArrayList;
import java.util.List;

public class tareasMantenimieno {
    private List<Mantenimiento> tareasMantenimiento;
    private List<ReparacionUrgente> tareasReparacionUrgente;

    public tareasMantenimieno() {
        this.tareasMantenimiento = new ArrayList<>();
        this.tareasReparacionUrgente = new ArrayList<>();
    }

    public void agregarTareaMantenimiento(Mantenimiento mantenimiento) {
        this.tareasMantenimiento.add(mantenimiento);
    }

    public void agregarTareaReparacionUrgente(ReparacionUrgente reparacionUrgente) {
        this.tareasReparacionUrgente.add(reparacionUrgente);
    }
}
