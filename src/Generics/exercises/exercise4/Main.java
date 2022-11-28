package Generics.exercises.exercise4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"Dog", "Cat", "Elephant", "Eagle", "Monkey"};
        Integer[] integers = {5, 22, 8, 7, 25};

        System.out.println(Arrays.toString(strings));
        replaceInTable(strings, 0, 2);
        System.out.println(Arrays.toString(strings));

        System.out.println(Arrays.toString(integers));
        replaceInTable(integers, 4, 2);
        System.out.println(Arrays.toString(integers));

    }
public static <T> void replaceInTable (T[] element, int x, int y){

    if (x > element.length || y > element.length) {
        System.out.println("Position x or y is too big");
        return;
    }
    T temp = element[x];
        element[x] = element[y];
        element[y] = temp;
        }
}
