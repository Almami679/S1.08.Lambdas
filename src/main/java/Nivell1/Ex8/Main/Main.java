package Nivell1.Ex8.Main;

import Nivell1.Ex8.Modules.Exe;


public class Main {

    public static void main(String[] args) {
        Exe reverseMethod = (String word) -> {
            StringBuilder reverseWord = new StringBuilder();
            for (int c = (word.length() - 1); c >= 0; c--) {
                reverseWord.append(word.charAt(c));
            }
            return reverseWord.toString();
        };


        System.out.println(reverseMethod.reverse("ITAcademy"));

    }
}




