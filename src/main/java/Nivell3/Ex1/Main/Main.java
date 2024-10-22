package Nivell3.Ex1.Main;


import Nivell3.Ex1.Modules.Alumne;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main (String[] args) {

        ArrayList<Alumne> alumnos = new ArrayList<Alumne>(Arrays.asList(
                new Alumne("Carlos Chacon", 28, "PHP", 8.1),
                new Alumne("Carla Gutierrez ", 17, "Java", 9.3),
                new Alumne("Maria Arneda", 32, "PHP", 4.1),
                new Alumne("Armando Osuna", 34, "PHP", 6.3),
                new Alumne("Cristofor Pain", 42, "Java", 7.2),
                new Alumne("Irene Marin", 31, "Java", 3.4),
                new Alumne("Ariel Gimenez", 26, "PHP", 9.6),
                new Alumne("Cristina Alfonso", 17, "Java", 5.1),
                new Alumne("Marti Robles", 28, "PHP", 2.5),
                new Alumne("Rosi Galindo", 50, "Java", 5.7)));

        System.out.println("\n\nNombre y edad de cada alumno:\n" +
                "--------------------------------------------");

        alumnos.forEach((alumno) -> System.out.println("- " + alumno.getName() +
                                                        " (" + alumno.getAge() + " años)" ));



        System.out.println("\n\nLista de alumnos que su nombre empieza por la letra 'A':\n" +
                "--------------------------------------------");

        List<Alumne> alumnos2 = alumnos.stream().filter(alumno ->
                            alumno.getName().toLowerCase().startsWith("a")).toList();

        alumnos2.forEach(System.out::println);



        System.out.println("\n\nAlumnos con notas iguales o superiores a 5:\n" +
                "--------------------------------------------");

        alumnos.stream().filter(alumno -> alumno.getNote()>=5).forEach(System.out::println);


        System.out.println("\n\nAlumnos con nota de 5 o superior y que cursan PHP:\n" +
                "--------------------------------------------");

        alumnos.stream().filter(alumno-> alumno.getNote()>=5 &&
                            alumno.getCurs().equalsIgnoreCase("php")).
                                                            forEach(System.out::println);


        System.out.println("\n\nAlumnos mayores de edad que cursan JAVA:\n" +
                "--------------------------------------------");

        alumnos.stream().filter(alumno -> alumno.getAge()>=18 &&
                                alumno.getCurs().equalsIgnoreCase("java"))
                                                                .forEach(System.out::println);
    }
}
