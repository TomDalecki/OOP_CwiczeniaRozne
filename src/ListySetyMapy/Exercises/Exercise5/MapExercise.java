package ListySetyMapy.Exercises.Exercise5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
Stwórz listę zawierającą 100 liczb. Spróbuj wykorzystać klasę Random do wygenerowania wartości
losowych w zakresie od 0 do 10. Następnie wydrukuj na ekranie ile razy każdy z elementów został wylosowany.
Wykorzystaj Map.
 */
public class MapExercise {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> hundredRandomNumbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            hundredRandomNumbers.add(random.nextInt(10));
        }
        System.out.println(hundredRandomNumbers);
        HashMap<Integer, Integer> numbersCounterHashMap = new HashMap<>();
        int counter = 0;

        for (int i = 0; i < 10; i++) {
            for (Integer randomNumber : hundredRandomNumbers) {
                if (randomNumber == i){
                counter++;
                }
            }
            numbersCounterHashMap.put(i, counter);
            counter = 0;
        }
        System.out.println(numbersCounterHashMap);

        for (Map.Entry<Integer, Integer> integerIntegerEntry : numbersCounterHashMap.entrySet()) {
            System.out.println(integerIntegerEntry);
        }

    }
}
