package Generics.genericInterface;

public class SomeImplementingClass implements SomeGenericInterface<Car>{
    @Override
    public void pack(Car element) {

    }

    @Override
    public Car empty() {
        return null;
    }
}
