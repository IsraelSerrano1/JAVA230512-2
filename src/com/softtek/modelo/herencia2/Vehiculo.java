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

    public int acelerar(int incremento) {
        this.velocidad += incremento;
        return this.velocidad;
    }

    public int frenar(int decremento) {
        if (this.velocidad - decremento < 0) {
            this.velocidad = 0;
        } else {
            this.velocidad -= decremento;
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

