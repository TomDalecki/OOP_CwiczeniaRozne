package Lambda.Examples.Example2;

import Lambda.Examples.Example1.Animal;

import java.util.List;

public class LambdaExamples2 {
    public static void main(String[] args) {
        List<Animal> animals = List.of(new Animal("dog", false, true),
                new Animal("cat", false, true),
                new Animal("bird", true, false) );

        //implementacja poprzez Lambda metody contains
        print(animals, (text, toCheck, printIfFailed) -> {
            if (text.contains(toCheck)){
                return true;
            } else {
                System.out.println(printIfFailed);
                return false;}
        });

        //alternatywny zapis tej metody Lambda
        print(animals, (text, toCheck, printIfFaild) -> text.contains(toCheck));


    }
    private static void print(final List<Animal> animals, final Containable containable){
        for (Animal animal : animals) {
            if (containable.contains(animal.getName(), "og", "Doesn't contain")) {
                System.out.println(animal);
            }}}
}
