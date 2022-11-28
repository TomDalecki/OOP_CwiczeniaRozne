package Generics.genericInterface;

public class Main {
    public static void main(String[] args) {
//dwa sposoby implementacji interfejsu generycznego

//wywołanie typu występującego w generyku zostało zrealizowane na etapie tworzyenia klasy
        SomeImplementingClass someImplementingClass = new SomeImplementingClass();

//wywołanie typu występującego w generyku na etapie tworzyenia instancji klasy
        SomeGenericClass<Car> someGenericClass = new SomeGenericClass<>();

    }
}
