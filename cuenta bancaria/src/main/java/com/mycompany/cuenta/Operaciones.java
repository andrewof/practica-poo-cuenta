package com.mycompany.cuenta;

import java.util.ArrayList;
import java.util.Scanner;

public class Operaciones {
    static ArrayList<Cuenta> cuentas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void registrarse() {
        System.out.print("\nIngrese el número de cuenta a registrar: ");
        int numeroCuenta = sc.nextInt();
        sc.nextLine();
        
        for (Cuenta cuenta: cuentas) {
            if (cuenta.getNumeroCuenta() == numeroCuenta) {
                System.out.println("\nLa cuenta ya existe");
                return;
            }
        }
        
        Cuenta nuevaCuenta = new Cuenta(numeroCuenta);
        cuentas.add(nuevaCuenta);
        System.out.println("\n¡Registro exitoso!");
    }
    
    public static void iniciarSesion() {
        System.out.print("\nIngrese el numero de cuenta: ");
        int numeroCuenta = sc.nextInt();
        
        for (Cuenta cuenta: cuentas) {
            if (cuenta.getNumeroCuenta() == numeroCuenta) {
                menu(cuenta);
                return;
            }
        }
        System.out.println("\nCuenta no encontrada");
    }
    
    public static void menu(Cuenta cuenta) {
        while (true) {
            System.out.println("\n"
                    + "\n\tmenu."
                    + "\n1. Retirar"
                    + "\n2. Depositar"
                    + "\n3. Transferir"
                    + "\n4. Consultar saldo"
                    + "\n5. Cerrar sesión");
            System.out.print("\nOpción: ");
            int opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1: 
                    System.out.print("\nMonto a retirar: ");
                    int montoRetiro = sc.nextInt();
                    cuenta.retirar(montoRetiro);
                    break;
                case 2: 
                    System.out.print("\nMonto a depositar: ");
                    int montoDeposito = sc.nextInt();
                    cuenta.depositar(montoDeposito);
                    break;
                case 3:
                    transferir(cuenta);
                    break;
                case 4:
                    System.out.println("\n\tNumero de cuenta: "+cuenta.getNumeroCuenta()
                            + "\nSaldo disponible: "+cuenta.getSaldo());
                    break;
                case 5:
                    System.out.println("\nCerrando sesión");
                    return;
                default:
                    System.out.println("\nOpción no válida, Introduce una opción válida.");
            }
        }
    }
    
    public static void transferir(Cuenta cuentaOrigen) {
        System.out.print("\nIngrese el número de cuenta destino: ");
        int numeroDestino = sc.nextInt();
        sc.nextLine();
        
        Cuenta cuentaDestino = null;
        
        for (Cuenta cuenta: cuentas) {
            if (cuenta.getNumeroCuenta() == numeroDestino) {
                cuentaDestino = cuenta;
                break;
            }
        }
        
        if (cuentaDestino == null) {
            System.out.println("\nLa cuenta no ha sido encontrada");
            return;
        }
        
        System.out.print("\nIngrese el monto a transferir: ");
        int monto = sc.nextInt();
        sc.nextLine();
        
        if (monto <= 0) {
            System.out.println("\nMonto inválido");
            return;
        }
        
        if (cuentaOrigen.getSaldo() < monto) {
            System.out.println("\n¡Saldo insuficiente!");
            return;
        }
        
        cuentaOrigen.retirar(monto);
        cuentaDestino.depositar(monto);
        System.out.println("\n¡Transferencia exitosa!");
    }
}
