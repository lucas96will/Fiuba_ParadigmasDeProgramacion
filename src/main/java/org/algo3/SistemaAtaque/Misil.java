package org.algo3.SistemaAtaque;

public class Misil implements SistemaAtaque {
    private int cantidad;

    public Misil(int unaCantidad) {
        cantidad = unaCantidad;
    }

    @Override
    public int realizarAtq(int puntosDeDefensa) {
        if (cantidad <= 0) {
            return puntosDeDefensa;
        }
        cantidad--;
        return puntosDeDefensa - 10;
    }

    @Override
    public int puntaje() {
        return cantidad * 10;
    }
}
