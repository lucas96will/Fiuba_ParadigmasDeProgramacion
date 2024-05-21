package org.algo3.Almacen;

import org.algo3.Material.Canio;
import org.algo3.Material.Cemento;
import org.algo3.Material.Material;
import org.algo3.Material.Pintura;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private final List<Material> materiales;

    public Almacen(int uCemento, int uCanios, int uPintura) {
        materiales = new ArrayList<>();
        materiales.add(new Cemento(uCemento));
        materiales.add(new Canio(uCanios));
        materiales.add(new Pintura(uPintura));

    }

    public void usarMateriales(List<Material> materialesRecibidos) {
        for (Material recibido : materialesRecibidos) {
            for (Material guardado : materiales) {
                guardado.usar(recibido);
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Almacen c)) {
            return false;
        }
        return materiales.equals(c.materiales);
    }
}
