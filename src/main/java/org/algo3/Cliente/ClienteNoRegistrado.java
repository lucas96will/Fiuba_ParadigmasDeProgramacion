package org.algo3.Cliente;

import org.algo3.Producto.Producto;

public class ClienteNoRegistrado extends Cliente {
    public ClienteNoRegistrado(String nombre, String dir) {
        super(nombre, dir);
    }

    @Override
    public void comprar(Producto unProducto, String mes) {
        cuenta.comprar(unProducto, mes);
    }

}
