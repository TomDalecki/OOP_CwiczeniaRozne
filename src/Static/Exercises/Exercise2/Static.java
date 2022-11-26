package Static.Exercises.Exercise2;

public class Static {
    static{
        System.out.println("Creating static class");
    }
    private static int counter = 0;
    private static String name = "name";

    public Static(String a) {
        this.name = a;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static String getName() {
        return name;
    }
}
