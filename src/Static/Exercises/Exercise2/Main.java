package Static.Exercises.Exercise2;

public class Main {
    public static void main(String[] args) {
        Static static1 = new Static("A");
        System.out.println(Static.getCounter() + " " + Static.getName());
        Static static2 = new Static("B");
        System.out.println(Static.getCounter() + " " + Static.getName());
        Static static3 = new Static("C");
        System.out.println(Static.getCounter() + " " + Static.getName());
        Static static4 = new Static("D");
        System.out.println(Static.getCounter() + " " + Static.getName());
        Static static5 = new Static("E");
        System.out.println(Static.getCounter() + " " + Static.getName());

    }
}
