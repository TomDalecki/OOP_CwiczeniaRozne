package DataTime;

import java.time.Period;
//klasa prezentuje okres czasu dot. Lat, Miesiecy, dni
//Period może być używany do: LocalDate,Offset DateTime, Zoned DateTime.  LocalDateTime NIE do LocalTime bo operuje na dniach, mies
public class PeriodExamples {
    public static void main(String[] args) {
        System.out.println(Period.ofDays(2));
        System.out.println(Period.ofMonths(7));
    }
}
