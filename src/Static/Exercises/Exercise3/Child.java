package Static.Exercises.Exercise3;

public class Child extends AParent{
    @Override
    String getName() {
        return super.getName();
    }

    static String getClassName(){
       return "Child";
    }

    public static void main(String[] args) {
        AParent aParent = new Child();
        Child child1 = new Child();
        Child child2 = new Child();

        System.out.println(aParent.getName());
        System.out.println(aParent.getClassName());
        System.out.println();
        System.out.println(child1.getName());
        System.out.println(child2.getClassName());



    }
}
