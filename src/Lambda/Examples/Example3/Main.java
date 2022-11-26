package Lambda.Examples.Example3;

public class Main {
    public static void main(String[] args) {
//opis Lambdy własnymi słowami:
//instancja klasy niewiadomo jakiej, która implementuje interfej funkcyjny,
//dla którego Lambda, jest implementacją jedynej metody abstrakcyjnej
        Jumpable jumpableLambda = initParam -> initParam.contains("jump");


        //zapis z klamrami, niezbędny gdy mamy więcej niż jedną linię kodu w implementacji metody
        Jumpable jumpableLambda2 = initParam -> {
            System.out.println("lambda canJump invoked");
           return initParam.contains("jump");
        };

        System.out.println(jumpableLambda.canJump("jumping"));
        System.out.println(jumpableLambda.canJump("juumping"));
        System.out.println(jumpableLambda2.canJump("jumping"));
        System.out.println(jumpableLambda2.canJump("juumping"));
    }
}
