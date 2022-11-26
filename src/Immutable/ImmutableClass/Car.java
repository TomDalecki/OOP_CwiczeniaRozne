package Immutable.ImmutableClass;

// final w definiowaniu klasy sprawia że ta klasa nie może być rozszerzona
public final class Car {

// final przy definiowaniu pól sprawia że nie można dodać setterów
    private final String color;
    private final boolean roofIsOpen;

    public Car(String color, boolean roofIsOpen) {
        this.color = color;
        this.roofIsOpen = roofIsOpen;
    }

    public String getColor() {
        return color;
    }

    public boolean isRoofIsOpen() {
        return roofIsOpen;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", roofIsOpen=" + roofIsOpen +
                '}';
    }
}
