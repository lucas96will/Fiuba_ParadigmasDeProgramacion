package org.algo3.Libreria;

import org.algo3.Producto.Producto;

public class DescuentoClienteRegistrado {
    public static Producto aplicar(Producto unProducto) {
        return unProducto.aplicarDescuentoRegistrado(0.95);
    }

}
