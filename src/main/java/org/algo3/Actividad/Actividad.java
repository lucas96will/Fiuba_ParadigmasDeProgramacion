package org.algo3.Actividad;

import org.algo3.Agenda.AgendaAlgo;
import org.algo3.Errors.UsosExcedidosError;
import org.algo3.Socio.Socio;

public abstract class Actividad {
    private int usosMax;

    public Actividad(int unUsoMax) {
        usosMax = unUsoMax;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        return obj.getClass() == this.getClass();
    }

    public void usar(Actividad unaActividad, Socio unSocio) {
        if (!equals(unaActividad)) {
            return;
        }

        AgendaAlgo agenda = AgendaAlgo.getInstance();
        int usosSocio = agenda.vecesMusculacion(unSocio);
        if (usosSocio >= usosMax) {
            throw new UsosExcedidosError();
        }
        agenda.aumentarUsosMusculacion(unSocio);
    }
}
