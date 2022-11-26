package Exercise4.wymianaDanychMiedzyPaczkamiKlasamiObiektami;

public abstract class Person {
    String imie;
    String nazwisko;

    public Person(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public String toString() {
        return "Person - " +
                "imie: " + imie +
                ", nazwisko: " + nazwisko;
    }
}
