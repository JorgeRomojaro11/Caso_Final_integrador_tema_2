package org.example;

import GestionDeHabitats.*;
import CuidadoDeAnimales.*;
import InteracciónConVisitantes.*;
import AdministracionDeRecursos.*;
import MantenimientoYSeguridad.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void GestionDeHabitats() {
        HabitatAcuatico acuatico = new HabitatAcuatico(10, 80.0, true, 100);
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
    }
    @Test
    void CuidadoDeAnimales() {
        Pez pez = new Pez("Congrio", 60, "Algas y peces pequeños", "Salada");
        Ave ave = new Ave("Quebrantahuesos", 80, "Carne", true);
        Mamifero mamifero = new Mamifero("Ciervos", 90, "Vegetales", "Corto");

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
    }
    @Test
    void InteracciónConVisitantes() {
        HabitatAcuatico acuatico = new HabitatAcuatico(10, 80.0, true, 100);
        habitatTerrestre terrestre = new habitatTerrestre(25.0, 50.0, false, "Árboles con frutos y arbustos con bayas");
        habitatAviario aviario = new habitatAviario(22.0, 60.0, true, 15.0);

        Pez pez = new Pez("Congrio", 60, "Algas y peces pequeños", "Salada");
        Ave ave = new Ave("Quebrantahuesos", 80, "Carne", true);
        Mamifero mamifero = new Mamifero("Ciervos", 90, "Vegetales", "Corto");
        Quiosco quiosco = new Quiosco();

        Tour tourParaNinos = new TourParaNiños(acuatico, pez);
        Tour tourParaAficionadosAves = new TourParaAficionadosAves(aviario, ave);
        Tour tourParaAficionadosPeces = new TourParaAficionadosPeces(acuatico, pez);
        Tour tourParaAficionadosMamiferos = new TourParaAficionadosMamíferos(terrestre, mamifero);
        System.out.println("1. Tour para niños");
        switch (1) {
            case 1:
                quiosco.proporcionarInformacion(tourParaNinos);
                break;
        }
        System.out.println("2. Tour para aficionados a aves");
        switch (2) {
            case 2:
                quiosco.proporcionarInformacion(tourParaAficionadosAves);
                break;
        }
        System.out.println("3. Tour para aficionados a peces");
        switch (3) {
            case 3:
                quiosco.proporcionarInformacion(tourParaAficionadosPeces);
                break;
        }
        System.out.println("4. Tour para aficionados a mamíferos");
        switch (4) {
            case 4:
                quiosco.proporcionarInformacion(tourParaAficionadosMamiferos);
                break;
        }
    }
}
