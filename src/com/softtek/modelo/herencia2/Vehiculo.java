package com.softtek.modelo.herencia2;

public class Vehiculo {private String marca;
    private String modelo;
    private int anio;
    private int velocidad;

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

