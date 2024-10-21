package Nivell1.Ex1;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        ArrayList<String> nombres = new ArrayList<>(Arrays.asList
                ("Albert", "Irene", "Maria", "Carles", "Xavi", "Joan", "Antonio"));

        nombres.forEach( (nom) -> {if(nom.toLowerCase().contains("o")) System.out.println(nom);});


    }
}