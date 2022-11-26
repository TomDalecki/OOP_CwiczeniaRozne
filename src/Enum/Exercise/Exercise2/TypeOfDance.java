package Enum.Exercise.Exercise2;
import Enum.Exercise.Exercise1.Day;

public enum TypeOfDance {
    POGO(Day.MONDAY, Day.FRIDAY, "13:30", "14:30"){
        @Override //konstrukcja z nadpisaniem metody żeby umieścić warość Enum w Enum
        public TypeOfDance alternativeDance() {
            return WALC;}
    },

//    POGO(new Day[]{Day.MONDAY, Day.FRIDAY}, Day.MONDAY, Day.FRIDAY, "13:30", "14:30"){
//        @Override //konstrukcja z nadpisaniem metody żeby umieścić warość Enum w Enum
//        public TypeOfDance alternativeDance() {
//            return WALC;}
//    },
    //pozostałe mają błąd bo trzeb dodać dni w tablicy jak w POGO - nie chciało mi się tego kończyć
    //pozostałe są tak jak napisałem na początku(moja wersja)

    WALC(Day.THURSDAY, Day.FRIDAY, "13:30", "14:30"){
        @Override
        public TypeOfDance alternativeDance() {
            return POGO;                }
    },
    POLKA(Day.WEDNESDAY, Day.TUESDAY, "13:30", "14:30"){
        @Override
        public TypeOfDance alternativeDance() {
            return TANGO;                }
    },
    TANGO(Day.MONDAY, Day.FRIDAY, "13:30", "14:30")
            {
        @Override
        public TypeOfDance alternativeDance() {
            return IRISH;
                }
            },
    IRISH(Day.MONDAY, Day.FRIDAY, "13:30", "14:30")
            {
        @Override
        public TypeOfDance alternativeDance() {
            return POLKA;
                }
            };

    private final String startHourA;
    private final String startHourB;
    private final Enum day1; //żeby pozbyć się warninga trzeba to zapisać w tablicy
    private final Enum day2;
//    private final Day[] days;

    TypeOfDance(Enum day1, Enum day2, String startHourA, String startHourB) {
        this.startHourA = startHourA;
        this.startHourB = startHourB;
        this.day1 = day1;
        this.day2 = day2;
    }

//    TypeOfDance(Day[] days, Enum day1, Enum day2, String startHourA, String startHourB) {
//        this.days = days;
//        this.startHourA = startHourA;
//        this.startHourB = startHourB;
//        this.day1 = day1;
//        this.day2 = day2;
//    }
    public abstract TypeOfDance alternativeDance();

    public String getStartHourA() {
        return startHourA;
    }

    public String getStartHourB() {
        return startHourB;
    }

    public Enum getDay1() {
        return day1;
    }

    public Enum getDay2() {
        return day2;
    }
}
