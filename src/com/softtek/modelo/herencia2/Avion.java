package com.softtek.modelo.herencia2;

public class Avion extends Vehiculo {private int numMotores;

    public Avion(String marca, String modelo, int anio, int numMotores) {
        super(marca, modelo, anio);
        this.numMotores = numMotores;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + ", numMotores=" + numMotores;
    }
}