package org.algo3;

import org.algo3.Cliente.Cliente;
import org.algo3.Cliente.ClienteNoRegistrado;
import org.algo3.Producto.Libro;
import org.algo3.Producto.Producto;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClienteTest {
    @Test
    public void clienteNoRegistradoCompraUnLibro() {
        Cliente cliente = new ClienteNoRegistrado("lw", "paseo colon");
        Producto libro = new Libro(2000);

        double precioEsperado = 2000;

        cliente.comprar(libro, "mayo");
        double precioObtenido = cliente.obtenerGastoTotal("mayo");


        assertEquals(precioEsperado, precioObtenido, 0.01);
    }
}
