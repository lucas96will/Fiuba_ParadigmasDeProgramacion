package org.algo3.Nave;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flota {

    private final List<Nave> naves;

    public Flota(Nave... navesRecibidas) {
        naves = new ArrayList<>(Arrays.asList(navesRecibidas));
    }

    public int puntaje() {
        return naves.stream()
                .map(Nave::puntaje)
                .reduce(0, Integer::sum);
    }
}
