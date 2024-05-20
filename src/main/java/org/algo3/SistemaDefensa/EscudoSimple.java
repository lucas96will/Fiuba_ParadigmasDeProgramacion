package org.algo3.SistemaDefensa;

import org.algo3.SistemaAtaque.SistemaAtaque;

public class EscudoSimple implements SistemaDefensa {
    private int puntos;

    public EscudoSimple(int puntosDefensa) {
        puntos = puntosDefensa;
    }

    @Override
    public SistemaDefensa recibirAtq(SistemaAtaque sisAtq) {
        return new EscudoSimple(sisAtq.realizarAtq(puntos));
    }

    @Override
    public int puntaje() {
        return puntos;
    }
}
