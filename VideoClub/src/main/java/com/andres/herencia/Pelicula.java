package com.andres.herencia;

public class Pelicula extends Productos {
    private String genero;
    private String director;
    private String interprete;
    private int anio;

    public Pelicula(String titulo, String ref, int plazo, int precio, String genero, String director, String interprete, int anio) {
        super(titulo, ref, plazo, precio);
        this.genero = genero;
        this.director = director;
        this.interprete = interprete;
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public String getDirector() {
        return director;
    }

    public String getInterprete() {
        return interprete;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\ngenero: "+genero+
                "\ndirector: "+director+
                "\ninterprete: "+interprete+
                "\naño: "+anio;
    }
}
