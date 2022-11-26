package ListySetyMapy;
import java.util.ArrayList;
import java.util.List;

//lista ma domyślnie zaimplementowaną metodę toString





public class ArrayListExamples {
    public static void main(String[] args) {
        List<String> someString = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("string_" + i);
        }
// ctrl + alt + V - wyłączenie do zmiennej
//najczęściej używane metody
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("st"));
        System.out.println(list.indexOf("string_4"));
        String[] array = list.toArray(new String[0]);
        list.remove(3);
        list.clear();
    }

}
