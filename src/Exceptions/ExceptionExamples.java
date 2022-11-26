package Exceptions;
// wyjątki to rodzaj błędu w programie,
// wyjątki w przeciwieństwie do errorów, można przechwycić i obsłuży.
// errory są nie do złapania i nie do obsłużenia, error wywala całkowicie program
// co do zasady wyjątki przerywają działanie programu
// wyjątki dzielą się na RuntimeException i checked Exception(wyjątki sprawdzane na etapie kompilacji)
// wyjątki checked Exception muszą być albo rzucone wyżej "throws" albo obsłużone "try catch"
// wyjątki RuntaimException mogą ale nie muszą być obsłużone
// obiekt o wartości null zawsze wywoła "nullPointException przy próbie wywołania na nim metody
//(wyjątek) metodę statyczną można wywołać na obiekcie z wartościa null - powiedzmy wyjątek którego się nie zobaczy w praktyce

public class ExceptionExamples {
    public static void main(String[] args) throws MyException {

        try {
            printSomething1("ThRoW");
        } catch (MyException e) {
            System.out.println("aaaa");
            throw new MyException();
        }

        printSomething1("something");
    }
    private static void printSomething1(final String input) throws MyException {
        printSomething4(input);
    }

    private static void printSomething4(final String input) throws MyException {
        if ("Throw".equalsIgnoreCase(input)){
            throw new MyException();
        }    else {
            System.out.println(input);
            }

    }



}
