package org.algo3.Plan;

import org.algo3.Actividad.Actividad;
import org.algo3.Actividad.Grupales;
import org.algo3.Actividad.SalaMusculacion;
import org.algo3.MedioPago.MedioPago;
import org.algo3.Socio.Socio;

import java.util.ArrayList;
import java.util.List;

public abstract class Plan {
    protected final List<Actividad> actividadesDisponibles;

    public Plan(int maxMusculacion, int maxClases) {
        actividadesDisponibles = new ArrayList<>();
        actividadesDisponibles.add(new SalaMusculacion(maxMusculacion));
        actividadesDisponibles.add(new Grupales(maxClases));
    }

    public abstract void usar(Actividad unaActividad, Socio unSocio);

    public abstract void pagar(MedioPago mp, int unosDias);
}
