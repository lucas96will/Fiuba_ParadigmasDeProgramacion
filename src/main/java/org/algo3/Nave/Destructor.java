package org.algo3.Nave;

import org.algo3.SistemaAtaque.SistemaAtaque;
import org.algo3.SistemaDefensa.SistemaDefensa;

public class Destructor implements Nave {
    private SistemaAtaque sisAtq;
    private SistemaDefensa sisDef;

    public Destructor(SistemaAtaque unSisAtq, SistemaDefensa unSisDef) {
        sisAtq = unSisAtq;
        sisDef = unSisDef;
    }

    @Override
    public void atacar(Nave otraNave) {
        otraNave.recibirAtq(sisAtq);
    }

    @Override
    public void recibirAtq(SistemaAtaque unSistemaAtq) {
        sisDef = sisDef.recibirAtq(unSistemaAtq);
    }

    @Override
    public int puntaje() {
        return sisAtq.puntaje() + sisDef.puntaje();
    }
}
