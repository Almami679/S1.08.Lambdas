package Nivell2.Ex1.Main;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList
                ("Ali", "Arnau", "Ame", "Marcel", "Irene"));

    List<String> names2 = names.stream().filter((name) -> name.length()==3 && name.startsWith("A")).toList();
    names2.forEach(System.out::println);
    }
}