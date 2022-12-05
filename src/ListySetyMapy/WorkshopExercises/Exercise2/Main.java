package ListySetyMapy.WorkshopExercises.Exercise2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", "+48000025375");
        Person person2 = new Person("Piotr", "Kowalski", "+48000045214");
        Person person3 = new Person("Edward", "Nowak", "+48000045215");
        Person person4 = new Person("Zbigniew", "Kowalski", "+48000045214");
        Person person5 = new Person("Karol", "Nowak", "+48000045215");

        List<Person> personsList = new ArrayList<>();
        personsList.add(person1);
        personsList.add(person2);
        personsList.add(person3);
        personsList.add(person4);
        personsList.add(person5);

        Map<String, List<Person>> phoneBook = new TreeMap<>();


        for (int i = 0; i < personsList.size(); i++) {
            if (!phoneBook.containsKey(personsList.get(i).getSureName())) {
                List<Person> phoneBookPersonsList = new ArrayList<>();
                phoneBookPersonsList.add(personsList.get(i));
                phoneBook.put(personsList.get(i).getSureName(), phoneBookPersonsList);
            } else {
                List<Person> phoneBookPersonsList = phoneBook.get(personsList.get(i).getSureName());
                phoneBookPersonsList.add(personsList.get(i));
                phoneBook.put(personsList.get(i).getSureName(), phoneBookPersonsList);
            }
            System.out.println(phoneBook);
        }
    }

    public static class Person {
        private final String name;
        private final String sureName;
        private final String phoneNo;

        public Person(String name, String sureName, String phoneNo) {
            this.name = name;
            this.sureName = sureName;
            this.phoneNo = phoneNo;
        }

        public String getName() {
            return name;
        }

        public String getSureName() {
            return sureName;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        @Override
        public String toString() {
            return name + " " + sureName + " " + phoneNo;
        }
    }


}
