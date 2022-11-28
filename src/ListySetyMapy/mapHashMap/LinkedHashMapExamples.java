package ListySetyMapy.mapHashMap;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class LinkedHashMapExamples {
    public static void main(String[] args) {
        Map<PeppaAndFriends, Integer> peppasFriends = new LinkedHashMap<>();
        peppasFriends.put(new PeppaAndFriends("Suzie", "Sheep"), 1);
        peppasFriends.put(new PeppaAndFriends("Danny", "Dog"), 2);
        peppasFriends.put(new PeppaAndFriends("Wendy", "Wolf"), 4);
        peppasFriends.put(new PeppaAndFriends("Danny", "Dog"), 3);

        for (Map.Entry<PeppaAndFriends, Integer> peppaAndFriendsEntry : peppasFriends.entrySet()) {
            System.out.println(peppaAndFriendsEntry.getKey());
        }
        for (Map.Entry<PeppaAndFriends, Integer> peppaAndFriendsEntry : peppasFriends.entrySet()) {
            System.out.println(peppaAndFriendsEntry);
        }

        System.out.println("------------------------------------------------");
        Map<Integer, PeppaAndFriends> peppasFriends2 = new LinkedHashMap<>();
        peppasFriends2.put(1, new PeppaAndFriends("Suzie", "Sheep"));
        peppasFriends2.put(2, new PeppaAndFriends("Danny", "Dog"));
        peppasFriends2.put(4, new PeppaAndFriends("Wendy", "Wolf"));
        peppasFriends2.put(3, new PeppaAndFriends("Danny", "Dog"));

        for (Map.Entry<Integer, PeppaAndFriends> peppaAndFriendsEntry : peppasFriends2.entrySet()) {
            System.out.println(peppaAndFriendsEntry.getKey());
        }
        for (Map.Entry<Integer, PeppaAndFriends> peppaAndFriendsEntry : peppasFriends2.entrySet()) {
            System.out.println(peppaAndFriendsEntry);
        }


    }

    private static class PeppaAndFriends {
        private final String name;
        private final String species;

        public PeppaAndFriends(String name, String species) {
            this.name = name;
            this.species = species;
        }

        public String getName() {
            return name;
        }

        public String getSpecies() {
            return species;
        }

        @Override
        public String toString() {
            return "PeppaAndFriends{" +
                    "name='" + name + '\'' +
                    ", species='" + species + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PeppaAndFriends that = (PeppaAndFriends) o;
            return Objects.equals(name, that.name) && Objects.equals(species, that.species);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, species);
        }
    }
}
