package org.algo3;

import org.algo3.Almacen.Almacen;
import org.algo3.Construccion.Construccion;
import org.algo3.Construccion.Edificio;
import org.algo3.Construccion.NoConstruido;
import org.algo3.Construccion.Vivienda;
import org.junit.Assert;
import org.junit.Test;

public class AlmacenTest {

    @Test
    public void SeConstruyeUnaViviendaDe5AmbientesAlmacenRemanenteEsCorrecto() {
        Almacen almacen = new Almacen(100, 500, 2500);
        Construccion vivienda = new Vivienda(new NoConstruido(), 5);

        Almacen almacenEsperado = new Almacen(0, 0, 0);

        vivienda.construir(almacen);

        Assert.assertEquals(almacenEsperado, almacen);
    }

    @Test
    public void SeConstruyeUnEdiificioDe5PisosAlmacenRemanenteEsCorrecto() {
        Almacen almacen = new Almacen(1700, 1100, 3100);
        Construccion vivienda = new Edificio(new NoConstruido(), 5);

        Almacen almacenEsperado = new Almacen(0, 0, 0);

        vivienda.construir(almacen);

        Assert.assertEquals(almacenEsperado, almacen);
    }

    @Test
    public void SeConstruyeUnComplejoDeUnaVivienda5Pisosy2Edificios5Plantas() {
        Almacen almacen = new Almacen(3500, 2700, 8700);
        Construccion edi1 = new Edificio(new NoConstruido(), 5);
        Construccion edi2 = new Edificio(new NoConstruido(), 5);
        Construccion vivienda = new Vivienda(new NoConstruido(), 5);
        Complejo complejo = new Complejo(edi1, edi2, vivienda);
        Almacen almacenEsperado = new Almacen(0, 0, 0);

        complejo.construir(almacen);

        Assert.assertEquals(almacenEsperado, almacen);
    }
}
