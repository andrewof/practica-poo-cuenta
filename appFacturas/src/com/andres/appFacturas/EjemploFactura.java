package com.andres.appFacturas;

import com.andres.appFacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.setRut("123456789");
        cliente.setNombre("Andrés");

        System.out.print("Descripción factura: ");
        String descripcion = sc.nextLine();
        Factura factura = new Factura(descripcion, cliente);

        Producto producto;

        System.out.println();

        for (int i=0; i<5; i++) {
            producto = new Producto();

            System.out.println("PRODUCTO #"+producto.getCodigo());
            System.out.print("Nombre: ");
            producto.setNombre(sc.nextLine());

            System.out.print("Precio: ");
            producto.setPrecio(sc.nextFloat());

            System.out.print("Cantidad: ");

            factura.addItemFactura(new ItemFactura(sc.nextInt(), producto));

            System.out.println();
        }
        System.out.println(factura.generarDetalle());
    }
}
