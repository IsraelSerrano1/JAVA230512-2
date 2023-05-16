package com.softtek.modelo.abstract2;

public abstract class Animal {
    private int numeroPatas;
    private String tipo;
    public Animal(int numeroPatas, String tipo) {
        this.numeroPatas = numeroPatas;
        this.tipo = tipo;
    }
    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract String comer();
    public abstract String moverse();
}
