package DataTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateLocalTime {
//    klasy LocalDate, LocalTime, LocalDateTime mają prywatne konstruktory, więc nie da się na ich podstawie stworzyć instancji obiektu
    //wywołanie tylko przez detykowane metody,metody te są statyczne
    //dostajemy datę czas jaką mamy na kompie, nie ma powiązania ze strefą czasową
    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        System.out.println(LocalDate.of(2022, 11, 2));
        System.out.println(LocalDate.of(2022, Month.NOVEMBER, 2));
        System.out.println(LocalTime.of(17, 50));
        System.out.println(LocalTime.of(17, 50, 23, 907));
        System.out.println(LocalDateTime.of(2022, 11 ,2, 17, 50));

        System.out.println(LocalDate.ofYearDay(2022, 11));

        System.out.println(LocalDate.ofEpochDay(19800));

        String stringSomeDate = "08/04/2022";
        LocalDate ldtSomeDate = LocalDate.parse(stringSomeDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("ldtSomeDateTime: " + ldtSomeDate);

        long yearInSomeDate = ldtSomeDate.getYear();
        System.out.println(yearInSomeDate);


    }
}
