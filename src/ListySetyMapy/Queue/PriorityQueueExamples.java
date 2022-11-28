package ListySetyMapy.Queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

//PriorityQueue przyjmuje jako interfejs Comapartor w argumencie konstruktora więc przy dodawaniu elementów
// typu Car, Dog itp. będzi wyrzucał błąd - musi być zaimplementowany Comparator poprzez lambda
// rozwinięcie tematu na końcu tej klasy
public class PriorityQueueExamples {
    public static void main(String[] args) {
        List<Integer> someIntegers = List.of(1, 4, 3, 8, 22, 7, 43, 13, 1, 4, 1);

        //PriorityQueue stara się układać elementy zgodnie z natural order chociaż nie do końca to widać
        //widać to dopiero przy pobieraniu elementów
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(someIntegers);
        System.out.println(someIntegers);
        System.out.println(priorityQueue);

        Queue<Integer> priorityQueue2 = new PriorityQueue<>();
        for (Integer element : someIntegers) {
            priorityQueue2.add(element);
        }
        System.out.println(priorityQueue2);

        Queue<Integer> priorityQueue3 = new PriorityQueue<>();
        for (Integer element : someIntegers) {
            priorityQueue3.offer(element);
        }
        System.out.println(priorityQueue3);

        System.out.println("-----------------------------------");
        System.out.println(priorityQueue);
        int size = priorityQueue.size();
        for (int i = 0; i < size; i++) {
            System.out.println(priorityQueue.peek());
            System.out.println(priorityQueue.poll());
            System.out.println(priorityQueue);
        }

        //tu jest rozwinięcie tematu interfejsu Comparator
        Queue<Dog> priorityQueueDog = new PriorityQueue<>((o1, o2) -> o1.name.compareTo(o2.name));
        priorityQueueDog.offer(new Dog("Azor"));
        // dla estetyki kodu należy zamienić na Comparator.comparing
    }

    private static class Dog {
        private String name;

        public Dog(String name) {
            this.name = name;
        }
    }
}
