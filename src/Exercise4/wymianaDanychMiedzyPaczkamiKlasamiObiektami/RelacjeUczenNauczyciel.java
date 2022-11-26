package Exercise4.wymianaDanychMiedzyPaczkamiKlasamiObiektami;

import Exercise4.wymianaDanychMiedzyPaczkamiKlasamiObiektami.nauczyciel.Nauczyciel;
import Exercise4.wymianaDanychMiedzyPaczkamiKlasamiObiektami.uczen.Uczen;

public class RelacjeUczenNauczyciel {
    public static void main(String[] args) {
        Nauczyciel nauczyciel1 = new Nauczyciel("Andrzej", "Profesorski");

        Uczen[] uczen = new Uczen[3];
        uczen[0] = new Uczen("Tytus", "Tytusowski");
        uczen[1] = new Uczen("Romek", "Romkowski");
        uczen[2] = new Uczen("Atomek", "Atomowski");

        CzarnyCharakter czarnyCharakter = new CzarnyCharakter("no", "name");

        nauczyciel1.zadajeZadanie(uczen);
        System.out.println("-----------------------------");

        nauczyciel1.stworzEgzaminTest(7);
        System.out.println("-----------------------------");

        for (int i = 0; i < uczen.length; i++) {
            uczen[i].uczenPiszaTest(nauczyciel1.pytaniaDoTestu);
        }

        for (int i = 0; i < uczen.length; i++) {
            nauczyciel1.sprawdzenieTestu(uczen[i].udzieloneOdpowiedzi, uczen[i].getImie(), uczen[i].getNazwisko());

        }
    }
}
