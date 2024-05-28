package org.algo3.Socio;

import org.algo3.Actividad.Actividad;
import org.algo3.Plan.Plan;

public class Socio {
    private final Sub sub;
    private final Plan plan;
    private final String nombre;

    public Socio(String unNombre, Plan unPlan, Sub unaSub) {
        plan = unPlan;
        sub = unaSub;
        nombre = unNombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Socio c)) {
            return false;
        }

        return c.nombre.equals(nombre);
    }

    public void usar(Actividad unaActividad) {
        sub.usar(unaActividad, plan, this);
    }
}
