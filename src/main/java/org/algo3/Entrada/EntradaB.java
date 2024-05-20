package org.algo3.Entrada;

import org.algo3.Tarjeta.Gold;
import org.algo3.Tarjeta.PertenenciaH;

public class EntradaB implements Entrada {
    private final int precio;

    public EntradaB() {
        precio = 5000;
    }

    @Override
    public Entrada comprar(Gold tarjeta) {
        return null;
    }

    @Override
    public Entrada comprar(PertenenciaH tarjeta) {
        return new EntradaB();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        return obj instanceof EntradaB;
    }
}
