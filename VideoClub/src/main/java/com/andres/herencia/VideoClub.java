package com.andres.herencia;

import java.util.ArrayList;
import java.util.Scanner;

public class VideoClub {
    static String titulo, ref;
    static int plazo, precio;
    static Scanner sc = new Scanner(System.in);

    public static void llenarAtributos() {
        System.out.print("\nReferencia: ");
        ref = sc.next();
        System.out.print("título: ");
        titulo = sc.next();
        System.out.print("Plazo alquiler: ");
        plazo = sc.nextInt();
        System.out.print("Precio alquiler: ");
        precio = sc.nextInt();

    }


    public static void main(String[] args) {
        Pelicula pelicula;
        VideoJuego videoJuego;

        ArrayList<Productos> listaP = new ArrayList<>();

        String genero, director, interprete, estilo, plataforma;
        int opcion, anio;

        while (true) {
            System.out.println("""

                    \tMENÚ
                    1. agregar película
                    2. agregar video juego
                    3. consultar referencia
                    4. alquilar
                    5. listar peliculas
                    6. listar video juegos
                    7. salir""");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    llenarAtributos();
                    System.out.print("\nGenero: ");
                    genero = sc.next();
                    sc.nextLine();
                    System.out.print("Director: ");
                    director = sc.next();
                    sc.nextLine();
                    System.out.print("Actores: ");
                    interprete = sc.next();
                    sc.nextLine();
                    System.out.print("Año: ");
                    anio = sc.nextInt();

                    pelicula = new Pelicula(titulo, ref, plazo, precio, genero, director, interprete, anio);
                    listaP.add(pelicula);
                    break;
                case 2:
                    llenarAtributos();
                    System.out.print("\nEstilo: ");
                    estilo = sc.next();
                    sc.nextLine();
                    System.out.print("Plataforma: ");
                    plataforma = sc.next();
                    sc.nextLine();
                    videoJuego = new VideoJuego(titulo, ref, plazo, precio, estilo, plataforma);
                    listaP.add(videoJuego);
                    break;
                case 3:
                    for (Productos p: listaP) {
                        System.out.println(p.toString());
                    }
                    break;
                case 4:
                    System.out.print("\nReferencia: ");
                    ref = sc.next();
                    for (Productos p: listaP) {
                        if (p.getRef().equalsIgnoreCase(ref)) {
                            p.alquilar();
                        }
                    }
                    break;
                case 5: 
                    for (Productos p: listaP) {
                        if (p.getClass() == Pelicula.class) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 6: 
                    for (Productos p: listaP) {
                        if (p.getClass() == VideoJuego.class) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 7:
                    return;
                default: 
                    System.out.println("\n¡Opción incorrecta!");
            }
        }
    }
}
