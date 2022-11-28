package ListySetyMapy.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class Stack_StosExamples {
    public static void main(String[] args) {
        List<Integer> someIntegers = List.of(1, 3, 4, 6, 8, 22, 43, 57);

        Deque<Integer> stack = new ArrayDeque<>();
        stack.addAll(someIntegers);
        System.out.println(stack);

        for (Integer element : stack) { //w stosie elementy dodawane są od przodu(od góry, metoda LIFO)
            stack.push(element);
            System.out.println(stack);
        }

        stack.push(44); //push jest metodą stosową
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.poll());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
