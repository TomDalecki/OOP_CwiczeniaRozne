package Lambda.Exercises.Exercise3;
/*
Stwórz interface funkcyjny z metodą przyjmującą int, int oraz String i zwracającą String.
Zaimplementuj ten interface przy wykorzystaniu lambdy. Spróbuj zapisać lambdę na parę
pokazanych sposobów.
 */
public class Main {
    public static void main(String[] args) {
        FamilyFuncInterf familyFuncInterf = ((noOfChildren, noOfPets, name) -> {return "We are " + name + " family, and we have "
        + noOfChildren + " children and " + noOfPets + " pets.";});

        System.out.println(familyFuncInterf.familyMembers(2, 5, "Kowalscy"));

    }
}
