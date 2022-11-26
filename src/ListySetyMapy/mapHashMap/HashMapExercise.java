package ListySetyMapy.mapHashMap;

import java.util.*;

public class HashMapExercise {
    public static void main(String[] args) {
        Map<String, List<String>> atrakcjeMiejskie = new HashMap<>();

        List<String> atrakcjeKatowic = new ArrayList<>();
        atrakcjeKatowic.add("Rynek");
        atrakcjeKatowic.add("Parki");
        atrakcjeKatowic.add("Spodek");

        atrakcjeMiejskie.put("Katowice1", atrakcjeKatowic);

        atrakcjeMiejskie.put("Katowice", Arrays.asList("Spodek", "NOSPR"));
        atrakcjeMiejskie.put("London", List.of("Buckingham Palace", "Eye"));

        System.out.println(atrakcjeMiejskie);

        System.out.println(atrakcjeMiejskie.get("Katowice"));

        Set<Map.Entry<String, List<String>>> atrakcjeMiejskieEntries = atrakcjeMiejskie.entrySet();
        System.out.println("entries " + atrakcjeMiejskieEntries);
//iterowanie po HashMap
        for (Map.Entry<String, List<String>> stringListEntry : atrakcjeMiejskie.entrySet()) {
            System.out.println(stringListEntry.getKey());
//            System.out.println(stringListEntry.getValue());
//            System.out.println(stringListEntry);

            for (String atrakcja : stringListEntry.getValue()) {
                System.out.println(atrakcja);
                System.out.println(stringListEntry.getKey() + " " + atrakcja);

            }

        }

    }
}
