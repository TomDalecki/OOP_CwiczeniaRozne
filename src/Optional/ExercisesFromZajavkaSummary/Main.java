package Optional.ExercisesFromZajavkaSummary;

import Optional.ExercisesFromZajavkaSummary.Human;

import java.util.Optional;

//Klasa Optional jest uzywana często
public class Main {
    public static void main(String[] args) {
        Optional<Human> human = retrieveHuman("Boalek");
        
        System.out.println(human.get().getName());


    }
public static Optional<Human> retrieveHuman(final String name){
        return name.endsWith("a") ? Optional.of(new Human("Adam")) : Optional.empty();
}
}
