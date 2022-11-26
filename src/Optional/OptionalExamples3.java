package Optional;

import Exceptions.MyException;

import java.util.Optional;

public class OptionalExamples3 {
    public static void main(String[] args) {
// Optional i rzucanie wyjatkami
        Optional<String> caseEmpty = Optional.empty();
        Optional<String> caseOfNotEmpty = Optional.of("Hello");
        Optional<String> caseOfNullableIsNullOrNotNull = Optional.ofNullable(null);

        //caseEmpty.orElseThrow(); //rzuca ten sam wyjatek co w przypadku caseEmpty.get()
        //caseEmpty.orElseThrow(()-> new RuntimeException("Empty value"));

//mam jakąś metodę i gdy wynik jest null to rzucam Exception i kończę wykonanie algorytmu
        Optional<String> result = Optional.ofNullable(someMethod());
        result.orElseThrow();


    }
static String someMethod(){
        return null;
}
}
