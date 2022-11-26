package Optional;

import java.util.Optional;

public class OptionalExamples2 {
    public static void main(String[] args) {
// metody orElse, orElseGet w zależności od stanu Optionala (null, notnull)

        Optional<String> caseEmpty = Optional.empty();
        Optional<String> caseOfNotEmpty = Optional.of("Hello");
        Optional<String> caseOfNullableIsNullOrNotNull = Optional.ofNullable(null);

        String variable = caseEmpty.orElse("Jakiś default komunikat"); //metoda orElse na null wyrzuci mój komunikat
        System.out.println(variable);
            System.out.println("caseEmpty:");
        String variable1 = caseEmpty.orElse(someMethod2());
        String variable2 = caseEmpty.orElseGet(()->someMethod3()); //interfejs Supplier, nie może przyjmować żadnych argumentów na wejściu, ale musi cos zwracać
            System.out.println("caseOfNotEmpty:");
        String variable3 = caseOfNotEmpty.orElse(someMethod2());
        String variable4 = caseOfNotEmpty.orElseGet(()->someMethod3()); //interfejs Supplier, nie może przyjmować żadnych argumentów na wejściu, ale musi cos zwracać
            System.out.println("caseOfNullableIsNullOrNotNull:");
        String variable5 = caseOfNullableIsNullOrNotNull.orElse(someMethod2());
        String variable6 = caseOfNullableIsNullOrNotNull.orElseGet(()->someMethod3()); //interfejs Supplier, nie może przyjmować żadnych argumentów na wejściu, ale musi cos zwracać

//        System.out.println("variable2: " + variable2);
//        System.out.println("variable3: " + variable3);
    }
    private static String someMethod2() {
        System.out.println("Metoda statyczna someMethod2 została wywołana");
        return "returnSomething";
    }
    private static String someMethod3() {
        System.out.println("Metoda statyczna someMethod3 została wywołana");
        return "returnSomething";
    }
}
