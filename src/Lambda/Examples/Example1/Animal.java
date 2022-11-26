package Lambda.Examples.Example1;

public class Animal{
    private String name;
    private boolean canFly;
    private boolean canBark;

    public Animal(String name, boolean canFly, boolean canBark) {
        this.name = name;
        this.canFly = canFly;
        this.canBark = canBark;
    }

    public String getName() {
        return name;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public boolean isCanBark() {
        return canBark;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", canFly=" + canFly +
                ", canBark=" + canBark +
                '}';
    }
}
