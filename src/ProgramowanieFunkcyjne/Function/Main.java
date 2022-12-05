package ProgramowanieFunkcyjne.Function;

import java.util.function.Function;

public class Main {
//Function przyjmuje jeden typ i zwraca taki sam typ lub jakiś inny typ
//Function<T - type, R - return>
    public static void main(String[] args) {
        Function<Car, String> function = (car) -> car.toString();
    }
static class Car{}
}

