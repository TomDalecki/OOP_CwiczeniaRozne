package ListySetyMapy.WorkshopExercises.Exercise1;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> myCarsList = new ArrayList<>();
        List<Car> myFriendCarsList = new ArrayList<>();

        myCarsList.add(new Car("Lamborghini", "Diablo", 1992));
        myCarsList.add(new Car("Ferrari", "Testarossa", 1998));
        myCarsList.add(new Car("Ford", "Mustang", 1990));
        System.out.println(myCarsList);


        myFriendCarsList.add(new Car("Ferrari", "Testarossa", 1990));
        myFriendCarsList.add(new Car("Ferrari", "Testarossa", 1991));
        myFriendCarsList.add(new Car("Porsche", "Carrera", 1990));
        myFriendCarsList.add(new Car("Porsche", "GT", 1990));
        myFriendCarsList.add(new Car("Ford", "Mustang", 1990));
        System.out.println(myFriendCarsList);

        Comparator<Car> comparator1 = ((Comparator<Car>) (o1, o2) -> o1.year.compareTo(o2.year))
                .thenComparing(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.brand.compareTo(o2.brand);
            }
        }).thenComparing(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.model.compareTo(o2.model);
            }
        });
        Set<Car> commonCarsSet = new TreeSet<>(comparator1);
        commonCarsSet.addAll(myCarsList);
        commonCarsSet.addAll(myFriendCarsList);
        System.out.println("commonCarsSet1: " + commonCarsSet);


        Set<Car> commonCarsSet2 = new TreeSet(myCarsList);
        commonCarsSet2.addAll(myFriendCarsList);
        System.out.println("commonCarsSet2: " + commonCarsSet2);
    }

    public static class Car implements Comparable<Car>{
        private final String brand;
        private final String model;
        private final Integer year;

        public Car(String brand, String model, Integer year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }
        @Override
        public String toString() {
            return "Car: " + brand + " " + model + " " + year;
        }

        @Override
        public int compareTo(@NotNull Car car) {
            Comparator<Car> comparator = Comparator.comparingInt(o -> o.year);
            Comparator<Car> comparator1 = comparator.thenComparing(Comparator.comparing(o -> o.brand));
            Comparator<Car> comparator2 = comparator1.thenComparing(Comparator.comparing(o -> o.model));
            return comparator2.compare(this, car);
        }
    }
}
