package Exercise4.wymianaDanychMiedzyPaczkamiKlasamiObiektami.egzamin;

import java.util.Objects;

public class PytanieDoTestu {
    private final String trescPytania;
    private String odpowiedzA;
    private String odpowiedzB;
    private String odpowiedzC;
    private String poprawnaOdpowiedz;

    public PytanieDoTestu(String trescPytania, String poprawnaOdpowiedz) {
        this.trescPytania = trescPytania;
        this.poprawnaOdpowiedz = poprawnaOdpowiedz;
    }

    public PytanieDoTestu(String trescPytania, String odpowiedzA, String odpowiedzB, String odpowiedzC) {
        this.trescPytania = trescPytania;
        this.odpowiedzA = odpowiedzA;
        this.odpowiedzB = odpowiedzB;
        this.odpowiedzC = odpowiedzC;
    }

    public String getTrescPytania() {
        return trescPytania;
    }

    public String getPoprawnaOdpowiedz() {
        return poprawnaOdpowiedz;
    }

    @Override
    public String toString() {
        return "Pytania Do Testu: " +
                trescPytania +
                ", odpA: " + odpowiedzA +
                ", odpB: " + odpowiedzB +
                ", odpC: " + odpowiedzC;
    }
    public String toString2() {
        return "Odpowiedzi Do Testu: " +
                trescPytania+", " + poprawnaOdpowiedz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PytanieDoTestu that = (PytanieDoTestu) o;
        return Objects.equals(poprawnaOdpowiedz, that.poprawnaOdpowiedz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poprawnaOdpowiedz);
    }
}
