package com.softtek.modelo.abstract1;

public abstract class Planta {
    protected String nombre;
    protected int altura;
    protected int edad;

    public Planta(String nombre, int altura, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
    }

    public abstract void regar(int cantidad, int tiempo);

    public void crecer() {
        altura += 10;
        edad++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }
}
