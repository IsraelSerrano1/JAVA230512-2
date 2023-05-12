package com.softtek.modelo.herencia2;

public class Barco extends Vehiculo {
    private double eslora;

    public Barco(String marca, String modelo, int anio, double eslora) {
        super(marca, modelo, anio);
        this.eslora = eslora;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + ", eslora=" + eslora;
    }
}

