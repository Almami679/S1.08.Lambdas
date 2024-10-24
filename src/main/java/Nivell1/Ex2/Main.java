package Nivell1.Ex2;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> filter = new ArrayList<>();

        ArrayList<String> nombres = new ArrayList<>(asList("Albert", "Irene", "Maria", "Carles"
                , "Xavi", "Joan", "Antonio"));

        List<String> nombres2 = nombres.stream().filter((name) ->
                                    name.toLowerCase().contains("o") && name.length()>5).toList();

        nombres2.forEach(System.out::println);


    }
}
