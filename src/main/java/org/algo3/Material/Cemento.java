package org.algo3.Material;

public class Cemento extends Material {
    public Cemento(int uCemento) {
        super(uCemento);
    }

    @Override
    public void usar(Material recibido) {
        if (!(recibido instanceof Cemento c)) {
            return;
        }
        cantidad -= c.cantidad();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Cemento c)) {
            return false;
        }
        return cantidad == c.cantidad();
    }
}
