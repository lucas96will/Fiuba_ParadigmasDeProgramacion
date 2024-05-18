package org.algo3.Producto;

public interface Producto {
    double obtenerPrecio();

    Producto aplicarDescuentoRegistrado(double descuento);
}
