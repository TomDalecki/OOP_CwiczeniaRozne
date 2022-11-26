package Lambda.Exercises.Exercise1;
/*
Stwórz interface funkcyjny z metodą przyjmującą int i zwracającą String. Zaimplementuj ten
interface przy wykorzystaniu lambdy. Spróbuj zapisać lambdę na parę pokazanych sposobów.
 */
public class Main {
    public static void main(String[] args) {
        CanJump canJump1 = length -> "Potrafię skoczyć " + length;
        CanJump canJump2 = length -> {return "Potrafię skoczyć " + length + " metrów";};
        CanJump canJump3 = (length) -> "Potrafię skoczyć " + length + " metrów";
        CanJump canJump4 = (length) -> {return "Potrafię skoczyć " + length + " metrów";};
        CanJump canJump5 = (int length) -> "Potrafię skoczyć " + length + " metrów";
        CanJump canJump6 = (int length) -> {return "Potrafię skoczyć " + length + " metrów";};



        System.out.println(canJump1.jump(1));
        System.out.println(canJump2.jump(5));
        System.out.println(canJump3.jump(7));
        }
    }


