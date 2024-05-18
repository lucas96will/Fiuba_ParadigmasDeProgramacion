package org.algo3.Producto;

public class Libro implements Producto {

    private final double precio;

    public Libro(double unPrecio) {
        precio = unPrecio;
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public Producto aplicarDescuentoRegistrado(double descuento) {
        return new Libro(precio * descuento);
    }

}
