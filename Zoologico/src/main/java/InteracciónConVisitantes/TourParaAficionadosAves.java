package InteracciónConVisitantes;

import GestionDeHabitats.Habitat;
import CuidadoDeAnimales.Animal;

public class TourParaAficionadosAves extends Tour {
    public TourParaAficionadosAves(Habitat habitat, Animal animal) {
        super(habitat, animal);
    }

    @Override
    public void realizarTour() {
        super.realizarTour();
        System.out.println("¡Este es un tour para aficionados a las aves!");
    }
}
