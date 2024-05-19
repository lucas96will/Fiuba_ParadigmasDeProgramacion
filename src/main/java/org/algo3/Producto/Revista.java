package org.algo3.Producto;

import org.algo3.Libreria.Descuento;

public class Revista implements Producto {

    private final int periocidad;
    private final int meses;
    private double precioBase;

    public Revista(double unPrecio, int unaPeriocidad, int unaDuracionEnMeses) {
        precioBase = unPrecio;
        periocidad = unaPeriocidad;
        meses = unaDuracionEnMeses;
    }

    @Override
    public double obtenerPrecio() {
        if (meses >= 12) {
            return precioBase * meses * periocidad * 0.8;
        }
        return precioBase * meses * periocidad;
    }

    @Override
    public Producto aplicarDescuento(Descuento unDescuento) {
        if (meses >= 12) {
            return this;
        }
        return new Revista(unDescuento.aplicar(precioBase), periocidad, meses);
    }

}
