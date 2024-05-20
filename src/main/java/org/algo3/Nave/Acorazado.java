package org.algo3.Nave;

import org.algo3.SistemaAtaque.SistemaAtaque;
import org.algo3.SistemaDefensa.SistemaDefensa;

public class Acorazado implements Nave {
    private SistemaAtaque bomba;
    private SistemaAtaque torreta;
    private SistemaDefensa escudo;

    public Acorazado(SistemaAtaque unaBomba, SistemaAtaque unaTorreta, SistemaDefensa unEscudoIonico) {
        bomba = unaBomba;
        torreta = unaTorreta;
        escudo = unEscudoIonico;
    }

    @Override
    public void atacar(Nave otraNave) {
        otraNave.recibirAtq(bomba);
        otraNave.recibirAtq(torreta);
    }

    @Override
    public void recibirAtq(SistemaAtaque unSistemaAtq) {
        escudo = escudo.recibirAtq(unSistemaAtq);
    }

    @Override
    public int puntaje() {
        return bomba.puntaje() + torreta.puntaje() + escudo.puntaje();
    }
}
