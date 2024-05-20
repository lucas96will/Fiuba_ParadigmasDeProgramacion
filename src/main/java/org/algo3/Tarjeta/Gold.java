package org.algo3.Tarjeta;

import org.algo3.Entrada.Entrada;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Gold implements Tarjeta {
    private int limite;

    @Override
    public List<Entrada> comprar(List<Entrada> entradas) {
        limite = 1000;
        List<Entrada> entradasConseguidas = new ArrayList<>();

        for (Entrada e : entradas) {
            Entrada entradaComprada = e.comprar(this);
            if (limite >= 0) {
                entradasConseguidas.add(entradaComprada);
            }
        }
        entradasConseguidas = eliminarEntradasNoPagadas(entradasConseguidas);
        return entradasConseguidas;
    }

    private List<Entrada> eliminarEntradasNoPagadas(List<Entrada> entradasConseguidas) {
        return entradasConseguidas.stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public void actualizarLimite(int precio) {
        limite -= precio;
    }


}
