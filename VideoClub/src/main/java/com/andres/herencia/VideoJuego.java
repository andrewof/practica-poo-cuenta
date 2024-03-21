package com.andres.herencia;

public class VideoJuego extends Productos {
    private String estilo;
    private String plataforma;

    public VideoJuego(String titulo, String ref, int plazo, int precio, String estilo, String plataforma) {
        super(titulo, ref, plazo, precio);
        this.estilo = estilo;
        this.plataforma = plataforma;
    }

    public String getEstilo() {
        return estilo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nestilo: "+estilo+
                "\nplataforma: " +plataforma;
    }
}
