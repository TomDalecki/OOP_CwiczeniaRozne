package Lambda.Predykat;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//Predykat jest interfejsem funkcyjnym dostarczanym przez Java
//Predykat posiada metodę abstrakcyjną "test"
//Predykat zwraca wartość boolean

public class Main {
    public static void main(String[] args) {
        Predicate<String> mojIfEmptyFilterPredicate = zmienna -> zmienna.isEmpty(); //Predykat zwraca boolean

        mojIfEmptyFilterPredicate.test("wartość zmiennej"); //metoda abstrakcyjna Predykatu to "test"
        System.out.println(mojIfEmptyFilterPredicate.test("abc"));

//Predykat wykorzystany w metodzie removeIf (metoda dedykowana dla Predykatu)
        List<String> list = new ArrayList<>();
        list.add("Wroclaw");
        list.add("Chorzow");
        list.add("");
        list.add("Katowice");
        System.out.println(list);

        list.removeIf(mojIfEmptyFilterPredicate);
        System.out.println(list);

    }
}
