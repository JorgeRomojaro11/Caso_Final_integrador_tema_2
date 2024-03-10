package org.example;

import GestionDeHabitats.*;
import CuidadoDeAnimales.*;
import InteracciónConVisitantes.*;
import AdministracionDeRecursos.*;
import MantenimientoYSeguridad.*;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al zoo. ¿Eres un trabajador o un visitante?");
        System.out.println("1. Trabajador del zoo");
        System.out.println("2. Visitante del zoo");

        int eleccion = scanner.nextInt();

        switch (eleccion) {
            case 1:
                trabajadorDelZoo();
                break;
            case 2:
                visitanteDelZoo();
                break;
            default:
                System.out.println("Lo siento, esa no es una opción válida.");
                break;
        }

        scanner.close();
    }

    public static void trabajadorDelZoo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Has elegido Trabajador del zoo. ¿Qué área te gustaría gestionar?");
        System.out.println("1. Gestion de habitats");
        System.out.println("2. Cuidado de animales");
        System.out.println("3. Administracion de recursos");
        System.out.println("4. Mantenimiento y Seguridad");

        int eleccion = scanner.nextInt();

        switch (eleccion) {
            case 1:
                gestionDeHabitats();
                break;
            case 2:
                cuidadoDeAnimales();
                break;
            case 3:
                administracionDeRecursos();
                break;
            case 4:
                mantenimientoYSeguridad();
                break;
            default:
                System.out.println("Lo siento, esa no es una opción válida.");
                break;
        }

        scanner.close();
    }

    public static void visitanteDelZoo() {
        Quiosco quiosco = new Quiosco();

        HabitatAcuatico acuatico = new HabitatAcuatico(10, 80.0, true, 100);
        habitatTerrestre terrestre = new habitatTerrestre(25.0, 50.0, false, "Árboles con frutos y arbustos con bayas");
        habitatAviario aviario = new habitatAviario(22.0, 60.0, true, 15.0);

        Pez pez = new Pez("Congrio", 60, "Algas y peces pequeños", "Salada");
        Ave ave = new Ave("Quebrantahuesos", 80, "Carne", true);
        Mamifero mamifero = new Mamifero("Ciervos", 90, "Vegetales", "Corto");

        Tour tourParaNinos = new TourParaNiños(acuatico, pez);
        Tour tourParaAficionadosAves = new TourParaAficionadosAves(aviario, ave);
        Tour tourParaAficionadosPeces = new TourParaAficionadosPeces(acuatico, pez);
        Tour tourParaAficionadosMamiferos = new TourParaAficionadosMamíferos(terrestre, mamifero);

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué tipo de tour te gustaría hacer? (1: Tour para niños, 2: Tour para aficionados a las aves, 3: Tour para aficionados a los peces, 4: Tour para aficionados a los mamíferos)");
        int eleccionTour = scanner.nextInt();

        switch (eleccionTour) {
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

    public static void gestionDeHabitats() {
        // Instancias y métodos de GestionDeHabitats
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

    public static void cuidadoDeAnimales() {
        // Instancias y métodos de CuidadoDeAnimales
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

    public static void administracionDeRecursos() {
        // Crear instancias de Alimento, Medicina y Equipamiento
        Alimento alimento = new Alimento("Manzanas", 100, "Frutas Martinez", "Frutas");
        Medicina medicina = new Medicina("Antibioticos", 50, "Farmaceutica SB", "Para infecciones");
        Equipamiento equipamiento = new Equipamiento("Jaulas", 10, "Proteccion ASD", "Jaulas para ciervos");

        // Crear una instancia de Inventario
        Inventario inventario = new Inventario();

        // Agregar los recursos al inventario
        inventario.agregarAlimento(alimento);
        inventario.agregarMedicina(medicina);
        inventario.agregarEquipamiento(equipamiento);

        // Verificar la cantidad de un recurso específico
        int cantidadAlimento = inventario.verificarCantidadAlimento("Manzanas");
        System.out.println("Cantidad de Manzanas: " + cantidadAlimento);

        int cantidadMedicina = inventario.verificarCantidadMedicina("Antibioticos");
        System.out.println("Cantidad de Antibioticos: " + cantidadMedicina);

        int cantidadEquipamiento = inventario.verificarCantidadEquipamiento("Jaulas");
        System.out.println("Cantidad de Jaulas: " + cantidadEquipamiento);

        // Eliminar un recurso del inventario
        inventario.eliminarAlimento(alimento);
        inventario.eliminarMedicina(medicina);
        inventario.eliminarEquipamiento(equipamiento);
    }

    public static void mantenimientoYSeguridad() {
        // Crear una tarea de mantenimiento
        Mantenimiento mantenimiento = new Mantenimiento("Limpieza de jaulas", "Limpieza de jaulas de leones", new Date(), "Semanal");

        // Crear una tarea de reparación urgente
        ReparacionUrgente reparacionUrgente = new ReparacionUrgente("Reparación de cerca", "Reparación de cerca de acuario de congrios", new Date(), "Alta");

        // Crear un sistema de mantenimiento y agregar las tareas
        tareasMantenimieno sistemaMantenimiento = new tareasMantenimieno();
        sistemaMantenimiento.agregarTareaMantenimiento(mantenimiento);
        sistemaMantenimiento.agregarTareaReparacionUrgente(reparacionUrgente);

        // Crear dispositivos de seguridad
        Camara camara = new Camara("Entrada principal", "1080p");
        SensorMovimiento sensorMovimiento = new SensorMovimiento("Jaula de ciervos", 2);

        // Crear un sistema de seguridad y agregar los dispositivos
        SistemaSeguridad sistemaSeguridad = new SistemaSeguridad();
        sistemaSeguridad.agregarCamara(camara);
        sistemaSeguridad.agregarSensorMovimiento(sensorMovimiento);

        // Crear un sistema de mantenimiento y agregar las tareas
        sistemaMantenimiento = new tareasMantenimieno();
        sistemaMantenimiento.agregarTareaMantenimiento(mantenimiento);
        sistemaMantenimiento.agregarTareaReparacionUrgente(reparacionUrgente);

        System.out.println("Tareas de mantenimiento y reparación urgente agregadas correctamente.");
        System.out.println("Cámara y sensor de movimiento agregados correctamente.");
        System.out.println("Ubicación de la cámara: " + camara.getUbicacion());
        System.out.println("Resolución de la cámara: " + camara.getResolucion());
        System.out.println("Ubicación del sensor de movimiento: " + sensorMovimiento.getUbicacion());
        System.out.println("Sensibilidad del sensor de movimiento: " + sensorMovimiento.getSensibilidad());
    }
}



