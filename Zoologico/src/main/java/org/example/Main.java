package org.example;

import GestionDeHabitats.*;
import CuidadoDeAnimales.*;
import InteracciónConVisitantes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancias y métodos de GestionDeHabitats
        HabitatAcuatico acuatico = new HabitatAcuatico(20.5, 80.0, true, 100);
        habitatTerrestre terrestre = new habitatTerrestre(25.0, 50.0, false, "Árboles con frutos y arbustos con bayas");
        habitatAviario aviario = new habitatAviario(22.0, 60.0, true, 15.0);

        System.out.println("Temperatura del hábitat acuático: " + acuatico.getTemperatura());
        System.out.println("Capacidad del hábitat acuático: " + acuatico.getCapacidad());
        System.out.println("Limpieza del hábitat acuático: " + acuatico.isLimpieza());
        System.out.println("Humedad del hábitat acuático: " + acuatico.getHumedad());

        System.out.println("Temperatura del hábitat terrestre: " + terrestre.getTemperatura());
        System.out.println("Humedad del hábitat terrestre: " + terrestre.getHumedad());
        System.out.println("Vegetación del hábitat terrestre: " + terrestre.getVegetacion());
        System.out.println("Limpieza del hábitat terrestre: " + terrestre.isLimpieza());

        System.out.println("Limpieza del hábitat aviario: " + aviario.isLimpieza());
        System.out.println("Altura del hábitat aviario: " + aviario.getAltura());
        System.out.println("Humedad del hábitat aviario: " + aviario.getHumedad());
        System.out.println("Temperatura del hábitat aviario: " + aviario.getTemperatura());

        // Instancias y métodos de CuidadoDeAnimales
        Pez pez = new Pez("Congrio", 60, "Algas y peces pequeños", "Salada");
        Ave ave = new Ave("Quebrantahuesos", 100, "Carne", true);
        Mamifero mamifero = new Mamifero("Canguro", 90, "Vegetales", "Corto");

        System.out.println("Nombre del pez: " + pez.getNombre());
        System.out.println("Tipo de agua del pez: " + pez.getTipoAgua());
        System.out.println("Salud del pez: " + pez.getSalud());
        System.out.println("Alimentación del pez: " + pez.getAlimentacion());

        System.out.println("Nombre del ave: " + ave.getNombre());
        System.out.println("El ave vuela: " + ave.isVuela());
        System.out.println("Salud del ave: " + ave.getSalud());
        System.out.println("Alimentación del ave: " + ave.getAlimentacion());

        System.out.println("Nombre del mamífero: " + mamifero.getNombre());
        System.out.println("Tipo de pelaje del mamífero: " + mamifero.getTipoPelaje());
        System.out.println("Salud del mamífero: " + mamifero.getSalud());
        System.out.println("Alimentación del mamífero: " + mamifero.getAlimentacion());

        Quiosco quiosco = new Quiosco();

        Tour tourParaNinos = new TourParaNiños();
        Tour tourParaAficionadosAves = new TourParaAficionadosAves();
        Tour tourParaAficionadosPeces = new TourParaAficionadosPeces();
        Tour tourParaAficionadosMamiferos = new TourParaAficionadosMamíferos();

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué tipo de tour te gustaría hacer? (1: Tour para niños, 2: Tour para aficionados a las aves, 3: Tour para aficionados a los peces, 4: Tour para aficionados a los mamíferos,)");
        int eleccion = scanner.nextInt();

        switch (eleccion) {
            case 1:
                quiosco.proporcionarInformacion(tourParaNinos);
                break;
            case 2:
                quiosco.proporcionarInformacion(tourParaAficionadosAves);
                break;
            case 3:
                quiosco.proporcionarInformacion(tourParaAficionadosPeces);
                break;
            case 4:
                quiosco.proporcionarInformacion(tourParaAficionadosMamiferos);
                break;
            default:
                System.out.println("Lo siento, esa no es una opción válida.");
                break;
        }

        scanner.close();




    }
}


