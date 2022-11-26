package DataTime;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
// operuje na faktycznych strefach czasowych
// klasa ogarnia zmiany czasu zima/lato
public class ZonedExamples {
    public static void main(String[] args) {
        System.out.println(ZonedDateTime.now());
        ZoneOffset utc = ZoneOffset.UTC;
        ZoneOffset paris = (ZoneOffset) ZoneId.of("Europe/Paris");

    }
}
