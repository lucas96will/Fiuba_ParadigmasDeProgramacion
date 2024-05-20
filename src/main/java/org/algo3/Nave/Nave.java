package org.algo3.Nave;

import org.algo3.SistemaAtaque.SistemaAtaque;

public interface Nave {
    void atacar(Nave otroCorbeta);

    void recibirAtq(SistemaAtaque unSistemaAtq);

    int puntaje();
}
