package Nivell3.Ex1.Modules;

public class Alumne {

    private String name;
    private int age;
    private String curs;
    private double note;

    public Alumne(String name, int age, String curs, double note) {

        this.name = name;
        this.age = age;
        this.curs = curs;
        this.note = note;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getCurs() {
        return this.curs;
    }

    public double getNote() {
        return this.note;
    }

    public String toString() {
        return "Alumno: " + this.name + "(" + this.age + " años)     " +
                " curso:" + this.curs + " (" + this.note + " nota final";
    }
}
