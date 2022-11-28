package Generics.genericInterface;

public class SomeGenericClass <T> implements SomeGenericInterface<T>{
    @Override
    public void pack(T element) {
    }

    @Override
    public T empty() {
        return null;
    }
}
