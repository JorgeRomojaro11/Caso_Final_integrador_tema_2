package InteracciónConVisitantes;

import GestionDeHabitats.Habitat;
import CuidadoDeAnimales.Animal;

public class TourParaAficionadosPeces extends Tour {
    public TourParaAficionadosPeces(Habitat habitat, Animal animal) {
        super(habitat, animal);
    }

    @Override
    public void realizarTour() {
        super.realizarTour();
        System.out.println("¡Este es un tour para aficionados a los peces!");
    }
}