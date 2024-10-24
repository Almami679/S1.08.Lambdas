package Nivell1.Ex5.Main;

import Nivell1.Ex5.Modules.PiValue;

public class Main {

    public static void main(String[] args) {

        PiValue number = () -> 3.1415;

        System.out.println("El valor de Pi es: " + number.getPiValue());

    }
}
