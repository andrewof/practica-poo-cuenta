package com.andres.herencia;

public class Productos {
    protected String titulo;
    protected String ref;
    protected String estado;
    protected int plazo;
    protected int precio;

    public Productos(String titulo, String ref, int plazo, int precio) {
        this.titulo = titulo;
        this.ref = ref;
        this.plazo = plazo;
        this.precio = precio;
        this.estado = "no";
    }

    public String getTitulo() {
        return titulo;
    }

    public String getRef() {
        return ref;
    }

    public String getEstado() {
        return estado;
    }

    public int getPlazo() {
        return plazo;
    }

    public int getPrecio() {
        return precio;
    }

    public void alquilar() {
        this.estado = "si";
        System.out.println("\nPlazo de devolución: "+plazo);
    }

    @Override
    public String toString() {
        return "\nProductos"+
                "\ntitulo: "+titulo+
                "\nref: "+ref+
                "\nestado: "+estado+
                "\nplazo: "+plazo+
                "\nprecio: "+precio;
    }
}
