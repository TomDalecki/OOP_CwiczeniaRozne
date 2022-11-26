package Lambda.Exercises.PredicateExercises;

import java.util.function.Predicate;

public class PredicateExercises {
    public static void main(String[] args) {
//        Predicate<Integer> exercise1 = (a)-> a > 0;
//        System.out.println(exercise1);
//        System.out.println(exercise1.test(1));

        System.out.println(exercise2.test("ozon"));
        
    }


    static  Predicate<String> exercise2 = (a)-> a.contains("z");
    static Comparable<Integer> exercise3 = (a)-> a.compareTo(2);

}
