package ProgramowanieFunkcyjne.UnaryOperator;

import java.util.function.UnaryOperator;

public class Main {
// UnaryOperator - funkcja UO przyjmuje jeden typ, zwraca ten sam typ
// dziedziczy Function
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = str -> str.concat(str);
        unaryOperator.apply("Some for example string");
    }
}
