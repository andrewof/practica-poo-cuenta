package com.mycompany.cuenta;

public class Cuenta {
    private int numeroCuenta;
    private int saldo = 2000;

    public Cuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }
    
    public void retirar(int monto) {
        if (saldo >= monto) {
            this.saldo -= monto;
            System.out.println("\n¡Retiro exitoso!");
        } else {
            System.out.println("\n¡Saldo insuficiente!");
        }
    }
    
    public void depositar(int monto) {
        this.saldo += monto;
        System.out.println("\n¡Deposito realizado!");
        System.out.println("Total depositado: "+monto);
    }
    
    public void transferir(Cuenta cuentaOrigen, int cuentaDestino, int monto) {
        boolean encontrado = false;
        
    }
}
