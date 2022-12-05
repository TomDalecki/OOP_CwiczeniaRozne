package ProgramowanieFunkcyjne.BinaryOperator;

import java.util.function.BinaryOperator;
//Przyjmuje dwa parametry wejściowe a na wyjsciu mamy jeden, wszsytkie są tego samego typu
public class Main {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1.concat(str2);
        binaryOperator.apply("Some type example one", "Some type example two");
    }
}
