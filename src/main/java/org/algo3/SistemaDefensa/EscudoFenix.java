package org.algo3.SistemaDefensa;

import org.algo3.SistemaAtaque.SistemaAtaque;

public class EscudoFenix implements SistemaDefensa {
    private int puntos;

    public EscudoFenix(int puntosDef) {
        puntos = puntosDef;
    }

    @Override
    public SistemaDefensa recibirAtq(SistemaAtaque sisAtq) {
        puntos = sisAtq.realizarAtq(puntos);
        if (puntos <= 0) {
            return new EscudoSimple(30);
        }
        return this;
    }

    @Override
    public int puntaje() {
        return puntos;
    }
}
