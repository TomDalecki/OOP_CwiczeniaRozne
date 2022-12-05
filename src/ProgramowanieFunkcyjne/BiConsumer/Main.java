package ProgramowanieFunkcyjne.BiConsumer;

import org.jetbrains.annotations.NotNull;

import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        BiConsumer<String , Integer> biConsumer = (x, y) -> System.out.println(x.concat(y.toString()));
        biConsumer.accept("To jest Dwa: ", 2);

        BiConsumer<String , Integer> biConsumer2 = Main::getStringIntegerBiConsumer;
        biConsumer2.accept("To jest Trzy: ", 3);
    }

    @NotNull
    private static void getStringIntegerBiConsumer(String x, Integer y) {
        System.out.println(x.concat(y.toString()));
    }
}
