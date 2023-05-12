package com.softtek.modelo.abstract1;

public class Cactus extends Planta{
    private int pinchos;
    public Cactus(String nombre, int altura, int edad, int pinchos) {
        super(nombre, altura, edad);
        this.pinchos = pinchos;
    }

    @Override
    public void regar(int cantidad, int tiempo) {
        System.out.println("Regando " + nombre + " con " + cantidad + "ml durante " + tiempo + " minutos.");
    }

}
