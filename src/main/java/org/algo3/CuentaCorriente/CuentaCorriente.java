package org.algo3.CuentaCorriente;

import org.algo3.Producto.Producto;

import java.util.ArrayList;
import java.util.List;

public class CuentaCorriente {

    private List<Compra> compras;

    public CuentaCorriente() {
        compras = new ArrayList<Compra>();
    }

    public void comprar(Producto unProducto, String fecha) {
        compras.add(new Compra(unProducto, fecha));
    }

    public double obtenerGasto(String unaFecha) {
        double sum = 0;
        for (Compra c : compras) {
            sum += c.obtenerPrecio(unaFecha);
        }
        return sum;
    }
}
