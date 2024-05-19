package org.algo3.CuentaCorriente;

import org.algo3.Producto.Producto;

import java.time.LocalDate;

public class Compra {
    private final Producto producto;
    private final LocalDate fecha;

    public Compra(Producto unProducto, LocalDate unaFecha) {
        producto = unProducto;
        fecha = unaFecha;
    }

    public double obtenerPrecio() {
        return producto.obtenerPrecio();
    }

    public boolean fechaCoincideEntre(LocalDate inicio, LocalDate fin) {
        return inicio.equals(fecha) || fin.equals(fecha) || fecha.isAfter(inicio) && fecha.isBefore(fin);
    }
}
