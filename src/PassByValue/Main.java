package PassByValue;

public class Main {
    public static void main(String[] args) {
        int a = 8;
        System.out.println("zmienna a przed metodą: " + a);
        someMethod(a);
        System.out.println("zmienna a po wykonaniu metody: " + a);

    }
    static void someMethod(int a){
        a = a + 8;
        System.out.println("zmienna a w środku metody: " + a);
    }

}

class Main2{
    public static void main(String[] args) {
        int a = 8;
        System.out.println("zmienna a przed metodą: " + a);
        a = someMethod(a);
        System.out.println("zmienna a po wykonaniu metody: " + a);
    }
    static int someMethod(int a){
        a = a + 8;
        System.out.println("zmienna a w środku metody: " + a);
        return a;
    }
}