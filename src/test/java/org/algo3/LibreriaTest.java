package org.algo3;


import org.algo3.Cliente.Cliente;
import org.algo3.Cliente.ClienteNoRegistrado;
import org.algo3.Libreria.Libreria;
import org.algo3.Producto.Libro;
import org.algo3.Producto.Producto;
import org.junit.Assert;
import org.junit.Test;

public class LibreriaTest {

    @Test
    public void libreriaObtieneElImporteDeClienteDeMesMayo() {
        Libreria libreria = new Libreria();
        Cliente joaquin = new ClienteNoRegistrado("Joaquin", "Paseo Colon");
        Producto libro = new Libro(10000);
/*        Producto senialadores = new ArticuloDeLibreria(3000);
        Producto revista = new Revista(2000, 4);
        Producto periodico = new Periodico(1000, 30);*/
//        double precioEsperado = (10000 + 3000)*0.95 + 2000*4*6 + (1000*30*12)*0.8;
        String mesActual = "mayo"; // Para simplificar el ejercicio
        double precioEsperado = 10000 * 0.95;
        libreria.registrarCliente(joaquin);
        libreria.clienteCompra(joaquin, mesActual, libro/*, senialadores*/);
/*        libreria.clienteSubscribe(revista, mesActual, 6);
        libreria.clienteSubscribe(periodico, mesActual, 12);*/


        double precioObtenido = libreria.importeTotalClientesRegistrados(mesActual);


        Assert.assertEquals(precioObtenido, precioEsperado, 0.01);
    }
}
