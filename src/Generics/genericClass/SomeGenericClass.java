package Generics.genericClass;

public class SomeGenericClass<T>{
    private T element;

    public SomeGenericClass(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }
}
