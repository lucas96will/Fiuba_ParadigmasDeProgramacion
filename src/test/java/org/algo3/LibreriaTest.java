package org.algo3;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LibreriaTest {

    @Before
    public void beforeEach() {
        Libreria libreria = new Libreria();
    }

    @Test
    public void libreriaObtieneElImporteDeClienteDeMesMayo() {
        Cliente joaquin = new Cliente("Joaquin", "Paseo Colon");
        Producto libro = new Libro(10000);
        Producto senialadores = new ArticuloDeLibreria(3000);
        Producto revista = new Revista(2000, 4);
        Producto periodico = new Periodico(1000, 30);
        int precioEsperado = 10000 + 3000 + 2000 * 4 * 6 + 1000 * 30 * 12;
        int mesActual = 5; // Para simplificar el ejercicio

        libreria.registrarCliente(joaquin);
        libreria.clienteCompra(joaquin, mesActual, libro, senialadores);
        libreria.clienteSubscribe(revista, mesActual, 6);
        libreria.clienteSubscribe(periodico, mesActual, 12);


        int precioObtenido = libreria.obtenerPrecioDeCliente(Joaquin, mesActual);


        Assert.assertEquals(precioObtenido, precioEsperado);
    }
}
