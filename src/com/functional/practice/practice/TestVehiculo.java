package com.functional.practice.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestVehiculo {
    public static void main(String[] args) {

        ArrayList<Vehiculo>  vehiculos = new ArrayList<>();

        vehiculos.add(new Vehiculo("1111222333", Modelo.BMW, 100000));
        vehiculos.add(new Vehiculo("111122BBBB", Modelo.AUDI, 20000));
        vehiculos.add(new Vehiculo("111122CCCC", Modelo.OPEL, 30000));
        vehiculos.add(new Vehiculo("111122DDDD", Modelo.BMW, 100000));
        vehiculos.add(new Vehiculo("111122FFFF", Modelo.AUDI, 200000));
        vehiculos.add(new Vehiculo("111122GGGG", Modelo.OPEL, 300000));
        vehiculos.add(new Vehiculo("111122HHHH", Modelo.CITROEN, 0));

        System.out.println("--------> Lister los km de cada vehículo y multipicarlo por 2" );

        List<Integer> result = vehiculos.stream()
                        .map(k -> k.getKilometros() *2)
                        .collect(Collectors.toList());
                        result.forEach(System.out::println);

        vehiculos.stream().map(x-> x.getKilometros() *2).forEach(System.out::println);

        System.out.println("--------> Listar los km de todos lo vehiculos" );

        List<Integer> allKm = vehiculos.stream()
                        .map(Vehiculo::getKilometros)
                        .collect(Collectors.toList());

        allKm.forEach(System.out::println);

        System.out.println("--------> Listar todos los vehiculos marca Audi" );

        List<Vehiculo> vehiculosAudi = vehiculos.stream()
                .filter(v -> v.getModelo().equals(Modelo.AUDI))
                .collect(Collectors.toList());
        vehiculosAudi.forEach(System.out::println);

        System.out.println("--------> Vehiculos ordenados por la cantidad de km" );


        List<Vehiculo> vehiculosOrdenador = vehiculos.stream()
                .sorted((v1,v2) -> Integer.compare(v1.getKilometros(), v2.getKilometros()))
                .collect(Collectors.toList());
        vehiculosOrdenador.forEach(System.out::println);

        System.out.println("--------> Vehiculos sin repetir" );


        List<Modelo> listModelsSinRepetir = vehiculos.stream()
                .map(Vehiculo::getModelo)
                .distinct()
                .collect(Collectors.toList());

         listModelsSinRepetir.forEach(System.out::println);

        System.out.println("--------> Listar los vehiculos con mas de 20000km e imprimir todo el objeto. " );

        List<String> vehiculoKmm = vehiculos.stream()
                .filter(v -> v.getKilometros() > 20000)
                .peek(System.out::println)
                .map(Vehiculo::getMatricula)
                .peek(System.out::println)
                .collect(Collectors.toList());

        vehiculoKmm.forEach(System.out::println);

        System.out.println("-----  ---> Agrupar vehiculos por modelo. " );

        Map<Modelo,List<Vehiculo>> groupByModelo = vehiculos.stream()
                .collect(Collectors.groupingBy(Vehiculo::getModelo));

        groupByModelo.forEach((K, V) ->{
            System.out.println("Modelo:" + K);
            V.forEach(System.out::println);
        } );

        System.out.println("--------> Sumar  los km de los Vehículos " );

        Integer sumKm = vehiculos.stream()
                .map(Vehiculo::getKilometros)
                .reduce(0, Integer::sum);

        System.out.println("el resultado es suma kilometros:" + sumKm);

        System.out.println("-------->Listar 2 vehiculos con km menores o iguales a 100000 " );
        vehiculos.stream()
                .filter(v -> v.getKilometros() <= 100000)
                .map(Vehiculo::getModelo)
                .distinct()
                .limit(2)
                .forEach(System.out::println);

    }

}
