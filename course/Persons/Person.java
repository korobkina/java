package eiden.persons;
import java.util.Scanner;

public class Person {
    protected int age;
    protected String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person(String name) {

        this(0, name);
    }

    public int getAge() {

        return age;
    }

    public String getName() {

        return name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 200) {
            throw new IllegalArgumentException("Illegal age setting: " + age);
        }

        this.age = age;
    }

    public void setName(String name) {

        this.name = name;
    }
}

