package org.algo3.Producto;

import org.algo3.Libreria.Descuento;

public class ArticuloDeLibreria implements Producto {
    private final double IVA = 0.21;
    private double precio;

    public ArticuloDeLibreria(double unPrecio) {
        precio = unPrecio;
    }

    @Override
    public double obtenerPrecio() {
        return precio * (1 + IVA);
    }

    @Override
    public Producto aplicarDescuento(Descuento unDescuento) {
        return new Libro(unDescuento.aplicar(precio));
    }
}
