package org.algo3.Plataforma;

import org.algo3.Entrada.Entrada;
import org.algo3.Tarjeta.Tarjeta;

import java.util.List;

public class Plataforma {

    public List<Entrada> comprar(Tarjeta tarj, List<Entrada> entradas) {
        return tarj.comprar(entradas);
    }
}
