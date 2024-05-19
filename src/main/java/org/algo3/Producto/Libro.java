package org.algo3.Producto;

import org.algo3.Libreria.Descuento;

public class Libro implements Producto {

    private final double precio;

    public Libro(double unPrecio) {
        precio = unPrecio;
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public Producto aplicarDescuento(Descuento unDescuento) {
        return new Libro(unDescuento.aplicar(precio));
    }


}
