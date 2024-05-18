package org.algo3.Libreria;

import org.algo3.Cliente.Cliente;
import org.algo3.Producto.Producto;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

    private final List<Cliente> clientes;

    public Libreria() {
        clientes = new ArrayList<Cliente>();
    }

    public double importeTotalClientesRegistrados(String fecha) {
        double sum = 0;
        for (Cliente c : clientes) {
            sum += c.obtenerGastoTotal(fecha);
        }
        return sum;
    }

    public void registrarCliente(Cliente unCliente) {
        clientes.add(unCliente);
    }


    public void clienteCompra(Cliente unCliente, String mes, Producto unProducto) {
        if (clientes.contains(unCliente)) {
            unCliente.comprar(DescuentoClienteRegistrado.aplicar(unProducto), mes);
            return;
        }
        unCliente.comprar(unProducto, mes);
    }
}
