package com.softtek.presentacion;

import com.softtek.modelo.abstract1.Cactus;
import com.softtek.modelo.abstract1.Planta;
import com.softtek.modelo.abstract1.Planta_Tropical;

public class MainAbstract1 {
    public static void main(String[] args) {
        Planta planta1 = new Planta_Tropical("Ave del paraíso blanca", 50, 2);
        Planta planta2 = new Cactus("Cactus san pedro", 20, 3, 500);

        planta1.regar(500, 10);
        planta2.regar(100, 5);
    }
}
