package org.algo3.Producto;

import org.algo3.Libreria.Descuento;

public interface Producto {
    double obtenerPrecio();

    Producto aplicarDescuento(Descuento unDescuento);
}
