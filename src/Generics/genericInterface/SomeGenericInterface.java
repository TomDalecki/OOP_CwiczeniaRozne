package Generics.genericInterface;

public interface SomeGenericInterface<T> {
//robimy jakieś metody które będziemy implementować - implementowaćmożemy na dwa sposoby
//1. tworzymy klasę która będzie implementować interfejs
// i wywołanie klasy występującej w generyku będzie na etapie tworzenia klasy
//2. tworzymy klasę implementującą interfejs, ale z typem T,
// a wywołanie typu występującego w generyku będzie wtedy gdy będziemy tworzyć instancję klasy
    void pack(T element);

    T empty();
}
