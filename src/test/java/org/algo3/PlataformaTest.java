package org.algo3;

import org.algo3.Entrada.Entrada;
import org.algo3.Entrada.EntradaA;
import org.algo3.Entrada.EntradaB;
import org.algo3.Plataforma.Plataforma;
import org.algo3.Tarjeta.Gold;
import org.algo3.Tarjeta.PertenenciaH;
import org.algo3.Tarjeta.Tarjeta;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PlataformaTest {
    @Test
    public void seCompran2EntradasTipoBConTarjetaPertenenciaHYSeObtienen2() {
        Tarjeta tarj = new PertenenciaH();
        List<Entrada> entradasAComprar = new ArrayList<Entrada>();
        entradasAComprar.add(new EntradaB());
        entradasAComprar.add(new EntradaB());
        Plataforma plat = new Plataforma();

        List<Entrada> entradasRecibidas = plat.comprar(tarj, entradasAComprar);

        Assert.assertEquals(entradasAComprar.size(), entradasRecibidas.size());
        for (Entrada e : entradasRecibidas) {
            Assert.assertTrue(entradasAComprar.contains(e));
            entradasAComprar.remove(e);
        }
    }

    @Test
    public void seCompran2EntradasTipoAConTarjetaGoldSeRecibeSolo1() {
        Tarjeta tarj = new Gold();
        List<Entrada> entradasAComprar = new ArrayList<Entrada>();
        entradasAComprar.add(new EntradaA());
        entradasAComprar.add(new EntradaA());
        Plataforma plat = new Plataforma();

        List<Entrada> entradasRecibidas = plat.comprar(tarj, entradasAComprar);
        List<Entrada> entradasEsperadas = new ArrayList<>();
        entradasEsperadas.add(new EntradaA());

        Assert.assertEquals(entradasEsperadas.size(), entradasRecibidas.size());
        for (Entrada e : entradasEsperadas) {
            Assert.assertTrue(entradasRecibidas.contains(e));
            entradasRecibidas.remove(e);
        }
    }

    @Test
    public void seCompran2EntradasTipoB2EntradasTipoAConTarjetaPertenenciaHYSeObtienenCorrectamentee() {
        Tarjeta tarj = new PertenenciaH();
        List<Entrada> entradasAComprar = new ArrayList<>();
        entradasAComprar.add(new EntradaB());
        entradasAComprar.add(new EntradaB());
        entradasAComprar.add(new EntradaA());
        entradasAComprar.add(new EntradaA());
        Plataforma plat = new Plataforma();

        List<Entrada> entradasRecibidas = plat.comprar(tarj, entradasAComprar);

        Assert.assertEquals(entradasAComprar.size(), entradasRecibidas.size());
        for (Entrada e : entradasRecibidas) {
            Assert.assertTrue(entradasAComprar.contains(e));
            entradasAComprar.remove(e);
        }
    }
}
