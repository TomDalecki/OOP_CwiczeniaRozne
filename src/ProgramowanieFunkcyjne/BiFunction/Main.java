package ProgramowanieFunkcyjne.BiFunction;

import java.util.function.BiFunction;

//Przymuje dwa typy wejściowe, zwraca jeden parametr wyjściowy
public class Main {
    public static void main(String[] args) {
        BiFunction<Dog, Cat, String> biFunction = (dog, cat) -> {
            System.out.println("Przyjmuję kota i psa");
            String someMouse = dog.toString().concat(cat.toString());
            return someMouse;
        };

    }

    public class Dog {
    }

    public class Cat {
    }
}
