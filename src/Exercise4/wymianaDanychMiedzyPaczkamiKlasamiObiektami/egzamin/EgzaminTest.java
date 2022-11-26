package Exercise4.wymianaDanychMiedzyPaczkamiKlasamiObiektami.egzamin;

import java.util.Objects;

public class EgzaminTest {
    String pytanie;
    String udzielonaOdpowiedz;

    public EgzaminTest(String pytanie, String udzielonaOdpowiedz) {
             this.pytanie = pytanie;
             this.udzielonaOdpowiedz = udzielonaOdpowiedz;
    }

    public String getUdzielonaOdpowiedz() {
        return udzielonaOdpowiedz;
    }

    @Override
    public String toString() {
        return "Udzielone odpowiedzi: " +
                "pytanie: " + pytanie +
                ", odpowiedz: " + udzielonaOdpowiedz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EgzaminTest that = (EgzaminTest) o;
        return Objects.equals(udzielonaOdpowiedz, that.udzielonaOdpowiedz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(udzielonaOdpowiedz);
    }
}
