package com.softtek.modelo.abstract1;

public class Cactus extends Planta{
    private boolean pinchos;
    public Cactus(String nombre, int altura, int edad, boolean pinchos) {
        super(nombre, altura, edad);
        this.pinchos = pinchos;
    }
    public boolean getPinchos() {
        return pinchos;
    }
    public void setPinchos(boolean pinchos) { }

    @Override
    public void regar(int cantidad, int tiempo) {
        System.out.println("Regando " + nombre + " con " + cantidad + "ml durante " + tiempo + " minutos.");
    }

}
