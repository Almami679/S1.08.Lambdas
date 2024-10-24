package Nivell2.Ex3.Main;


import Nivell2.Ex3.Modules.Calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static Nivell2.Ex3.Modules.Input.*;


public class Main {

    public static final Scanner INPUT = new Scanner(System.in);
    static final Calculator SUM = Float::sum;
    static final Calculator REST = (float x, float y) -> x-y;
    static final Calculator MULT = (float x, float y) -> x*y;
    static final Calculator DIV = (float x, float y) -> x/y;
    public static final ArrayList<String> OPERATIONS = new ArrayList<>(Arrays.asList("+", "*", "/", "-"));

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


            if (operand.equals(OPERATIONS.getFirst())) {
                result = SUM.result(n1, n2);
            } else if (operand.equals(OPERATIONS.get(1))) {
                result = MULT.result(n1, n2);
            } else if (operand.equals(OPERATIONS.get(2))) {
                result = DIV.result(n1, n2);
            } else {
                result = REST.result(n1, n2);
            }
        printScreenInfo(n1, operand, n2, result);

    }
}
