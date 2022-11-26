package DataTime;

import java.time.*;
import java.time.temporal.ChronoUnit;

//Period - kompatybilny z LocalDate/LocalDateTime
//Duration - kompatybilny z LocalTime/LocalDateTime
//Instant - klasa pokazuje czas w UTC liczony od Epoch
//"Z" na końcu czasu mówi że data jest w UTC
public class DurationPeriodInstant {
    public static void main(String[] args) {

        Period period = Period.ofDays(10);
        System.out.println(period);

        Duration duration = Duration.ofSeconds(98745);
        System.out.println(duration);
        System.out.println(duration.plusMinutes(60));
        //metoda truncate - obcina jednostki(zeruje) mniejsze niż ta wskazana w metodzie
        System.out.println(duration.truncatedTo(ChronoUnit.MINUTES));
        System.out.println(duration.truncatedTo(ChronoUnit.HOURS));

        Instant instant = Instant.now();
        Instant instant2 = Instant.ofEpochSecond(1600006000L);
        System.out.println("Epoch 1600006000L: " + instant);
        System.out.println(instant2);

        OffsetDateTime offsetDateTime = OffsetDateTime.ofInstant(Instant.ofEpochSecond(1650606000L), ZoneId.of("Poland"));
        System.out.println("Epoch 1650606000L / Zone Poland: " + offsetDateTime);

        LocalDate localDate = LocalDate.of(1410,7,15);
        LocalTime localTime = LocalTime.of(8,50);
        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(localDate, localTime, ZoneOffset.of("-05:00"));
        System.out.println("offsetDateTime1: " + offsetDateTime1);
        System.out.println(offsetDateTime1.toInstant());


    }



}
