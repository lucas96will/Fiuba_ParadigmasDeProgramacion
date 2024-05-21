package org.algo3.Construccion;

import org.algo3.Almacen.Almacen;
import org.algo3.Material.Canio;
import org.algo3.Material.Cemento;
import org.algo3.Material.Material;
import org.algo3.Material.Pintura;

import java.util.ArrayList;
import java.util.List;

public class Edificio implements Construccion {
    private final int plantas;
    private final EstadoConstruccion estado;

    public Edificio(EstadoConstruccion unEstado, int unasPlantas) {
        plantas = unasPlantas;
        estado = unEstado;
    }

    @Override
    public void construir(Almacen almacen) {
        List<Material> materiales = new ArrayList<>();
        materiales.add(new Cemento(100 + cementoPorPlanta()));
        materiales.add(new Canio(100 + 100 * plantas));
        materiales.add(new Pintura(100 + 100 * plantas));
        Vivienda vivienda = new Vivienda(new NoConstruido(), 5);
        vivienda.construir(almacen);
        estado.construir(materiales, almacen);
    }

    private int cementoPorPlanta() {
        int total = 0;
        for (int i = 1; i <= plantas; i++) {
            total += 100 * i;
        }
        return total;
    }
}
