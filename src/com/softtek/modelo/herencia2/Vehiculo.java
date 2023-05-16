package com.softtek.modelo.herencia2;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;
    protected int velocidad;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidad = 0;
    }

    public int acelerar(int aumento) {
        this.velocidad += aumento;
        return this.velocidad;
    }

    public int frenar(int descuento) {
        if (this.velocidad - descuento < 0) {
            this.velocidad = 0;
        } else {
            this.velocidad -= descuento;
        }
        return this.velocidad;
    }


    public String mostrarDatos() {
        return  "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", velocidad=" + velocidad ;
    }


}

