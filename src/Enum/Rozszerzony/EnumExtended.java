package Enum.Rozszerzony;

public class EnumExtended {
    public static void main(String[] args) {
//wyszukiwanie ENUM po wartości zmiennej (np. wyszukaj ENUMy które w zmiennej mają kolor white)
//29:04 minuta filmu

//Enum wyświetla innego Enuma znajdującego się w tym samym pliku(klasie)
//36:27 minuta filmu

// metoda ordinal() - pozwala sprawdzić na którym miejscu jest dana wartość ENUM
        Volkswagen v4 = Volkswagen.GOLF;
        Volkswagen v5 = Volkswagen.ARTEON;
        System.out.println("metoda ordinal " + v4.ordinal());
        System.out.println("metoda ordinal " + v5.ordinal());

// metoda name()
        System.out.println("metoda name " + v4.name());

// przykład wykorzystania interfejsu w ENUM (użyta klasa EnumUsable zaimplementowana przez Volkswagen)
        System.out.println(Volkswagen.PASSAT.doSomethingUsingEnum());

//porównanie dwóch ENUM
        // Co do zasady Enumy powinny być porównywane przez "==" operator porównania, ale można też przez equals
        //żeby to przećwiczyć trzeba wydzielić metody, inaczej IDE się pluje, wyrzuca warningi

        //Volkswagen v1 = Volkswagen.GOLF; //tak wyglądał kod przed wydzieleniem metody
        Volkswagen v1 = getV1();
        Volkswagen v2 = Volkswagen.ARTEON;
        Volkswagen v3 = Volkswagen.GOLF;

        System.out.println(v1==v2);
        System.out.println(v1.equals(v2));
        System.out.println(v1==v3);
        System.out.println(v1.equals(v3));
    }
    private static Volkswagen getV1(){
        return Volkswagen.GOLF;
    }
}
