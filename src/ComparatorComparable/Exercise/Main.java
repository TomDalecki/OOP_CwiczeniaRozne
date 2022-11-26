package ComparatorComparable.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Peppa", "Wilk", 33, 6589.4));
        employeeList.add(new Employee("Peppa", "Wilk", 26, 2840.4));
        employeeList.add(new Employee("Peppa", "Swinka", 24, 2580.4));
        employeeList.add(new Employee("Peppa", "Wilk",33 , 4581.4));
        employeeList.add(new Employee("Edmund", "Slon", 36, 3588.4));
        employeeList.add(new Employee("Pedro", "Kucyk", 50, 8880.4));
        employeeList.add(new Employee("Tata", "Swinka", 61, 7777.4));
        employeeList.add(new Employee("Freddy", "Lis", 33, 4510.4));
        employeeList.add(new Employee("Delfina", "Osiolek", 29, 4450.8));
        employeeList.add(new Employee("Robbie", "Krolik", 21, 2358.7));
        System.out.println(employeeList);

        Collections.sort(employeeList);
        System.out.println(employeeList);


        Comparator<Employee> comparator1 = ((Comparator<Employee>) (o1, o2) -> o2.getName().compareTo(o1.getName()))
        .thenComparing((o1, o2) -> o2.getSureName().compareTo(o1.getSureName()))
                .thenComparing(Employee::getAge)
                .thenComparing(Employee::getSalary);

        employeeList.sort(comparator1);
        System.out.println(employeeList);

        Comparator<Employee> comparator2 = Comparator.comparing(Employee::getName)
        .thenComparing((Employee::getSureName))
        .thenComparing((o1, o2) -> o2.getAge().compareTo(o1.getAge()))
        .thenComparing((o1, o2) -> o2.getSalary().compareTo(o1.getSalary()));
        employeeList.sort(comparator2);
        System.out.println(employeeList);



    }
}
