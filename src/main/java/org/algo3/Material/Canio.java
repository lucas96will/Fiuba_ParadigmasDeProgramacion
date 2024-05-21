package org.algo3.Material;

public class Canio extends Material {
    public Canio(int uCanios) {
        super(uCanios);
    }

    @Override
    public void usar(Material recibido) {
        if (!(recibido instanceof Canio c)) {
            return;
        }
        cantidad -= c.cantidad();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Canio c)) {
            return false;
        }
        return cantidad == c.cantidad();
    }
}
