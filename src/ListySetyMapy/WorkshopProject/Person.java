package ListySetyMapy.WorkshopProject;

import java.util.Objects;

public class Person {
    private final String name;
    private final String sureName;
    private final int counter;

    public Person(String name, String sureName, int counter) {
        this.name = name;
        this.sureName = sureName;
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return counter == person.counter && Objects.equals(name, person.name) && Objects.equals(sureName, person.sureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sureName, counter);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", counter=" + counter +
                '}';
    }
}
