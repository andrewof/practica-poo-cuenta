package com.mycompany.taller_mecanico;

import java.util.Scanner;


public class Orden {
    private String nombre;
    private String direccion;
    private String telefono;
    private String marca;
    private String modelo;
    private String color;
    private String numPlacas;
    private int ID;
    private static int ultimoId;

    public Orden() {
        this.ID = ++ultimoId;
    }

    public Orden(String nombre, String direccion, String telefono, String marca, String modelo, String color, String numPlacas) {
        this();
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numPlacas = numPlacas;
    }
    
    public void consultar(int ID) {
        if (ID == this.ID) {
            System.out.println("\n\tDETALLE ORDEN\n"+this.detalleOrden());
        } else {
            System.out.println("\nEl ID "+ID+" no existe.");
        }
    }
    
    public void modificar(int ID) {
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        
        
        if (ID == this.ID) {
            while (true) {
                System.out.println("\n\t¿Que desea modificar?"+
                "\n1. Nombre"+
                "\n2. Direccion"+
                "\n3. Telefono"+
                "\n4. Marca"+
                "\n5. Modelo"+
                "\n6. Numero placa"+
                "\n7. Ninguno");
                System.out.print("\nOpcion: ");
                opcion = sc.nextInt();
                
                switch (opcion) {
                    case 1:
                        System.out.print("\nActualizar nombre: ");
                        String nombre = sc.next();
                        this.nombre = nombre;
                        System.out.println("NOMBRE ACTUALIZADO");
                        break;
                    case 2:
                        System.out.print("\nActualizar direccion: ");
                        String direccion = sc.next();
                        this.direccion = direccion;
                        System.out.println("DIRECCION ACTUALIZADA");
                        break;
                    case 3:
                        System.out.print("\nActualizar telefono: ");
                        String telefono = sc.next();
                        this.telefono = telefono;
                        System.out.println("TELEFONO ACTUALIZADO");
                        break;
                    case 4:
                        System.out.print("\nActualizar marca: ");
                        String marca = sc.next();
                        this.marca = marca;
                        System.out.println("MARCA ACTUALIZADA");
                        break;
                    case 5:
                        System.out.print("\nActualizar modelo: ");
                        String modelo = sc.next();
                        this.modelo = modelo;
                        System.out.println("MODELO ACTUALIZADO");
                        break;
                    case 6:
                        System.out.println("\nActualizar placa: ");
                        String placa = sc.next();
                        this.numPlacas = placa;
                        System.out.println("PLACA ACTUALIZADA");
                        break;
                    case 7: return;
                    
                    default: System.out.println("\nOpción incorrecta");
                }
            }    
        } else {
            System.out.println("\nEl ID "+ID+" no existe");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getNumPlacas() {
        return numPlacas;
    }

    public int getID() {
        return ID;
    }

    public String detalleOrden() {
        return  "ID: "+ID+
                "\nnombre: "+nombre+
                "\ndireccion: "+direccion+
                "\ntelefono: "+telefono+ 
                "\nmarca: "+marca+
                "\nmodelo: "+modelo+
                "\ncolor: "+ color +
                "\nnumPlacas: "+numPlacas; 
    }
    
    public String listarPorMarca() {
        return "ID: "+ID+
               "\nMARCA: "+marca;
    }

    @Override
    public String toString() {
         return  "\n\tORDEN"+
                 "\nID: "+ID+
                "\nnombre: "+nombre+
                "\ndireccion: "+direccion+
                "\ntelefono: "+telefono+ 
                "\nmarca: "+marca+
                "\nmodelo: "+modelo+
                "\ncolor: "+ color +
                "\nnumPlacas: "+numPlacas;
    }
    
    
}
