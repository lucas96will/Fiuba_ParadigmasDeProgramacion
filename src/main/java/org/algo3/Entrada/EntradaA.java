package org.algo3.Entrada;

import org.algo3.Tarjeta.Gold;
import org.algo3.Tarjeta.PertenenciaH;

public class EntradaA implements Entrada {

    private final int precio;

    public EntradaA() {
        precio = 600;
    }

    @Override
    public Entrada comprar(Gold tarjeta) {
        tarjeta.actualizarLimite(precio);
        return new EntradaA();
    }

    @Override
    public Entrada comprar(PertenenciaH tarjeta) {
        return new EntradaA();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        return obj instanceof EntradaA;
    }
}
