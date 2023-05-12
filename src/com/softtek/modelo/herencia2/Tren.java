package com.softtek.modelo.herencia2;

public class Tren extends Vehiculo {
    private int numVagones;

    public Tren(String marca, String modelo, int anio, int numVagones) {
        super(marca, modelo, anio);
        this.numVagones = numVagones;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + ", numVagones=" + numVagones;
    }
}
