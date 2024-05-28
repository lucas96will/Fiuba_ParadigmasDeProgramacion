package org.algo3.Socio;

import org.algo3.Actividad.Actividad;
import org.algo3.MedioPago.MedioPago;
import org.algo3.Plan.Plan;

public class Sub {
    private final int dias;
    private int diasRestantes;

    public Sub(int unosDias) {
        dias = unosDias;
        diasRestantes = unosDias;
    }

    public void usar(Actividad unaActividad, Plan unPlan, Socio unSocio) {
        if (diasRestantes <= 0) {
            return;
        }
        unPlan.usar(unaActividad, unSocio);
    }

    public void pagar(Plan unPlan, MedioPago mp) {
        unPlan.pagar(mp, dias);
    }
}
