package School.People;

import java.util.Scanner;

abstract public class Person {
    String name;
    int age;

    public Scanner scan = new Scanner(System.in);

    public String toString() {
        return "\nName: " + this.name + "\nAge: " + this.age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
