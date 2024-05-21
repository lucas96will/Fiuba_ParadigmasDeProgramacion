package org.algo3;

import org.algo3.Almacen.Almacen;
import org.algo3.Construccion.Construccion;

import java.util.ArrayList;
import java.util.List;

public class Complejo {
    private final List<Construccion> construcciones;

    public Complejo(Construccion... unasConstrucciones) {
        construcciones = new ArrayList<>(List.of(unasConstrucciones));
    }


    public void construir(Almacen almacen) {
        construcciones.forEach(c -> c.construir(almacen));
    }
}
