package InteracciónConVisitantes;

import GestionDeHabitats.Habitat;
import CuidadoDeAnimales.Animal;

public abstract class Tour {
    protected Habitat habitat;
    protected Animal animal;

    public Tour(Habitat habitat, Animal animal) {
        this.habitat = habitat;
        this.animal = animal;
    }

    public void realizarTour() {
        System.out.println("Información del hábitat:");
        System.out.println(habitat.getInfo());
        System.out.println("Información del animal:");
        System.out.println(animal.getInfo());
    }
}