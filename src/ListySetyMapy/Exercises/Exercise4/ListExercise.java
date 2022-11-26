package ListySetyMapy.Exercises.Exercise4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
Napisz metodę, która na podstawie przekazanej do niej listy Integerów, przeniesie najwyższą
wartość na koniec listy. Stwórz 2 wersje metody, pierwszą modyfikującą obecną listę, drugą
zwracającą nową listę. Jeżeli wartość maksymalna się powtarza, napisz kod w ten sposób, żeby na
końcu listy pojawiło się tylko jedno wystąpienie tej wartości, a zniknęło ono z oryginalnych miejsc.
 */

public class ListExercise {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(4,4,4,4,4,4));
        ArrayList<Integer> integerList2 = new ArrayList<>(Arrays.asList(69, 18, 5 ,69, -1, 0, 69,  9, 15));

        sortMethod1(integerList);

        ArrayList<Integer> newList = sortMethod2(integerList2);
        System.out.println("sortMethod2: " + newList);



    }

    public static void sortMethod1(ArrayList<Integer> integerList){
        integerList.sort(null);
        int listSize = (integerList.size());
        Integer maxvalue = integerList.get(integerList.size()-1);

        for (int i = 0; i < listSize; i++) {
            integerList.remove(maxvalue);
            if(integerList.size()==0){
                integerList.remove(maxvalue);
                break;
            }
            else if (maxvalue != integerList.get(integerList.size()-1)){
                break;
            }
        }
        System.out.println("sortMethod1 po sortowaniu, po usunięciu max: " + List.of(integerList));
        integerList.add(maxvalue);
        System.out.println("sortMethod1: " + integerList);
    }

    public static ArrayList<Integer> sortMethod2(ArrayList<Integer> integerList){
        ArrayList<Integer> newIntegerList = new ArrayList<>();
        integerList.sort(null);
        int maxValue = integerList.get(integerList.size()-1);
        integerList.removeAll(Collections.singletonList(maxValue));
        integerList.add(maxValue);
        newIntegerList.addAll(integerList);
        return newIntegerList;
    }





}
