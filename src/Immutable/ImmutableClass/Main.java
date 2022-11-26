package Immutable.ImmutableClass;

public class Main {
    public static void main(String[] args) {
//klasa String jest defaultowo immutable
        String a = "abc";
        a.replace("a", "g"); //to nie zadziała
        System.out.println(a);
//ale da się przypisac nowy obiekt
        a = "ggg";
        System.out.println(a);

//żeby całkowice zabezpieczyć String przed zmianą trzeba dodac final

        final String b = "fff";
//        b = "ggg"; //tu od razu kod sie nie kompiluje
        System.out.println(b);

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//Immutable klasa Car
        Car car = new Car("Red", true);
// tylko można pobrać informację o kolorze i dachu
        car.getColor();
        car.isRoofIsOpen();
        System.out.println(car);
        System.out.println(car.hashCode());

//w tym momencie tworzymy nowy obiekt, a nie zmieniamy stanu tego starego
        car = new Car("Blue", false);

        System.out.println(car);
        System.out.println(car.hashCode());

//poniższy zapis sprawiłby że dodatkowo referencja car nie mogłabybyć przypisana do innego obiektu
//        final Car car = new Car("Red", true);
    }
}
