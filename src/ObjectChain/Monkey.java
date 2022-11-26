package ObjectChain;
// Monkey jako klasa immutable (Immutability)
public final class Monkey {
    private final String name;
    private final int age;

    public Monkey(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Monkey withName(String name) {
        return new Monkey(name, this.age);
    }

    public Monkey withAge(int age) {
        return new Monkey(this.name, age);
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
