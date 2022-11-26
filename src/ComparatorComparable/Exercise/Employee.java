package ComparatorComparable.Exercise;

import org.jetbrains.annotations.NotNull;

public class Employee implements Comparable<Employee> {
    String name;
    String sureName;
    Integer age;
    Double salary;

    public Employee(String name, String sureName, Integer age, Double salary) {
        this.name = name;
        this.sureName = sureName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(@NotNull Employee element) {
        int nameSorting = this.name.compareTo(element.name);
        if (nameSorting != 0) {
            return nameSorting;
        }

        int sureNameSorting = this.sureName.compareTo(element.sureName);
        if (sureNameSorting != 0) {
            return sureNameSorting;
        }

        int ageSorting = this.age.compareTo(element.age);
        if (ageSorting != 0) {
            return ageSorting;
        }

        return this.salary.compareTo(element.salary);
    }

    @Override
    public String toString() {
        return name + " " +
                sureName + " " + " age: " +
                age + " " + " salary: " +
                salary;
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

    public Integer getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }
}
