package ProgramowanieFunkcyjne.Consumer;

import ProgramowanieFunkcyjne.MethodReference.withStaticMethod.ICar;

import java.util.function.Consumer;

//Consumer - przyjmuje jeden parametr i nic nie zwraca
//typem zwracanym jest void
//metoda używana przez consumer to accept
//jezeli w ciele metody bedą nawiasy to nie musimy uzywać return bo nic consumer nie zwraca
public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer1 = input -> System.out.println("consumer1: " + input);
        consumer1.accept("Zakopane");

        Consumer<String> consumer2 = input -> {
            System.out.println("consumer2: Calling accept");
            System.out.println(input);
        };
        consumer2.accept("Zakopane");

// consumer with method reference - przykład 1
        Consumer<String> consumer3 = System.out::println;
        consumer3.accept("Zakopane");

// consumer with method reference - przykład 2
        Consumer<String> consumer4 = Main::printSomething;
        consumer4.accept("Zakopane");
    }

    private static void printSomething(String input) {
        System.out.println("consumer4: Calling accept");
        System.out.println(input);
    }
}
