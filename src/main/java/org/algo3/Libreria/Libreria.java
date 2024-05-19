package org.algo3.Libreria;

import org.algo3.Cliente.Cliente;
import org.algo3.Producto.Producto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Libreria {
    private static double DESCUENTO_CLIENTES = 0.05;
    private final List<Cliente> clientesRegistrados;

    public Libreria() {
        clientesRegistrados = new ArrayList<>();
    }

    public double importeTotalClientesRegistradosEnMes(LocalDate unMes) {
        LocalDate inicio = LocalDate.of(unMes.getYear(), unMes.getMonth(), 1);
        LocalDate fin = LocalDate.of(unMes.getYear(), unMes.getMonthValue() + 1, 1);

        return clientesRegistrados.stream().mapToDouble(c -> c.obtenerGastoTotal(inicio, fin)).sum();
    }

    public void registrarCliente(Cliente unCliente) {
        clientesRegistrados.add(unCliente);
    }


    public void clienteCompra(Cliente unCliente, LocalDate unMes, Producto... productos) {
        for (Producto unProducto : productos) {
            if (clientesRegistrados.contains(unCliente)) {
                unCliente.comprar(unProducto.aplicarDescuento(new Descuento(DESCUENTO_CLIENTES)), unMes);
                continue;
            }
            unCliente.comprar(unProducto, unMes);
        }
    }

    public double importeTotalClientesRegistradosEnAnio(LocalDate anio) {
        LocalDate inicio = LocalDate.of(anio.getYear(), 1, 1);
        LocalDate fin = LocalDate.of(anio.getYear() + 1, 1, 1);
        return clientesRegistrados.stream().mapToDouble(c -> c.obtenerGastoTotal(inicio, fin)).sum();
    }
}
