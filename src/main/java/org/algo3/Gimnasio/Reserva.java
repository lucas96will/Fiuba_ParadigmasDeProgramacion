package org.algo3.Gimnasio;

import org.algo3.Actividad.Actividad;
import org.algo3.Socio.Socio;

public class Reserva {
    private final Actividad actividad;
    private final Socio socio;

    public Reserva(Actividad unaActividad, Socio unSocio) {
        actividad = unaActividad;
        socio = unSocio;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Reserva c)) {
            return false;
        }

        return actividad.equals(c.actividad) && socio.equals(c.socio);
    }
}
