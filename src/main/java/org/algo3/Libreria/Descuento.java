package org.algo3.Libreria;

public class Descuento {

    private final double descuento;

    public Descuento(double unDescuento) {
        descuento = unDescuento;
    }

    public Double aplicar(Double unPrecio) {
        return unPrecio * (1 - descuento);
    }

}
