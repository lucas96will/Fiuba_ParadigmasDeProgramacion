package org.algo3.SistemaAtaque;

public class TorretaIonica implements SistemaAtaque {
    private BombaNeutron bomba;

    public TorretaIonica(BombaNeutron unaBomba) {
        bomba = unaBomba;
    }

    @Override
    public int realizarAtq(int puntosDeDefensa) {
        return puntosDeDefensa;
    }

    @Override
    public int puntaje() {
        return bomba.calcularPuntosTorreta();
    }
}
