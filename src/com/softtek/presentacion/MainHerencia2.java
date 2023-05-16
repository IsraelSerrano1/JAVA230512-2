package com.softtek.presentacion;

import com.softtek.modelo.herencia2.*;

public class MainHerencia2 {
    public static void main(String[] args) {
        Vehiculo coche = new Coche("Renault", "Fuego", 1985, 5);
        Vehiculo barco = new Barco("Galeón", "390", 2016,11.76);
        Vehiculo avion = new Avion("Airbus", "A320", 2020,4);
        Vehiculo tren = new Tren("Renfe", "Talgo", 1975, 6);

        // Llamar a métodos de cada objeto

        System.out.println("La velocidad del coche es de: " + coche.acelerar(50));
        System.out.println("La velocidad del coche es de: " + coche.frenar(20));
        System.out.println(coche.mostrarDatos());
        System.out.println("\n");

        System.out.println("La velocidad del Barco es de: " + barco.acelerar(100));
        System.out.println("La velocidad del Barco es de: " + barco.frenar(50));
        System.out.println(barco.mostrarDatos());
        System.out.println("\n");

        System.out.println("La velocidad del Avion es de: " + avion.acelerar(2000));
        System.out.println("La velocidad del Avion es de: " + avion.frenar(500));
        System.out.println(avion.mostrarDatos());
        System.out.println("\n");

        System.out.println("La velocidad del tren es de: " + tren.acelerar(180));
        System.out.println("La velocidad del tren es de: " + tren.frenar(25));
        System.out.println(tren.mostrarDatos());
    }
}
