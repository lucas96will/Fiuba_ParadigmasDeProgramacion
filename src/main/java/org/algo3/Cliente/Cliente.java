package org.algo3.Cliente;

import org.algo3.CuentaCorriente.CuentaCorriente;
import org.algo3.Producto.Producto;

public abstract class Cliente {
    protected String nombre;
    protected String dir;
    protected CuentaCorriente cuenta;

    public Cliente(String unNombre, String unDir) {
        nombre = unNombre;
        dir = unDir;
        cuenta = new CuentaCorriente();
    }

    abstract public void comprar(Producto unProducto, String mes);

    public double obtenerGastoTotal(String mes) {
        return cuenta.obtenerGasto(mes);
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

