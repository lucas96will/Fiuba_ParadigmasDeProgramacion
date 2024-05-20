package org.algo3.Entrada;

import org.algo3.Tarjeta.Gold;
import org.algo3.Tarjeta.PertenenciaH;

public interface Entrada {
    Entrada comprar(Gold gold);

    Entrada comprar(PertenenciaH tarjeta);
}
