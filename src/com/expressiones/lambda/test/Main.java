package com.expressiones.lambda.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

      ArrayList<Student> listStudents = new ArrayList<>();

      listStudents.add(new Student(1,"123456","alejandro","herrera","calculo",16,16));
      listStudents.add(new Student(2,"1234567","duvan","herrera","calculo",16,16));
      listStudents.add(new Student(3,"1234568","alejandra","herrera","calculi",16,616));
      listStudents.add(new Student(4,"1234569","andrea","raigoza","calculi",16,16));
      listStudents.add(new Student(5,"12345610","katerine","vasques","sst",16,16));
      listStudents.add(new Student(6,"12345611","janitorial","arraign","calculi",16,6));
      listStudents.add(new Student(7,"12345612","susana","herrera","ca",16,16));
      listStudents.add(new Student(8,"12345613","erika","herrera","quesadilla",16,16));
      listStudents.add(new Student(9,"1234514","sebastian","herrera","online",16,176));
      listStudents.add(new Student(10,"12345615","roberto","herrera","mirco",16,19));
      listStudents.add(new Student(11,"12345616","alendronate","herrera","mate",16,18));

      listStudents.stream().forEach(a -> System.out.println(a));
      listStudents.forEach(x -> System.out.println(x));

        System.out.println(" ------ Alumnos que los nombres empiezan con 'a' 'e' ----- " );
        listStudents.stream().filter(x -> x.getNames().charAt(0) == 'e' || x.getNames().charAt(0) == 'a')
                .forEach(x -> System.out.println(x));

        System.out.println(" ------ Número total de alumnos: " );
        System.out.println(listStudents.size());

        System.out.println(" ------ Alumno con menor edad: " );
        System.out.println(listStudents.stream().min((a1,a2) -> a1.getAge() - a2.getAge()));


        System.out.println(" ------ Alumno con Mayor edad: " );
        System.out.println(listStudents.stream().max((a1,a2) -> a1.getAge() - a2.getAge()));

        System.out.println(" ------ Encontrar el primer alumno: " );
        System.out.println(listStudents.stream().findFirst());

        System.out.println(" ------Alumnos terminan el nombre de los cursos en 'e' y en 'n': " );
        listStudents.stream().filter(x -> x.getSubject().endsWith("e"))
                .forEach(x -> System.out.println(x));

        System.out.println(" ------Alumnos que su nombre contiene la letra 'a': " );
        listStudents.stream().filter(x -> x.getSubject().contains("a"))
               .forEach(x -> System.out.println(x));

        System.out.println(" ------Listar a los alumnos que el tamaño de su nombre es mayor a 10 caracteres: " );
        listStudents.stream().filter(x -> x.getNames().length() > 10)
               .forEach(System.out::println);


         for (Integer numero : Arrays.asList(1,2,3,4,5,6,7,8,9,10)) {
             System.out.println(numero + " ");
         }
         Arrays.asList(1,2,3,4,5,6,7,8,9,10).forEach(System.out::println);
         ArrayList <Integer> menor = new ArrayList<>();
          for (Integer num : Arrays.asList(1,2,3,4,5,6,7,8,9,10)){
             if (num > 5){
                 menor.add(num);
                 System.out.println(num);
              }
          }
             for (Integer valor : menor){
                 System.out.println(valor + "valor impreso");
             }
             ArrayList <Integer> mayor = (ArrayList<Integer>) Arrays.asList(1,2,3,4,5,6,7,8,9,10)
                     .stream()
                     .filter(x -> x >5)
                     .collect(Collectors.toList());

             mayor.forEach(e-> System.out.println(e));

             ArrayList <String> names = (ArrayList<String>) Arrays.asList("SUMA","Y2","POS","ONLINE")
                     .stream()
                     .filter(x -> x.equals("SUMAS"))
                     .collect(Collectors.toList());

             names.forEach( y -> System.out.println(y));

    }
}