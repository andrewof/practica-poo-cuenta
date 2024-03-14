package com.andres.appFacturas.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Factura {
    private int id;
    private String descripcion;
    private LocalDate fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS = 10;
    private static int ultimoId;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.id = ++ultimoId;
        this.fecha = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha.format(formatter);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item) {
        if (indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    public float calcularTotal() {
        float total = 0.0f;
        for (ItemFactura item: this.items) {
            if (item == null) {
                continue;
            }
            total += item.calcularImporte();
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura N: ");
        sb.append(id)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\t RUT: ")
                .append(this.cliente.getRut())
                .append("\nDescripción: ")
                .append(this.descripcion)
                .append("\n")
                .append("\n#\tnombre\t$\tCant.\ttotal\tFecha emisión\n");
                for (ItemFactura item: this.items) {
                    if (item == null) {
                        continue;
                    }
                    sb.append(item.getProducto().getCodigo())
                            .append("\t")
                            .append(item.getProducto().getNombre())
                            .append("\t")
                            .append(item.getProducto().getPrecio())
                            .append("\t")
                            .append(item.getCantidad())
                            .append("\t")
                            .append(item.calcularImporte())
                            .append(this.fecha)
                            .append("\n");
                }
                sb.append("\nGran total: ").append(calcularTotal());

        return sb.toString();
    }
}
