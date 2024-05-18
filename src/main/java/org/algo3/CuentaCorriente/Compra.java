package org.algo3.CuentaCorriente;

import org.algo3.Producto.Producto;

public class Compra {
    private final Producto producto;
    private final String fecha;

    public Compra(Producto unProducto, String unaFecha) {
        producto = unProducto;
        fecha = unaFecha;
    }

    public double obtenerPrecio(String unaFecha) {
        if (!unaFecha.equals(fecha)) {
            return 0;
        }
        return producto.obtenerPrecio();
    }
}
