package org.algo3.Construccion;

import org.algo3.Almacen.Almacen;
import org.algo3.Material.Canio;
import org.algo3.Material.Cemento;
import org.algo3.Material.Material;
import org.algo3.Material.Pintura;

import java.util.ArrayList;
import java.util.List;

public class Vivienda implements Construccion {
    private EstadoConstruccion estado;
    private int ambientes;

    public Vivienda(EstadoConstruccion unEstado, int unosAmbientes) {
        estado = unEstado;
        ambientes = unosAmbientes;

    }

    @Override
    public void construir(Almacen almacen) {
        List<Material> materiales = new ArrayList<>();
        materiales.add(new Cemento(50 + 10 * ambientes));
        materiales.add(new Canio(100 * ambientes));
        materiales.add(new Pintura(500 * ambientes));

        estado.construir(materiales, almacen);
    }
}
