package Nivell1.Ex8.Main;

import Nivell1.Ex8.Modules.Exe;


public class Main {

    public static void main(String[] args) {
        Exe reverseMethod = word -> {
            StringBuilder reverseWord = new StringBuilder(word).reverse();
            return reverseWord.toString();
        };


        System.out.println(reverseMethod.reverse("ITAcademy"));

    }
}




