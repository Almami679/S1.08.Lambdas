package Nivell2.Ex4.Modules;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Functions {

    public static void orderByAlfabet(ArrayList<String> list){
        list.sort(Comparator.comparingInt(string -> string.charAt(0)));

    }

    public static void firstWithE(ArrayList<String> list) {
        list.sort((string1, string2) -> Boolean.compare(string2.toLowerCase().contains("e")
                                                            , string1.toLowerCase().contains("e")));
    }

    public static void replaceA(ArrayList<String> list) {
        list.replaceAll(string -> string.replace("a", "[4]"));

    }


    public static List<String> showNums(ArrayList<String> list) {
        return list.stream().filter(string -> string.chars().allMatch(Character::isDigit))
                .toList();
    }
}