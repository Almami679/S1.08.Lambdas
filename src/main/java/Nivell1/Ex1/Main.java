package Nivell1.Ex1;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String [] nombresSinArray = {"Albert", "Irene", "Maria", "Carles", "Xavi", "Joan", "Antonio"};

        ArrayList<String> nombres = new ArrayList<>(Arrays.asList(nombresSinArray));
        nombres.forEach( (nom) -> {if(nom.toLowerCase().contains("o")) System.out.println(nom);});


    }
}