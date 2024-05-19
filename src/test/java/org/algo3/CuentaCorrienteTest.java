package org.algo3;

import org.algo3.CuentaCorriente.CuentaCorriente;
import org.algo3.Producto.Libro;
import org.algo3.Producto.Producto;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class CuentaCorrienteTest {

    @Test
    public void cuentaConVariasComprasSeObtieneCorrectamenteElTotalDelMesDeMayo() {
        CuentaCorriente cuenta = new CuentaCorriente();

        double precioEsperado = 10000;

        Producto producto = new Libro(2000);
        LocalDate mayo = LocalDate.of(2024, 4, 19);
        LocalDate junio = LocalDate.of(2024, 5, 19);
        LocalDate julio = LocalDate.of(2024, 6, 19);
        cuenta.comprar(producto, mayo);
        cuenta.comprar(producto, mayo);
        cuenta.comprar(producto, mayo);
        cuenta.comprar(producto, mayo);
        cuenta.comprar(producto, mayo);
        cuenta.comprar(producto, junio);
        cuenta.comprar(producto, julio);

        LocalDate inicio = LocalDate.of(2024, 4, 1);
        LocalDate fin = LocalDate.of(2024, 5, 1);
        double precioObtenido = cuenta.obtenerGastoEntreFechas(inicio, fin);

        Assert.assertEquals(precioObtenido, precioEsperado, 0.01);
    }
}
