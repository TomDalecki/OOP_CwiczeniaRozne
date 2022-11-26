package DataTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

//Parsowanie - mając datę w stringu można spróbować zapisać ja jako obiekt
public class FormatingAndParsing {
    public static void main(String[] args) {
        //PARSOWANIE
        LocalDate date2 = LocalDate.parse("2020-09-22");
        LocalDateTime dateTime2 = LocalDateTime.parse("2022-09-22T11:50:55");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.parse("2022-09-22T11:50:55+01:00[Europe/Paris]");

        String stringDate = "Mon, 05 May 1980";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEE, d MMM yyyy", Locale.ENGLISH);//Locale - ważne żeby działałao
        System.out.println("Sformatowany String z datą: " + LocalDate.parse(stringDate, formatter2));


        //FORMATOWANIE DATA CZAS
    LocalDate date = LocalDate.of(2018, Month.OCTOBER, 28);
    LocalTime time = LocalTime.of(1,50);
    LocalDateTime dateTime = LocalDateTime.of(date, time);
    OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime, ZoneOffset.ofHours(-4));
    ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, ZoneId.of("Europe/Paris"));
    Instant instant = zonedDateTime.toInstant();

    //Są różne formatery ISO, RFC,  - trzeba szukać które pasuja do daty, które do czasu, inaczej wyrzuca wyjatek

        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(date));
        //System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(time)); //wyrzuci wyjątek
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(dateTime));
        System.out.println(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(offsetDateTime));
        System.out.println(DateTimeFormatter.ISO_ZONED_DATE_TIME.format(zonedDateTime));
        System.out.println("RFC: " + DateTimeFormatter.RFC_1123_DATE_TIME.format(zonedDateTime));
        //System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(instant)); //wyrzuci wyjątek
                System.out.println();
                System.out.println("DateTimeFormatter.ofLocalizedDate(FormatStyle...");
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(zonedDateTime));

        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(zonedDateTime));
                System.out.println();
                System.out.println("Custom date time");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyy HH:mm z");
        System.out.println(formatter.format(zonedDateTime));
    }}
