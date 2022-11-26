package ListySetyMapy.Exercises.Exercise2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/*
Napisz program, który losowo zamieni kolejność elementów w podanej liście. Do osiągnięcia efektu
losowości spróbuj wykorzystać klasę Random.
 */
public class ListExercise {
    public static void main(String[] args) {
        Random random = new Random();

        List<String> someList = new ArrayList<>();
        someList.add("Wendy Wilk");
        someList.add("Pedro Kucyk");
        someList.add("Peppa Swinka");
        someList.add("Danny Pies");

        System.out.println(someList);

        for (int i = 0; i < someList.size(); i++) {
            String listElement = someList.get(i);
            int j = random.nextInt(someList.size());
            System.out.println(j);
            String listElement2 = someList.get(j);
            someList.set(j, listElement);
            someList.set(i, listElement2);
            //System.out.println(someList);
        }
        System.out.println(someList);
    }
}
