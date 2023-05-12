package com.softtek.modelo;

public class Figura {
    private int coordenadaX;
    private int coordenadaY;

    public Figura(int x, int y) {
        coordenadaX = x;
        coordenadaY = y;
    }

    public String posicion() {
        return "Posición: (" + coordenadaX + ", " + coordenadaY + ")";
    }
}
