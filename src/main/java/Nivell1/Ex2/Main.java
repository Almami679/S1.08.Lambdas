package Nivell1.Ex2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> filter = new ArrayList<>();

        String [] nombresSinArray = {"Albert", "Irene", "Maria", "Carles", "Xavi", "Joan", "Antonio"};

        ArrayList<String> nombres = new ArrayList<>(Arrays.asList(nombresSinArray));
        nombres.forEach( (nom) -> {if(nom.toLowerCase().contains("o") && nom.length()>5)
                                filter.add(nom);});
        filter.forEach((nom) -> System.out.println(nom));


    }
}
