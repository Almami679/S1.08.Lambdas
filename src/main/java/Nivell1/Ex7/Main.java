package Nivell1.Ex7;

import java.util.ArrayList;
import java.util.Comparator;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>
                            (asList("Maria", "Casa", "avioneta", "-4", "6", "3.15"));

        items.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

    }

}

