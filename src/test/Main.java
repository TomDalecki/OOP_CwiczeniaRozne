package test;

import java.util.Arrays;
import java.util.Comparator;

public class Main implements Comparator<String> {
    public static void main(String[] args) {
        String[] cities = {"WARSZAWA", "ZAKOPANE", "GDYNIA"};
        Arrays.sort(cities, new Main() );
        System.out.println(Arrays.toString(cities));
        }


    @Override
    public int compare(String a, String b) {
        String x = a.toLowerCase();
        System.out.println(x);
        String y = b.toLowerCase();
        return y.compareTo(x);
    }
}
