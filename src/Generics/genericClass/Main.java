package Generics.genericClass;

public class Main {
    public static void main(String[] args) {
        SomeGenericClass<String> stringElement = new SomeGenericClass<>("string element");
        SomeGenericClass<Integer> integerElement = new SomeGenericClass<>(1);
        SomeGenericClass<Car> car = new SomeGenericClass<>(new Car("Honda", 1995));
        SomeGenericClass<Animal> animal = new SomeGenericClass<>(new Animal());

        System.out.println(car.getElement());
    }

    public static class Animal{}

}

class Car {
    String name;
    Integer productionYear;

    public Car(String name, Integer productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
