package Nivell2.Ex3.Main;

import Nivell2.Ex3.Modules.Calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static Nivell2.Ex3.Modules.Input.*;


public class Main {

    public static final Scanner input = new Scanner(System.in);
    static final Calculator sum = (float x, float y) -> {return x+y;};
    static final Calculator rest = (float x, float y) -> {return x-y;};
    static final Calculator mult = (float x, float y) -> {return x*y;};
    static final Calculator div = (float x, float y) -> {return x/y;};
    public static final ArrayList<String> operations = new ArrayList<>(Arrays.asList("+", "*", "/", "-"));

    public static void main(String[] args) {

        float n1;
        String operand = null;
        float n2 = -1;
        float result = 0;

            printScreen();

            n1 = askNumber();
            printScreenInfo(n1, operand, n2, result);

            operand = askOperation();
            printScreenInfo(n1, operand, n2, result);

            n2 = askNumber();


            if (operand.equals(operations.getFirst())) {
                result = sum.result(n1, n2);
            } else if (operand.equals(operations.get(1))) {
                result = mult.result(n1, n2);
            } else if (operand.equals(operations.get(2))) {
                result = div.result(n1, n2);
            } else {
                result = mult.result(n1, n2);
            }
        printScreenInfo(n1, operand, n2, result);

    }
}
