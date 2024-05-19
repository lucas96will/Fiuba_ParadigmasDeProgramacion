package org.algo3.Cliente;

import org.algo3.CuentaCorriente.CuentaCorriente;
import org.algo3.Producto.Producto;

import java.time.LocalDate;

public class Cliente {
    protected String nombre;
    protected String dir;
    protected CuentaCorriente cuenta;

    public Cliente(String unNombre, String unDir) {
        nombre = unNombre;
        dir = unDir;
        cuenta = new CuentaCorriente();
    }

    public void comprar(Producto unProducto, LocalDate unaFecha) {
        cuenta.comprar(unProducto, unaFecha);
    }

    public double obtenerGastoTotal(LocalDate inicio, LocalDate fin) {

        return cuenta.obtenerGastoEntreFechas(inicio, fin);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Cliente)) {
            return false;
        }

        Cliente c = (Cliente) obj;

        return (c.nombre.equals(nombre) && c.dir.equals(dir));
    }
}

