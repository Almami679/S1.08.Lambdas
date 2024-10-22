package Nivell2.Ex4.Main;

import java.util.ArrayList;

import static Nivell2.Ex4.Modules.Functions.*;
import static java.util.Arrays.asList;

public class Main {

    public static void main (String[] args){

        ArrayList<String> list = new ArrayList<>
                (asList("Dados", "Casa", "Avioneta", "6", "35", "Fallo", "Baile", "Estufa", "689" ));

        System.out.println("\nOrdenadas alfabéticamente:\n");

        orderByAlfabet(list);
        list.forEach(System.out::println);

        System.out.println("\nPrimero las que contienen una letra 'e':\n");

        firstWithE(list);
        list.forEach(System.out::println);


        System.out.println("\nPrimero las que contienen una letra 'a' y remplazada por un 4:\n");

        replaceA(list);
        list.forEach(System.out::println);

        System.out.println("\nSolo los numeros de la lista:\n");


        showNums(list).forEach(System.out::println);


    }



}
