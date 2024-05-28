package org.algo3;

import org.algo3.Actividad.Actividad;
import org.algo3.Actividad.SalaMusculacion;
import org.algo3.Errors.UsosExcedidosError;
import org.algo3.Gimnasio.Gimnasio;
import org.algo3.Gimnasio.Reserva;
import org.algo3.Plan.FanDeLasClases;
import org.algo3.Plan.NoTanBasico;
import org.algo3.Plan.Plan;
import org.algo3.Socio.Socio;
import org.algo3.Socio.Sub;
import org.junit.Assert;
import org.junit.Test;

public class CasosDeUso {

    @Test
    public void socioConPlanNoTanBasicoReservaSalaDeMusculacion() {
        Gimnasio gym = new Gimnasio();
        Sub sub = new Sub(30);
        Actividad actividad = new SalaMusculacion(3);
        Plan plan = new NoTanBasico(4, 3);
        Socio socio = new Socio("Joaquin", plan, sub);

        Reserva reserva = new Reserva(actividad, socio);

        gym.reservar(actividad, socio);

        Assert.assertTrue(gym.tieneReserva(reserva));
    }

    @Test
    public void socioConPlanFanDeLasClasesQuiereUsarSalaDeMusculacionPorTerceraVezObtieneError() {

        Gimnasio gym = new Gimnasio();
        Sub sub = new Sub(30);
        Actividad actividad = new SalaMusculacion(3);
        Plan plan = new FanDeLasClases(2, 999);
        Socio socio = new Socio("Joaquin", plan, sub);

        gym.reservar(actividad, socio);
        gym.reservar(actividad, socio);
        gym.reservar(actividad, socio);

        gym.usar(actividad, socio);
        gym.usar(actividad, socio);

        Assert.assertThrows(UsosExcedidosError.class, () -> gym.usar(actividad, socio));
    }
}
