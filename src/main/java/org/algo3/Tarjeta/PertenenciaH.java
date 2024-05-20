package org.algo3.Tarjeta;

import org.algo3.Entrada.Entrada;

import java.util.ArrayList;
import java.util.List;

public class PertenenciaH implements Tarjeta {
    @Override
    public List<Entrada> comprar(List<Entrada> entradas) {

        List<Entrada> entradasCompradas = new ArrayList<>();

        for (Entrada e : entradas) {
            entradasCompradas.add(e.comprar(this));
        }

        return entradasCompradas;
    }

    @Override
    public void actualizarLimite(int precio) {
    }


}
