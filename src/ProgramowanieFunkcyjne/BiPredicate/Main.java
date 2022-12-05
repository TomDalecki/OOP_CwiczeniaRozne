package ProgramowanieFunkcyjne.BiPredicate;

import java.util.function.BiPredicate;
//Przyjmuje dwa parametry
//Na wyjściu jest boolean
//Korzysta z metody test
public class Main {
    public static void main(String[] args) {
        BiPredicate<Integer, String> biPredicate = (x, y)-> y.contains(x.toString());
        boolean result = biPredicate.test(5, "Some string");
        System.out.println(result);
    }
}
