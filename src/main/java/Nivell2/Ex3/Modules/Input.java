package Nivell2.Ex3.Modules;

import java.util.InputMismatchException;

import static Nivell2.Ex3.Main.Main.input;
import static Nivell2.Ex3.Main.Main.operations;

public class Input {
    public static final String scrn = "+-----------------------------+";
    public static final String nums = "\n+-----------------------------+\n" +
            "| [ 1 ]  [ 2 ]  [ 3 ]   [ + ] |\n" +
            "| [ 4 ]  [ 5 ]  [ 6 ]   [ - ] |\n" +
            "| [ 7 ]  [ 8 ]  [ 9 ]   [ * ] |\n" +
            "|        [ 0 ]          [ / ] |\n" +
            "+-----------------------------+\n";

    public static float askNumber() {
        float n = -1;
        do {
            try {
                n = input.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Invalid format");
            }
        } while(n < 0);
        return n;
    }

    public static String askOperation() {
        String operand = "";
        do {
            operand = input.next();
            System.out.println("Invalid Operation");
        } while(!operations.contains(operand));
        return operand;
    }

    public static void printScreen() {
        System.out.println(scrn + "\n" + nums);
    }

    public static void printScreenInfo(float n1, String operation, float n2, float result) {
        if (operation == null) {
            System.out.println(scrn + "\n" + n1 + nums);
        } else if (n2 == -1) {
            System.out.println(scrn + "\n" + n1 + "  " + operation + nums);
        } else {
            System.out.println(scrn + "\n" + n1 + "  " + operation +
                            "  " + n2 + "  " + "=" + "  " + result + nums );
        }
    }

}
