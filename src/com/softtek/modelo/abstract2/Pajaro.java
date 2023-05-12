package com.softtek.modelo.abstract2;

public class Pajaro extends Animal {
    @Override
    public String comer() {
        return "Comiendo...";
    }

    @Override
    public String moverse() {
        return "Moviendo...";
    }
}
