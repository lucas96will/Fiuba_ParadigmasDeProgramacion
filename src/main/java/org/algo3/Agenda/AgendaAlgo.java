package org.algo3.Agenda;

import org.algo3.Socio.Socio;

import java.util.ArrayList;
import java.util.List;

public class AgendaAlgo {

    private static AgendaAlgo instancia;
    private final List<Socio> usosMusculacion;
    private final List<Socio> usosClasesGrupales;

    private AgendaAlgo() {
        usosMusculacion = new ArrayList<>();
        usosClasesGrupales = new ArrayList<>();
    }

    public static AgendaAlgo getInstance() {
        if (instancia == null) {
            instancia = new AgendaAlgo();
        }
        return instancia;
    }

    public int vecesMusculacion(Socio unSocio) {
        return (int) usosMusculacion.stream().filter(s -> s.equals(unSocio)).count();
    }

    public void aumentarUsosMusculacion(Socio unSocio) {
        usosMusculacion.add(unSocio);
    }
}
