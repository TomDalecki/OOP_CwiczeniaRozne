package ListySetyMapy.Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
        List<Integer> someIntegers = List.of(1, 3, 4, 6, 8, 22, 43, 57);

        Queue<Integer> queue = new ArrayDeque<>();
        queue.addAll(someIntegers);
        System.out.println(queue);
// dodawanie elementów pojedynczo
        Queue<Integer> queue2 = new ArrayDeque<>();
        for (Integer element : someIntegers) {
            System.out.println("queue2.offer(element) " + queue2.offer(element));
            System.out.println(queue2);
        }
// dodawanie elementów pojedynczo
        Queue<Integer> queue3 = new ArrayDeque<>();
        for (Integer element : someIntegers) {
            System.out.println("queue3.add(element) " + queue3.add(element));
            System.out.println(queue3);
        }

        System.out.println(queue.peek()); //peek zerka na pierwszy element w kolejce
        System.out.println(queue);
        System.out.println(queue.poll()); //poll zabiera zabiera pierwszy element w kolejce
        System.out.println(queue);
        System.out.println(queue.add(100));
        System.out.println(queue);

//Implementacja z LinkedList
        Queue<Integer> queue4 = new LinkedList<>();
        for (Integer element : someIntegers) {
            System.out.println("queue4.add(element) " + queue4.add(element));
            System.out.println(queue4);
        }

        System.out.println(queue4.peek()); //peek zerka na pierwszy element w kolejce
        System.out.println(queue4);
        System.out.println(queue4.poll()); //poll zabiera zabiera pierwszy element w kolejce
        System.out.println(queue4);
        System.out.println(queue4.add(100));
        System.out.println(queue4);

        LinkedList<Integer> queue5 = new LinkedList<>();
        for (Integer element : someIntegers) {
            System.out.println("queue5.add(element) " + queue5.add(element));
            System.out.println(queue5);
        }

        System.out.println(queue5.peek()); //peek zerka na pierwszy element w kolejce
        System.out.println(queue5);
        System.out.println(queue5.poll()); //poll zabiera zabiera pierwszy element w kolejce
        System.out.println(queue5);
        System.out.println(queue5.add(100));
        System.out.println(queue5);
        queue5.get(1); //przy implementacji LL mamy zarówno metody typu peek jak i get
        queue5.getFirst(); //to ma tylko lista, deque, arraydeque - queue - tego nie ma
        queue5.getLast(); //to ma tylko lista, deque, arraydeque  - queue - tego nie ma
        queue5.addLast(505); //to ma tylko lista, deque, arraydeque - queue - tego nie ma
        queue5.addLast(506); //to ma tylko lista, deque, arraydeque - queue - tego nie ma

    }
}
