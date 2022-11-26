package Lambda.Examples.Example1;

import java.util.List;

//Lambda można nazwać metodą anonimową
//Lambda jest jedyną implementacją interfejsu
@SuppressWarnings("ALL")
public class LambdaExamples1 {
    public static void main(String[] args) {
        List<Animal> animals = List.of(new Animal("dog", false, true),
                                        new Animal("cat", false, true),
                                       new Animal("bird", true, false) );


        print(animals, new CheckIfCanBark()); //metoda gdyby nie było wymyślone Lambda - sprawdza kto ma Bark true
        print(animals, new CheckIfCanFly()); //metoda gdyby nie było wymyślone Lambda - sprawdza kto ma Fly true

               System.out.println("Lambda:");
        print(animals, a -> a.isCanFly()); //Lambda skrócony zapis
        print(animals, a -> a.isCanBark());

        print(animals, (Animal a) -> {return a.isCanFly();}); //Lambda pełny zapis

    }
      private static void print(final List<Animal> animals, final Checkable checker){
         for (Animal animal : animals) {
            if (checker.test(animal)) {
                System.out.println(animal);
      }}}


}
