package org.algo3.SistemaDefensa;

import org.algo3.SistemaAtaque.SistemaAtaque;

public interface SistemaDefensa {
    SistemaDefensa recibirAtq(SistemaAtaque sisAtq);

    int puntaje();
}
