package org.algo3.SistemaDefensa;

import org.algo3.SistemaAtaque.SistemaAtaque;

public class EscudoIonico implements SistemaDefensa {
    private SistemaAtaque bomba;
    private SistemaAtaque torreta;

    public EscudoIonico(SistemaAtaque unaBomba, SistemaAtaque unaTorreta) {
        bomba = unaBomba;
        torreta = unaTorreta;
    }

    @Override
    public SistemaDefensa recibirAtq(SistemaAtaque sisAtq) {
        return this;
    }

    @Override
    public int puntaje() {
        return 2 * (bomba.puntaje() + torreta.puntaje());
    }
}
