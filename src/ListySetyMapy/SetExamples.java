package ListySetyMapy;
//nie pozwala na przechowywanie duplikatów
//z założenia nie zachowuje kolejności dodawanych elementów (jest implementacja która pozwala zachować kolejność)

//do przyswojenia set przechowujący obiekty
//do przyswojenia dlaczego w parametrze metody lepiej uzywać interfejsu niż implementacji
import java.util.HashSet;
import java.util.Set;

public class SetExamples {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Gdansk");
        set1.add("Wroclaw");
        set1.add("Szczecin");
        set1.add("Gdansk");
        set1.add("Warszawa");
        System.out.println(set1);

        Set<String> set2 = new HashSet<>();
        set2.add("Katowice");
        set2.add("Wroclaw");
        set2.add("Zakopane");
        set2.add("Gdansk");
        set2.add("Warszawa");
        System.out.println(set2);
// częste zastosowania w praktyce
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("union: " + union);

        Set<String> intersection = new HashSet<>(set1); //przeciecie setow (część wspólna)
        intersection.retainAll(set2);
        System.out.println("intersection: " + intersection);

        Set<String> difference = new HashSet<>(set1); //różnica - co jest w set1 nie ma w set2
        difference.removeAll(set2);
        System.out.println("difference: " + difference);

        System.out.println(set1.contains("Szczecin"));
        System.out.println(set1.contains("Gdynia"));
    }
}
