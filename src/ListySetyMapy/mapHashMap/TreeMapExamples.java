package ListySetyMapy.mapHashMap;

import java.util.Map;

public class TreeMapExamples {
    public static void main(String[] args) {
        Map<String, String> treeMap = new java.util.TreeMap<>();
        treeMap.put("A", "AA");
        treeMap.put("aa", "aaAA");
        treeMap.put("aA", "aAA");

        for (Map.Entry<String, String> stringStringEntry : treeMap.entrySet()) {
            System.out.println(stringStringEntry);
        }
    }
}
