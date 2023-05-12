package com.softtek.modelo.abstract1;

public class Planta_Tropical extends Planta{
    public Planta_Tropical(String nombre, int altura, int edad) {
        super(nombre, altura, edad);
    }

    @Override
    public void regar(int cantidad, int tiempo) {
        System.out.println("Regando " + nombre + " con " + cantidad + "ml durante " + tiempo + " minutos.");
    }
}
