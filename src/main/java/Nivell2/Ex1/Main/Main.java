package Nivell2.Ex1.Main;

import Nivell2.Ex1.Modules.Sort;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<> (Arrays.asList
                                    ("Ali", "Arnau", "Ame", "Marcel", "Irene"));

        Sort by3lettersAndA = (namesList) -> {
            ArrayList<String> selected = new ArrayList<>();
            namesList.forEach((name) -> {
                if (name.length() == 3 &&
                        String.valueOf(name.charAt(0)).equals("A"))
                    selected.add(name);

            });
            return selected;
        };

        by3lettersAndA.sorted(names).forEach(System.out::println);
    }
}
