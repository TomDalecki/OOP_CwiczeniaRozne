package ProgramowanieFunkcyjne.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> someCities = new ArrayList<>();
        someCities.add("Katowice");
        someCities.add("Gliwice");
        someCities.add("Bytom");
        someCities.add("Zabrze");

        Predicate<String> predicate1 = somCit -> somCit.contains("e");

        findCity(someCities, cit -> cit.contains("a"));
        findCity(someCities, predicate1);
        findCity(someCities, Main::stringTest);



        for (String someCity : someCities) {
            if (predicate1.test(someCity)) {
                System.out.println("predicateFromMain: " + someCity);
            }
        }
    }
    private static boolean stringTest (String input){
        System.out.println("Predicate with method reference:");
        return input.contains("w");
    }

    private static void findCity(List<String> someCities, Predicate<String> predicate) {
        for (String city : someCities) {
            if (predicate.test(city)) {
                System.out.println("predicateFromMethod: " + city);
            }
        }
    }

}
