package org.algo3;

import org.algo3.Cliente.Cliente;
import org.algo3.Producto.Libro;
import org.algo3.Producto.Producto;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class ClienteTest {
    @Test
    public void clienteNoRegistradoCompraUnLibro() {
        Cliente cliente = new Cliente("lw", "paseo colon");
        Producto libro = new Libro(2000);

        double precioEsperado = 2000;
        LocalDate mayo = LocalDate.of(2024, 4, 19);
        LocalDate inicio = LocalDate.of(2024, 4, 19);
        LocalDate fin = LocalDate.of(2024, 4, 20);

        cliente.comprar(libro, mayo);
        double precioObtenido = cliente.obtenerGastoTotal(inicio, fin);


        assertEquals(precioEsperado, precioObtenido, 0.01);
    }
}
