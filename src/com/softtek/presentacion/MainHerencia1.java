package com.softtek.presentacion;

import com.softtek.modelo.herencia1.Circulo;
import com.softtek.modelo.herencia1.Figura;
import com.softtek.modelo.herencia1.Rectangulo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MainHerencia1 {
    public static void main(String[] args) {
        Figura figura = new Figura(3, 4);
        System.out.println("Posición de la figura: " + figura.posicion());

        Circulo circulo = new Circulo(5, 7, 2.5);
        System.out.println("Posición del círculo: " + circulo.posicion());

        Rectangulo rectangulo = new Rectangulo(1, 2, 4.0, 5.0);
        System.out.println("Posición del rectángulo: " + rectangulo.posicion());
    }
}
