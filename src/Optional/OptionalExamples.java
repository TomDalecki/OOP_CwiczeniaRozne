package Optional;
import java.util.Optional;
//wprowadzony w Java8
//klasa która powoduje że nie musisz zwracać null, pomimo że po wykonaniu jakiejś metody zwrócony byłby null
//null powoduje problemy np. NullPointerException itp.
public class OptionalExamples {
    public static void main(String[] args) {
    //najprostsze inicjalizowanie Optional, który na pewno jest pusty
        Optional<String> op1 = Optional.empty();
        System.out.println("Optional.empty(): " + op1);
    //inicjalizowanie Optional który na pewno nie jest pusty
        Optional<String> op2 = Optional.of("Something");
        System.out.println("Optional.of(): " + op2);
    //inicjalizowanie Optional który dopuszcza mozliwość wpadnięcia null
        Optional<String> op3 = Optional.ofNullable(null);
        System.out.println("Optional.ofNullable(): " + op3);

//    co można dalej z Optional robić żeby je używać
        Optional<String> caseEmpty = Optional.empty();
        Optional<String> caseOfNotEmpty = Optional.of("Hello");
        Optional<String> caseOfNullableIsNullOrNotNull = Optional.ofNullable(null);

        System.out.println("isEmpty(): " + caseEmpty.isEmpty());
        System.out.println("isPresent()" + caseEmpty.isPresent());

        System.out.println("isEmpty(): " + caseOfNotEmpty.isEmpty());
        System.out.println("isPresent()" + caseOfNotEmpty.isPresent());

        System.out.println("isEmpty(): " + caseOfNullableIsNullOrNotNull.isEmpty());
        System.out.println("isPresent()" + caseOfNullableIsNullOrNotNull.isPresent());

        if(caseOfNotEmpty.isPresent()){
            String variable = caseOfNotEmpty.get();
            System.out.println(variable);
        }

//      String variable = empty.get(); //wywołanie na empty rzuci wyjątkiem


        System.out.println("Optional.empty: " + someMethod());
    }


    public static Optional<String> someMethod(){
        return Optional.empty();
}

}
