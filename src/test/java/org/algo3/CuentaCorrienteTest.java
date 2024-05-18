package org.algo3;

import org.algo3.CuentaCorriente.CuentaCorriente;
import org.algo3.Producto.Libro;
import org.algo3.Producto.Producto;
import org.junit.Assert;
import org.junit.Test;

public class CuentaCorrienteTest {

    @Test
    public void cuentaConVariasComprasSeObtieneCorrectamenteElTotal() {
        CuentaCorriente cuenta = new CuentaCorriente();

        double precioEsperado = 10000;

        Producto producto = new Libro(2000);

        cuenta.comprar(producto, "mayo");
        cuenta.comprar(producto, "mayo");
        cuenta.comprar(producto, "mayo");
        cuenta.comprar(producto, "mayo");
        cuenta.comprar(producto, "mayo");
        cuenta.comprar(producto, "Junio");
        cuenta.comprar(producto, "Julio");

        double precioObtenido = cuenta.obtenerGasto("mayo");

        Assert.assertEquals(precioObtenido, precioEsperado, 0.01);
    }
}
