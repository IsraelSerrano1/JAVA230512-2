package com.softtek.modelo.abstract2;

public class Perro extends Animal {
    @Override
    public String comer() {
        return "Comiendo...";
    }

    @Override
    public String moverse() {
        return "Moviendo...";
    }
}
