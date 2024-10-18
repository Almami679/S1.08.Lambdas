package Nivell1.Ex6;

import java.util.ArrayList;
import java.util.Comparator;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Object> items = new ArrayList<>
                            (asList("Maria", "Casa", "avioneta", true, -4, 6, 3.15));

        items.sort(Comparator.comparing(item -> {
            if (item instanceof String) {
                return ((String) item).length();
            }
            return 0;
        }));
         items.forEach(System.out::println);

    }

}

