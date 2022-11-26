package Immutable.ImmutableColection;

import java.util.HashSet;
import java.util.Set;
//Mój przykład
public final class ImmutableVsCollection {

    private final Set<String> someSet;

    public ImmutableVsCollection(Set<String> someSet) {
        this.someSet = someSet;
        someSet.add("object1");
        someSet.add("object2");
    }

    public Set<String> getSomeSet() {
//        return someSet; //taki zapis sprawia że kolekcja nie jest immutable
        return new HashSet<>(someSet); //nowy HashSet sprawia że do referencji zawsze dostajemy nowy obiekt, a stary pozostaje niezmieniopny
    }

    public static void main(String[] args) {
        Set<String> otherSet = new HashSet<>();
        otherSet.add("object3");
        ImmutableVsCollection immutableVsCollection = new ImmutableVsCollection(otherSet); //tu łączymy some i other - od tego momentu jest immutable
        System.out.println(immutableVsCollection.getSomeSet());

        immutableVsCollection.getSomeSet().add("aaaaaa");
        System.out.println(immutableVsCollection.getSomeSet());

    }
}
// Przykład Karola
final class ImmutableVsCollectionV2 {

    private final Set<String> someSet;

    public ImmutableVsCollectionV2(String element1, String element2) {
        Set<String> otherSet = new HashSet<>();
        otherSet.add(element1);
        otherSet.add(element2);
        this.someSet = otherSet;
    }

    public final Set<String> getSomeSet() {
    //    return someSet; //wersja nie zapewniająca immutable
        return new HashSet<>(someSet); //taki zapis zapewnia immutable
    }

    public static void main(String[] args) {
        ImmutableVsCollectionV2 immutableVsCollectionV2 = new ImmutableVsCollectionV2("ELEMENT1", "ELEMENT2");
        System.out.println(immutableVsCollectionV2.getSomeSet());

        immutableVsCollectionV2.getSomeSet().add("ELEMENT3");
        System.out.println(immutableVsCollectionV2.getSomeSet());

    }
}