package ObjectChain;

public class Main {
    public static void main(String[] args) {
        Kangaroo kangaroo = new Kangaroo("Kinga", 10);
        System.out.println(kangaroo.toString());
        kangaroo.withName("Ela").withAge(15);
        System.out.println(kangaroo.toString());

        System.out.println("....................");

        Monkey monkey = new Monkey("Kinga", 3);
        System.out.println(monkey.toString());
        monkey = monkey.withName("Ela").withAge(14); //
        System.out.println(monkey.toString());
    }
}
