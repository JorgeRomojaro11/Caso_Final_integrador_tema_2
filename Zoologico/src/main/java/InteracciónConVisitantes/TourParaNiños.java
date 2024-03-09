package InteracciónConVisitantes;

import GestionDeHabitats.Habitat;
import CuidadoDeAnimales.Animal;

public class TourParaNiños extends Tour {
    public TourParaNiños(Habitat habitat, Animal animal) {
        super(habitat, animal);
    }

    @Override
    public void realizarTour() {
        super.realizarTour();
        System.out.println("¡Este es un tour completo para niños!");
    }
}