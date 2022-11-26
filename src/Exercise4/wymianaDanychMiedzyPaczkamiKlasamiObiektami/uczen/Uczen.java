package Exercise4.wymianaDanychMiedzyPaczkamiKlasamiObiektami.uczen;

import Exercise4.wymianaDanychMiedzyPaczkamiKlasamiObiektami.Person;
import Exercise4.wymianaDanychMiedzyPaczkamiKlasamiObiektami.egzamin.EgzaminTest;
import Exercise4.wymianaDanychMiedzyPaczkamiKlasamiObiektami.egzamin.PytanieDoTestu;
import java.util.Random;

public class Uczen extends Person {
    public EgzaminTest[] udzieloneOdpowiedzi;

    public Uczen(String imie, String nazwisko) {
        super(imie, nazwisko);
        System.out.println("Uczen " + getImie()+ " " + getNazwisko() + " przyszedł wypełnić test");
    }

    public void uczenPiszaTest(PytanieDoTestu[] pytaniaDoTestu){
        System.out.println("Uczen " + getImie() + " " + getNazwisko() + " przystąpił do testu");
        udzieloneOdpowiedzi = new EgzaminTest[pytaniaDoTestu.length];
        Random random = new Random();
        for (int i = 0; i < pytaniaDoTestu.length; i++) {

            switch (random.nextInt(3)){
                case 0:
                    udzieloneOdpowiedzi[i] = new EgzaminTest(pytaniaDoTestu[i].getTrescPytania(), "odpowiedz_A");
                    break;
                case 1:
                    udzieloneOdpowiedzi[i] = new EgzaminTest(pytaniaDoTestu[i].getTrescPytania(), "odpowiedz_B");
                    break;
                case 2:
                    udzieloneOdpowiedzi[i] = new EgzaminTest(pytaniaDoTestu[i].getTrescPytania(), "odpowiedz_C");
                    break;
            }
        }
        for (EgzaminTest test : udzieloneOdpowiedzi) {
            System.out.println(test);
        }
        System.out.println("--------------------");
    }
}
