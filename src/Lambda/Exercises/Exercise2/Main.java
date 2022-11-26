package Lambda.Exercises.Exercise2;
/*
Stwórz interface funkcyjny z metodą przyjmującą int i String i zwracającą String. Zaimplementuj ten
interface przy wykorzystaniu lambdy. Spróbuj zapisać lambdę na parę pokazanych sposobów.
 */

public class Main {
    public static void main(String[] args) {
        AnimalInfoFunctionalInterface animalInfoFunctionalInterface = (noLegs, name) -> "I'm annimal with " + noLegs
                + " legs and my name is " + name;

        AnimalInfoFunctionalInterface animalInfoFunctionalInterface2 = (noLegs, name) -> { return "I'm annimal with " + noLegs
                + " legs and my name is " + name;};

        System.out.println(animalInfoFunctionalInterface.animalInfo(2, "Eagle"));
        System.out.println(animalInfoFunctionalInterface2.animalInfo(4, "Lion"));

    }
}
