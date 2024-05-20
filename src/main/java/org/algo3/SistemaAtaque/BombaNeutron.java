package org.algo3.SistemaAtaque;

public class BombaNeutron implements SistemaAtaque {
    private int cantidad;
    private int cantidadGastada;

    public BombaNeutron(int unaCantidad) {
        cantidad = unaCantidad;
        cantidadGastada = 0;
    }

    @Override
    public int realizarAtq(int puntosDeDefensa) {
        if (cantidad <= 0) {
            return puntosDeDefensa;
        }
        cantidadGastada++;
        cantidad--;
        return puntosDeDefensa - 5;
    }

    @Override
    public int puntaje() {
        return cantidad * 5;
    }

    public int calcularPuntosTorreta() {
        return cantidadGastada == 0 ? 100 : -cantidadGastada * 10;
    }
}
