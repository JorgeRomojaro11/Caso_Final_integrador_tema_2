package InteracciónConVisitantes;

import GestionDeHabitats.Habitat;
import CuidadoDeAnimales.Animal;

public class TourParaAficionadosMamíferos extends Tour {
    public TourParaAficionadosMamíferos(Habitat habitat, Animal animal) {
        super(habitat, animal);
    }

    @Override
    public void realizarTour() {
        super.realizarTour();
        System.out.println("¡Este es un tour para aficionados a los mamíferos!");
    }
}
