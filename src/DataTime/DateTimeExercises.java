package DataTime;

import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class DateTimeExercises {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2022, 9, 21);
        LocalTime localTime = LocalTime.of(20,22,14);
        OffsetDateTime offsetDataTime1 = OffsetDateTime.now();
        OffsetDateTime offsetDataTime2 = OffsetDateTime.of(localDate, localTime, ZoneOffset.of("-03:00"));
        ZonedDateTime zonedDataTime1 = ZonedDateTime.now();
       //ZonedDateTime zonedDataTime2 = ZonedDateTime.now(ZoneId.of("Africa"));


        System.out.println(offsetDataTime1);
        System.out.println(offsetDataTime1.toInstant());//metoda wylicza czas UTC, na podstawie danych wprowadzonych jak powyżej

        System.out.println("LocalTime.now(): " + LocalTime.now());
        System.out.println("OffsetDateTime.now(): " + OffsetDateTime.now());
        System.out.println("OffsetDateTime getHour: " + offsetDataTime1.getHour());
        System.out.println("ZonedDateTime.now(): " + ZonedDateTime.now());
        System.out.println("ZonedDateTime getHour: " + zonedDataTime1.getHour());
        System.out.println("ZonedDateTime of Poland " + ZonedDateTime.now(ZoneId.of("Poland")));
        System.out.println("ZonedDateTime of UTC " + ZonedDateTime.now(ZoneId.of("UTC")));
        //System.out.println("ZonedDateTime of Africa " + zonedDataTime2.getHour());


        System.out.println(Arrays.toString(new Set[]{ZoneId.getAvailableZoneIds()}));
        List<String> zoneId = new ArrayList<>(ZoneId.getAvailableZoneIds());
        for (String zone : zoneId) {
            System.out.println(zone);
        }

    }
}
