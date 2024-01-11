package com.functional.map.filter.sorted.practice;

import java.util.*;
import java.util.stream.Collectors;

public class TestPelicula {

    public static void main(String[] args) {

        List<Pelicula> listPelis = new ArrayList<>();
        listPelis.add(new Pelicula ("E.T.", "Steven Spielberg", 1982));
        listPelis.add(new Pelicula("Avatar", "James Cameron", 2009));
        listPelis.add(new Pelicula("Salvar al soldado Ryan", "Steven Spielberg", 1998));
        listPelis.add(new Pelicula("Origen", "Christopher Nolan", 2010));
        listPelis.add(new Pelicula ("L.A. Confidential", "Curtis Hanson", 1997));

        System.out.println("------> Obtener las peliculas estrenadas en el siglo XXI ----> : ");

        List<Pelicula> peliculasSigloXXI = listPelis.stream()
                .filter(x -> x.getEstreno() >= 2000)
                .collect(Collectors.toList());
        peliculasSigloXXI.forEach(System.out::println);

        System.out.println("------> Mostrar en pantalla, separado por comas, los titulos de las peliculas de Steven Spielberg");

        String peliculasSteven = listPelis.stream()
                .filter(x -> x.getDirector().equals("Steven Spielberg"))
                .map(Pelicula::getTitulo)
                .collect(Collectors.joining(", "," Nombres de las peliculaas de Steven Spielberg: " ,""));
        System.out.println(" ------> Listado peliculas : " + peliculasSteven);


        System.out.println("------> Obtener un listado con el nombre de las peliculas, ordenadas alfabeticamente");

        List<String> estrenosSigloXXI = listPelis.stream()
                .map(p -> p.getTitulo())
                .sorted()
                .collect(Collectors.toList());

        estrenosSigloXXI.forEach(System.out::println);

        System.out.println("------> Obtener un listado con el nombre de las peliculas, ordenadas por el año");

        List<String> obtenerMayorAñoPelicula = listPelis.stream()
                .sorted(Comparator.comparingInt(Pelicula::getEstreno))
                .map(x -> x.getTitulo() + "  " + x.getDirector() +" " + x.getEstreno())
                .collect(Collectors.toList());
        obtenerMayorAñoPelicula.forEach(System.out::println);

        System.out.println("------> Obtener un listado con el año mas reciente");

        Optional<Pelicula> peliMax = listPelis.stream()
                .max((x1,x2) -> Integer.compare(x1.getEstreno(), x2.getEstreno()));
        System.out.println(peliMax);

    }

}
