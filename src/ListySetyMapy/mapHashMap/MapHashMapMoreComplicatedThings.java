package ListySetyMapy.mapHashMap;

import java.util.*;

public class MapHashMapMoreComplicatedThings {
    public static void main(String[] args) {
        Map<Integer, List<String>> map1 = new HashMap<>(); //drugi element to np. List
        map1.put(1, List.of("Danny Pies", "Edmund Slon", "Wendy Wilk")); //Lista stringow
        map1.put(2, Collections.emptyList()); //Pusta lista
        map1.put(3, Collections.singletonList("Zoe Zebra"));//Lista z pojedynczego elementu
        System.out.println(map1);
                    System.out.println();
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "Danny Pies");
        map2.put(2, "Edmund Slon");
        map2.put(3, "Wendy Wilk");

        System.out.println(map2.entrySet());
        Set<Map.Entry<Integer, String >> entries = map2.entrySet();
        System.out.println(entries);
                    System.out.println();
        System.out.println(map2.keySet());
        Set<Integer> integers = map2.keySet();
        System.out.println(integers);
                    System.out.println();
        System.out.println(map2.values());
        Collection<String > values = map2.values();
        System.out.println(values);
        for (String value : values) {
            System.out.println(value);
        }

    }
}
