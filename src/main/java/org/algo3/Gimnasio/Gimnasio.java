package org.algo3.Gimnasio;

import org.algo3.Actividad.Actividad;
import org.algo3.Errors.SocioNoTieneReserva;
import org.algo3.Socio.Socio;

import java.util.ArrayList;
import java.util.List;

public class Gimnasio {

    private final List<Object> reservas;

    public Gimnasio() {
        reservas = new ArrayList<>();
    }

    public void reservar(Actividad actividad, Socio socio) {
        reservas.add(new Reserva(actividad, socio));
    }

    public boolean tieneReserva(Reserva reserva) {
        return reservas.stream().anyMatch(r -> r.equals(reserva));
    }

    public void usar(Actividad actividad, Socio socio) {
        if (!tieneReserva(new Reserva(actividad, socio))) {
            throw new SocioNoTieneReserva();
        }

        socio.usar(actividad);

        reservas.remove(new Reserva(actividad, socio));
    }

}
