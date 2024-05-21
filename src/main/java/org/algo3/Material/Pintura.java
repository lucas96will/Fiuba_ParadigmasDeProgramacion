package org.algo3.Material;

public class Pintura extends Material {
    public Pintura(int uPintura) {
        super(uPintura);
    }

    @Override
    public void usar(Material recibido) {
        if (!(recibido instanceof Pintura c)) {
            return;
        }
        cantidad -= c.cantidad();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Pintura c)) {
            return false;
        }
        return cantidad == c.cantidad();
    }
}
