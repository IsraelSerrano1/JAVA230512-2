package com.softtek.modelo.herencia2;

public class Coche extends Vehiculo {private int numPuertas;

    public Coche(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + ", numPuertas=" + numPuertas;
    }

}
