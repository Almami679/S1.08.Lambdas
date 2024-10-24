package Nivell1.Ex1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        ArrayList<String> nombres = new ArrayList<>(Arrays.asList
                ("Albert", "Irene", "Maria", "Carles", "Xavi", "Joan", "Antonio"));


        List<String> namesWithO = nombres.stream().filter((name) -> name.toLowerCase().contains("o")).toList();
        namesWithO.forEach(System.out::println);
    }
}