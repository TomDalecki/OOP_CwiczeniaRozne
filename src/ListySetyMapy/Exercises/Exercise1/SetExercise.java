package ListySetyMapy.Exercises.Exercise1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Mając Set z elementami typu String, wydrukuj na ekranie każdy element oddzielony przecinkiem
przy wykorzystaniu iteratora.
*/

public class SetExercise {
    public static void main(String[] args) {
        Set<String> someSet = new HashSet<>();
        someSet.add("Wendy Wilk");
        someSet.add("Pedro Kucyk");
        someSet.add("Peppa Swinka");
        someSet.add("Danny Pies");

//        System.out.println(someSet);
//
//        for (String iterSomeSet : someSet) {
//            System.out.println(iterSomeSet);
//        }


        final Iterator<String> iterator = someSet.iterator();
        int counter = 1;
//sposób z while
        while (iterator.hasNext()){
            if (counter < someSet.size()) {
                System.out.println(iterator.next() + ",");
            }
            else{
                System.out.println(iterator.next());
            }
            counter++;
        }
//sposób z fori
        for (int i = 0; i < someSet.size(); i++) {
            if((i+1) == someSet.size())
            {System.out.println(iterator.next());}
            else{
            System.out.println(iterator.next() + ",");
            }

        }
    }
}
