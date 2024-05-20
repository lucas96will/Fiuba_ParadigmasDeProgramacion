package org.algo3.Tarjeta;

import org.algo3.Entrada.Entrada;

import java.util.List;

public interface Tarjeta {
    List<Entrada> comprar(List<Entrada> entradas);

    void actualizarLimite(int precio);
}
