package ProgramowanieFunkcyjne.MethodReference.withStaticMethod;
// 1. na podstawie Interfejsu Funkcyjnego robimy implementację poprzez Lambda
// 2. z ciała Lambdy wyodrębniamy metodę - tutaj printSomething. IntelliJ skraca nam zapis
//       i proponuje zapisać jeszcze jako method reference
// 3. w miejce Lambda wpisujemy NazwaKlasy::nazwaMetody
// żeby można było zrobić taki zapis do zarówno interfejs jak i metoda muszą przyjmować pararmetry tego samego typu, np. String

public class Main {
    public static void main(String[] args) {
//ad.1
        //ICar iCar = caNa -> System.out.println("Jadę samochodem " + caNa);

//ad.2
        //ICar iCar = caNa -> printSomething(caNa);

//ad.3
        ICar iCar = Main::printSomething;
        iCar.drive("Opel");
    }

    private static void printSomething(String caNa) {
        System.out.println("Jadę samochodem " + caNa);
    }

}
