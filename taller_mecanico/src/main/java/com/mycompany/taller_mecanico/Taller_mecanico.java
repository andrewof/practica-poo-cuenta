package com.mycompany.taller_mecanico;

import java.util.Scanner;

public class Taller_mecanico {
    static int i=0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre, direccion, telefono, modelo, marca, color, numPlacas;
        int opcion, ID;
        
        Orden orden = null;
        
        Orden[] vector = new Orden[5];
        
        while (true) {
            System.out.println("\n\tORDENES"+
                    "\n1. agregar orden"+
                    "\n2. consultar orden"+
                    "\n3. Modificar orden"+
                    "\n4. Listar ordenes"+
                    "\n5. Listar carros por marcas"+
                    "\n6. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1 -> {
                    System.out.println("\n\tDATOS PERSONALES");
                    System.out.print("Nombre: ");
                    nombre = sc.next();
                    sc.nextLine();
                    System.out.print("Dirección: ");
                    direccion = sc.nextLine();
                    System.out.print("Telefono: ");
                    telefono = sc.next();
                    sc.nextLine();
                    System.out.println("\tDATOS VEHICULO");
                    System.out.print("Marca: ");
                    marca = sc.next();
                    sc.nextLine();
                    System.out.print("Modelo: ");
                    modelo = sc.next();
                    sc.nextLine();
                    System.out.print("Color: ");
                    color = sc.next();
                    sc.nextLine();
                    System.out.print("Numero placa: ");
                    numPlacas = sc.next();
                    sc.nextLine();
                    
                    orden = new Orden(nombre, direccion, telefono, marca, modelo, color, numPlacas);
                    vector[i] = orden;
                    System.out.println("\nOrden registrada con ID: "+vector[i].getID());
                    i++;
                }
                case 2 -> {
                    System.out.print("\nIngrese el ID asociado a su orden: ");
                    ID = sc.nextInt();
                    orden.consultar(ID);
                }
                case 3 -> {
                    System.out.print("\nIngrese el ID orden poder modificar los datos: ");
                    ID = sc.nextInt();
                    orden.modificar(ID);
                }
                case 4 -> {
                    for (int j=0; j<i; j++) {
                        System.out.println(vector[j].toString());
                    }
                }
                case 5 -> {
                    System.out.println("\n\tLISTADO DE CARROS POR MARCA");
                    for (int j=0; j<i; j++) {
                        System.out.println(vector[j].listarPorMarca());
                    }
                }
                case 6 -> {
                    return;
                }
                default -> {
                    System.out.println("\nOpción incorrecta");
                }
            }
        }
    }
}
