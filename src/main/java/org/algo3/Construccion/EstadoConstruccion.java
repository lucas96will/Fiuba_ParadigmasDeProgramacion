package org.algo3.Construccion;

import org.algo3.Almacen.Almacen;
import org.algo3.Material.Material;

import java.util.List;

public interface EstadoConstruccion {
    void construir(List<Material> materiales, Almacen almacen);
}
