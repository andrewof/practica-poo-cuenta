package com.mycompany.cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n"
                    + "\tMenu"
                    + "\n1. Registrarse"
                    + "\n2. Iniciar sesion"
                    + "\n3. Salir");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1:
                    Operaciones.registrarse();
                    break;
                case 2: 
                    Operaciones.iniciarSesion();
                    break;
                case 3:
                    System.out.println("\nSaliendo del programa");
                    return;
                default:
                    System.out.println("\nOpción inválida, intenta de nuevo");
            }
        }
    }
}
