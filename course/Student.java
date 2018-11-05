package eiden.persons;

public class Student extends Person {
    protected int hateLevel;

    public  Student (int age, String name, int hateLevel) {
        super(age, name);
        this.hateLevel = hateLevel;

    }
    public  Student (int age, String name) {
        this(age, name, 0);

    }
    public int getHateLevel () {

        return hateLevel;
    }

    public void setHateLevel(int hateLevel) {
        if (hateLevel < 0 || hateLevel > 100) {
            throw new IllegalArgumentException("Illegal hateLevel setting: " + hateLevel);
        }
        this.hateLevel = hateLevel;
    }


}
