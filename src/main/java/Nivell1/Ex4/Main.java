package Nivell1.Ex4;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {

        String [] months = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio"
                , "Julio", "Agosto", "Septiembre", "Octubre", "Nomviembre", "Diciembre"};

        ArrayList<String> monthsInArray = new ArrayList<>(asList(months));

        monthsInArray.forEach(System.out::println);

    }

}
