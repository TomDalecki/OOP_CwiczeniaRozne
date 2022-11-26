package Exercise4.wymianaDanychMiedzyPaczkamiKlasamiObiektami.nauczyciel;

import Exercise4.wymianaDanychMiedzyPaczkamiKlasamiObiektami.Person;
import Exercise4.wymianaDanychMiedzyPaczkamiKlasamiObiektami.egzamin.EgzaminTest;
import Exercise4.wymianaDanychMiedzyPaczkamiKlasamiObiektami.egzamin.PytanieDoTestu;
import Exercise4.wymianaDanychMiedzyPaczkamiKlasamiObiektami.uczen.Uczen;
import java.util.Random;

public class Nauczyciel extends Person {
    public PytanieDoTestu[] pytaniaDoTestu;
    private PytanieDoTestu[] prawidloweOdpowiedzi;

    public Nauczyciel(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    public void zadajeZadanie(Uczen[] uczniowie){
    for (Uczen uczen : uczniowie) {
        System.out.println("Nauczyciel zadaje zadanie dla: " + uczen);
        }
    };

    public void stworzEgzaminTest(int liczbaPytan){
        System.out.println("Nauczyciel "+ getImie() + " " + getNazwisko() + " rozpoczął tworzenie pytań do egzaminu");
        pytaniaDoTestu = new PytanieDoTestu[liczbaPytan];
    for (int i = 0; i < liczbaPytan; i++) {
        pytaniaDoTestu[i] = new PytanieDoTestu(("pytanie_"+i), ("odpowiedz_"+i+"A"),("odpowiedz_"+i+"B"),("odpowiedz_"+i+"C"));
        }
        System.out.println("Nauczyciel "+ getImie() + " " + getNazwisko() + " stworzył egzamin");
        for (int i = 0; i < pytaniaDoTestu.length; i++) {
            System.out.println(pytaniaDoTestu[i]);
        }
        System.out.println("-----------------------------");

        okreslPrawidloweOdpowiedzi(liczbaPytan, pytaniaDoTestu);
    }

    private void okreslPrawidloweOdpowiedzi(int liczbaPytan, PytanieDoTestu[] pytaniaDoTestu){
        Random random = new Random();
        prawidloweOdpowiedzi = new PytanieDoTestu[liczbaPytan];
        for (int i = 0; i < liczbaPytan; i++) {
            switch (random.nextInt(3)){
                case 0:
                    prawidloweOdpowiedzi[i] = new PytanieDoTestu(pytaniaDoTestu[i].getTrescPytania(), "odpowiedz_A");
                    break;
                case 1:
                    prawidloweOdpowiedzi[i] = new PytanieDoTestu(pytaniaDoTestu[i].getTrescPytania(), "odpowiedz_B");
                    break;
                case 2:
                    prawidloweOdpowiedzi[i] = new PytanieDoTestu(pytaniaDoTestu[i].getTrescPytania(), "odpowiedz_C");
                    break;
            }

        }
        System.out.println("Nauczyciel określił prawidłowe odpowiedzi do testu");
        for (int i = 0; i < prawidloweOdpowiedzi.length; i++) {
            System.out.println(prawidloweOdpowiedzi[i].toString2());
        }
    }

    public void sprawdzenieTestu(EgzaminTest[] udzieloneOdpowiedzi, String imie, String nazwisko){
        int licznikPrawidłowychOdpowiedzi = 0;
        for (int i = 0; i < prawidloweOdpowiedzi.length; i++) {
            if(prawidloweOdpowiedzi[i].getPoprawnaOdpowiedz().equals(udzieloneOdpowiedzi[i].getUdzielonaOdpowiedz())){
                licznikPrawidłowychOdpowiedzi += 1;
            }
        }
        System.out.println(imie + " " +
                            nazwisko + " udzielil " +
                            licznikPrawidłowychOdpowiedzi + " " +
                            "prawidlowych odpowiedzi");

        if ((double) licznikPrawidłowychOdpowiedzi/(double)prawidloweOdpowiedzi.length >= 0.5){
            System.out.println(imie + " " +
                    nazwisko + " zdał egzamin");
        }else{
            System.out.println(imie + " " +
                    nazwisko + " oblał egzamin");
        }
    }
}
