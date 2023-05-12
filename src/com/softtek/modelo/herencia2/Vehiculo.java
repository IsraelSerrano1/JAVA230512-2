package com.softtek.modelo.herencia2;

public class Vehiculos {
    private String modelo;
    private String marca;
    private int anio;
    private double precio;

    public Vehiculos(String modelo, String marca, int anio, double precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.anio = anio;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void arrancar() {
        System.out.println("El vehículo ha arrancado");
    }

    public void detener() {
        System.out.println("El vehículo se ha detenido");
    }
}
