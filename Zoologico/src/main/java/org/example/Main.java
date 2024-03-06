package org.example;

import GestionDeHabitats.*;

public class Main {
    public static void main(String[] args) {
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
    }
}


