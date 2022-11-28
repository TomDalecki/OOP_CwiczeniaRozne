package Generics.exercises.exercise3;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 4, 7, 22, 11, 3, 5);
        EvenNumbers(integers);
        OddNumbers(integers);

        System.out.println("Generics + Predicate: " + getCountIf(integers, element -> element % 2 == 0 ));
        System.out.println("Generics + Predicate: " + getCountIf(integers, element -> element % 2 != 0 ));
    }

    public static <T> Integer getCountIf(Collection<T> collection, Predicate<T> predicate) {
        int counter = 0;
        for (T elem : collection) {
            if(predicate.test(elem)){
                counter++;
            }
        }
        return counter;
    }

    public static void EvenNumbers (List<Integer> list){
        int evenCounter = 0;
        for (Integer integer : list) {
            if(integer % 2 == 0){
            evenCounter++;
            }
        }
        System.out.println("Number of even numbers: " + evenCounter);
    }

    public static void OddNumbers (List<Integer> list){
        int oddCounter = 0;
        for (Integer integer : list) {
            if(integer % 2 != 0){
            oddCounter++;
            }
        }
        System.out.println("Number of even numbers: " + oddCounter);
    }
}