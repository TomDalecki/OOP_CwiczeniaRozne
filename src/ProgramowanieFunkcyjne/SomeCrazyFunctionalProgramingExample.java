package ProgramowanieFunkcyjne;

public class SomeCrazyFunctionalProgramingExample {
    public static void main(String[] args) {
        ISomeInterface iSomeInterface = someStaticMethod(input -> System.out.println(input));
        iSomeInterface.someMethod("Other string");
    }

    static ISomeInterface someStaticMethod(ISomeInterface function) {
        System.out.println("Jestem w metodzie someStaticMethod");
        function.someMethod("Some string");
        return(otherInput)-> System.out.println("returned: " + otherInput);
    }

    @FunctionalInterface
    interface ISomeInterface {
        void someMethod(String input);
    }

}
