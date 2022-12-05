package ProgramowanieFunkcyjne;

public class SilniaViaRekurencjaExample {
    public static void main(String[] args) {
        Integer factorial = FactorialRecursive(7);
        System.out.println(factorial);
    }

    public static Integer FactorialRecursive(Integer value){
        if(value == 0){
            return 1;
        } else {
            int i = value * FactorialRecursive(value - 1);
            System.out.println(i);
            return i;
        }
    }

}
