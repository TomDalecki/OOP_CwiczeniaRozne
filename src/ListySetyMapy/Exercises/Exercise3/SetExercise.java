package ListySetyMapy.Exercises.Exercise3;

/*
Napisz program, który stworzy Set z elementami klasy Employee. Employee posiada imię i nazwisko.
Dodaj do Seta kilku pracowników, o tym samym imieniu i nazwisku bez nadpisywania metody
hashCode(), potem zrób to samo z nadpisaną metodą hashCode(). Jaka jest różnica?
 */

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        Set<Employee> employeesSet = new HashSet<>();
        employeesSet.add(new Employee("Dany", "Pies"));
        employeesSet.add(new Employee("Dany", "Pies"));
        employeesSet.add(new Employee("Suzy", "Owca"));
        employeesSet.add(new Employee("Suzy", "Owca"));
        employeesSet.add(new Employee("Rebeca", "Krolik"));
        employeesSet.add(new Employee("Pedro", "Kucyk"));
        employeesSet.add(new Employee("Pedro", "Kucyk"));

        for (Employee employee : employeesSet) {
            System.out.println(employee);
        }

    }

}
