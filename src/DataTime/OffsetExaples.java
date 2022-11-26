package DataTime;

import java.time.*;

//klasa zalecana przez Oracle dla współpracy z bazami danych
//data/czas powiązane z UTC
public class OffsetExaples {
    public static void main(String[] args) {
        System.out.println(OffsetDateTime.now());
        System.out.println(OffsetDateTime.now(ZoneId.of("UTC")));

        LocalDate localeDate = LocalDate.of(2022, 9,21);
        LocalTime localeTime = LocalTime.of(12, 57,21);
        LocalDateTime localeDateTime = LocalDateTime.of(localeDate, localeTime);

        System.out.println(OffsetDateTime.of(localeDate, localeTime, ZoneOffset.of("+05:00")));
        System.out.println(OffsetDateTime.of(localeDateTime, ZoneOffset.ofHours(-2)));



    }
}
