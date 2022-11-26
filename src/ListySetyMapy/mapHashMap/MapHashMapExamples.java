package ListySetyMapy.mapHashMap;
import java.util.HashMap;
import java.util.Map;
//interfejs Map nie rozszerza Collection
//implementacją mapy jest HashMap - wykorzystywany jest mechanizm hashowania czyli metoda hashcode
//mapa jest przykładem tablicy asocjacyjnej(tablica skojarzeniowa)
//mapa zachowuje się tak że zawsze mamy klucz i wartość
//klucz powinien być immutable najlepiej Integer lub String
//mapa przyjmuje dwa typy
//składnia: interfejs Map, dwa typy, nazwa zmiennej, implementacja HashMap
//mapa ma domyślnie zaimplementowaną metodę toString
//po HashMap nie da się iterować, żeby przeiterować trzeba wykorzystać Entry


public class MapHashMapExamples {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Tom"); //dodawanie do mapy przez put
        map1.put(2, "Tom2");
        System.out.println(map1);

        Map<Integer, String> map2 = new HashMap<>();
        map2.putAll(map1);
// typowe metody
        System.out.println(map1.get(1));
        System.out.println(map2.get(2));

        System.out.println(map1.isEmpty());
        System.out.println(map1.size());

        System.out.println(map1.containsKey(3));
        System.out.println(map1.containsValue("TTT"));

        System.out.println(map2.remove(2));

        map2.clear();
    }
}
