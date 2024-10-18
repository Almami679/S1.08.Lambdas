package Nivell2.Ex2.Main;

import Nivell2.Ex2.Modules.Sort;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<> (Arrays.asList
                                    (12,3,48,13,9,99));

        Sort sortNumbers = (numbersList) -> {
            StringBuilder numbersString = new StringBuilder();
            numbersList.forEach((n) -> {
                if(!numbersString.isEmpty())
                    numbersString.append(", ");
                if(n%2 == 0)
                    numbersString.append("e").append(n);
                else {
                    numbersString.append("o").append(n);
                }

            });
            return String.valueOf(numbersString);
        };

        System.out.println(sortNumbers.printed(numbers));
    }
}
