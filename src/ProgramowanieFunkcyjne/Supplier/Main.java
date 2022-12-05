package ProgramowanieFunkcyjne.Supplier;

import java.util.function.Supplier;

public class Main {
// Supplier nic nie przyjmuje i zwraca jakis typ
// uzywa metody get
// nie ma BiSupplier
    public static void main(String[] args) {
        Supplier<Integer> supplier1 = () -> 123;
        supplier1.get();

        System.out.println(supplier1.get());


        Supplier<Integer> supplier2 = () -> {
            System.out.println("Supply");
            return 123;
        };
        System.out.println(supplier2.get());

        Supplier<Integer> supplier3 = Main::giveMeSomething;
        System.out.println(supplier3.get());

    }
    private static Integer giveMeSomething(){
        return 4567;
    }
}
