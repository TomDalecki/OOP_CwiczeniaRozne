package Lambda.Exercises.Exercise4;
/*
Dla porównania, zaimplementuj interface z poprzedniego ćwiczenia przy wykorzystaniu klasy
implementującej interface, a nie lambdy.
Poprzednie ćwiczenie:
Stwórz interface funkcyjny z metodą przyjmującą int, int oraz String i zwracającą String.
Zaimplementuj ten interface przy wykorzystaniu lambdy. Spróbuj zapisać lambdę na parę
pokazanych sposobów.
 */
public class Main {
    public static void main(String[] args) {

//wersja moja
    Family family = new Family();
    System.out.println(family.familyMembers2(3,1, "PrawiPolacy"));

//wersja z przykładowego rozwiązania
    FamilyFuncInterf2 familyFuncInterf2 = new Family();
    System.out.println(familyFuncInterf2.familyMembers2(5,4,"Wielodzietni"));


//Lambda
    System.out.println("Lambda:");
    FamilyFuncInterf2 familyFuncInterf3 = ((noOfChildren, noOfPets, name) -> {return "We are " + name + " family, and we have "
    + noOfChildren + " children and " + noOfPets + " pets.";});
    System.out.println(familyFuncInterf3.familyMembers2(3, 2, "Nowakowie"));

    }
}
