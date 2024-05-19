package org.algo3;


import org.algo3.Cliente.Cliente;
import org.algo3.Libreria.Libreria;
import org.algo3.Producto.*;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;


public class LibreriaTest {

    @Test
    public void libreriaObtieneElImporteDeClienteDeMesMayo() {
        Libreria libreria = new Libreria();
        Cliente joaquin = new Cliente("Joaquin", "Paseo Colon");
        Producto libro = new Libro(10000);
        Producto senialadores = new ArticuloDeLibreria(3000);
        Producto revista = new Revista(2000, 4, 6);
        Producto periodico = new Periodico(1000, 30, 12);
        double precioEsperado = (10000 + 3000) * 0.95 + 2000 * 4 * 6 * 0.95 + (1000 * 30 * 12) * 0.8;
        LocalDate fecha = LocalDate.of(2024, 3, 19);
        libreria.registrarCliente(joaquin);
        libreria.clienteCompra(joaquin, fecha, libro, senialadores, revista, periodico);


        double precioObtenido = libreria.importeTotalClientesRegistradosEnMes(fecha);


        Assert.assertEquals(precioEsperado, precioObtenido, 0.01);
    }

    @Test
    public void libreriaObtieneElImporteDeClienteDelAnio() {
        Libreria libreria = new Libreria();
        Cliente joaquin = new Cliente("Joaquin", "Paseo Colon");
        Producto libro = new Libro(10000);
        Producto senialadores = new ArticuloDeLibreria(3000);
        Producto revista = new Revista(2000, 4, 6);
        Producto periodico = new Periodico(1000, 30, 12);

        double precioEsperado = (10000 + 3000) * 0.95 + 2000 * 4 * 6 * 0.95 + (1000 * 30 * 12) * 0.8;

        LocalDate fecha = LocalDate.of(2024, 3, 19);
        LocalDate fechaSiguienteAnio = LocalDate.of(2025, 3, 19);
        libreria.registrarCliente(joaquin);

        libreria.clienteCompra(joaquin, fecha, libro, senialadores, revista, periodico);
        libreria.clienteCompra(joaquin, fechaSiguienteAnio, libro);


        double precioObtenido = libreria.importeTotalClientesRegistradosEnAnio(fecha);


        Assert.assertEquals(precioEsperado, precioObtenido, 0.01);
    }
}
