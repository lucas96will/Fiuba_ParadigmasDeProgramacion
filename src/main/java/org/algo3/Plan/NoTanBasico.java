package org.algo3.Plan;

import org.algo3.Actividad.Actividad;
import org.algo3.MedioPago.MedioPago;
import org.algo3.Socio.Socio;

public class NoTanBasico extends Plan {
    public NoTanBasico(int maxMusculacion, int maxClases) {
        super(maxMusculacion, maxClases);
    }

    @Override
    public void usar(Actividad unaActividad, Socio unSocio) {
        actividadesDisponibles.forEach(a -> a.usar(unaActividad, unSocio));
    }

    @Override
    public void pagar(MedioPago mp, int unosDias) {
        mp.pagar(unosDias * 500);
    }
}
