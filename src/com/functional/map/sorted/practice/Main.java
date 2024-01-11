package com.functional.map.sorted.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(5,2,3,10,98);
        num.stream()
                .sorted()
                .collect(Collectors.toList());
        num.forEach(System.out::println);

        List<String> nom = Arrays.asList("otro","Alejandro","Katerine","Abby","Nadie");
        nom.stream()
                .sorted()
                .forEach(System.out::println);

        List<String> existLetter =  Arrays.asList("otro","Alejandro","Katerine","Abby","Nadie");

        List<String> iff = existLetter.stream()
                .map(x -> x + ":  " + x.contains("A"))
                .collect(Collectors.toList());
        iff.forEach( x -> System.out.println(x));

        System.out.println("Nombres que contienen la letra H");

        List<String> no =  Arrays.asList("otro","Alejandro","Katerine","Abby","Nadie","Abby");

        List<String> listaSinDuplicados = no.stream().distinct().collect(Collectors.toList());

        // Imprime la lista sin duplicados
        listaSinDuplicados.forEach(System.out::println);
    }
}
