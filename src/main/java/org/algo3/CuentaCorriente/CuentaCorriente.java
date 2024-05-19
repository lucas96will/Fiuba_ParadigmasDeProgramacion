package org.algo3.CuentaCorriente;

import org.algo3.Producto.Producto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CuentaCorriente {

    private List<Compra> compras;

    public CuentaCorriente() {
        compras = new ArrayList<Compra>();
    }

    public void comprar(Producto unProducto, LocalDate fecha) {
        compras.add(new Compra(unProducto, fecha));
    }

    public double obtenerGastoEntreFechas(LocalDate inicio, LocalDate fin) {
        double sum = 0;
        for (Compra c : compras) {
            if (c.fechaCoincideEntre(inicio, fin)) {
                sum += c.obtenerPrecio();
            }
        }
        return sum;
    }
}
