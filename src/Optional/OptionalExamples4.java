package Optional;

import java.util.Optional;

public class OptionalExamples4 {
    public static void main(String[] args) {
// Optional i Lambda
        Optional<String> caseEmpty = Optional.empty();
        Optional<String> caseOfNotEmpty = Optional.of("Hello");
        Optional<String> caseOfNullableIsNullOrNotNull = Optional.ofNullable(null);

        Optional<String> someValue = someMethod();
//        someValue.ifPresent(element -> System.out.println("wynik z lambda: " + element)); //interfejs Consumer - element który jest w środku, wydrukuj mi ten element
//        //to powyżej jest równoważne temu:
//        if(someValue.isPresent()){
//            System.out.println("wynik z if: " + someValue.get());
//        }

        //someValue.ifPresentOrElse(element-> System.out.println("notEmpty"), someMethod2());
        caseEmpty.ifPresentOrElse(element-> System.out.println("notEmpty"), ()-> System.out.println("Empty"));
        caseOfNotEmpty.ifPresentOrElse(element-> System.out.println("notEmpty"), ()-> System.out.println("Empty"));
        caseOfNullableIsNullOrNotNull.ifPresentOrElse(element-> System.out.println("notEmpty"), ()-> System.out.println("Empty"));
        someValue.ifPresentOrElse(element-> System.out.println("notEmpty"), ()-> System.out.println("Empty"));


    }
    private static Optional<String> someMethod(){
        return null;
    }

    private static Runnable someMethod2(){
        System.out.println("jestem w someMethod2");
        return null;
    }
}
