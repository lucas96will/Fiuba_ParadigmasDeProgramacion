package org.algo3.Material;

public abstract class Material {

    protected int cantidad;

    public Material(int unaCantidad) {
        cantidad = unaCantidad;
    }

    public int cantidad() {
        return cantidad;
    }

    public abstract void usar(Material recibido);

    public abstract boolean equals(Object obj);
}
