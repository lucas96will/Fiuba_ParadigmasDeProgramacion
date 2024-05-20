package org.algo3;

import org.algo3.Nave.*;
import org.algo3.SistemaAtaque.BombaNeutron;
import org.algo3.SistemaAtaque.Misil;
import org.algo3.SistemaAtaque.SistemaAtaque;
import org.algo3.SistemaAtaque.TorretaIonica;
import org.algo3.SistemaDefensa.EscudoFenix;
import org.algo3.SistemaDefensa.EscudoIonico;
import org.algo3.SistemaDefensa.EscudoSimple;
import org.algo3.SistemaDefensa.SistemaDefensa;
import org.junit.Assert;
import org.junit.Test;

public class NaveTest {

    @Test
    public void puntajeDeCorbetaLuegoDeDisparar2MisilesEsCorrecto() {

        Nave corbeta = new Corbeta(new Misil(3), new EscudoSimple(20));
        Nave otroCorbeta = new Corbeta(new Misil(3), new EscudoSimple(20));

        int puntajeEsperado = 10 + 20;

        corbeta.atacar(otroCorbeta);
        corbeta.atacar(otroCorbeta);

        int puntajeObtenido = corbeta.puntaje();

        Assert.assertEquals(puntajeEsperado, puntajeObtenido);

    }

    @Test
    public void puntajeDeDestructorCon5MisilesLuegoDeRecibir6MisilesEsCorrecto() {

        Nave destructor = new Destructor(new Misil(5), new EscudoFenix(50));
        Nave otroCorbeta = new Corbeta(new Misil(6), new EscudoSimple(50));

        int puntajeEsperado = 50 + 20;

        for (int i = 0; i < 6; i++) {
            otroCorbeta.atacar(destructor);
        }


        int puntajeObtenido = destructor.puntaje();

        Assert.assertEquals(puntajeEsperado, puntajeObtenido);

    }

    @Test
    public void flotaConCorbetaAcorazadoYDestructorNuevosTienePuntajeCorrecto() {

        Nave destructor = new Destructor(new Misil(5), new EscudoFenix(50));
        Nave corbeta = new Corbeta(new Misil(3), new EscudoSimple(30));
        BombaNeutron bomba = new BombaNeutron(10);
        SistemaAtaque torreta = new TorretaIonica(bomba);
        SistemaDefensa escudoIonico = new EscudoIonico(bomba, torreta);
        Nave acorazado = new Acorazado(bomba, torreta, escudoIonico);

        Flota flota = new Flota(destructor, corbeta, acorazado);
        int puntajeEsperado = 60 + 100 + 50 + 100 + 300;


        int puntajeObtenido = flota.puntaje();

        Assert.assertEquals(puntajeEsperado, puntajeObtenido);

    }
}
