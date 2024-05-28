package org.algo3.MedioPago;

import org.algo3.Errors.SaldoInsuficienteError;

public class MedioPago {
    private int saldo;

    public MedioPago(int unSaldo) {
        saldo = unSaldo;
    }

    public void pagar(int unPrecio) {
        if (unPrecio > saldo) {
            throw new SaldoInsuficienteError();
        }
        saldo -= unPrecio;
    }
}
