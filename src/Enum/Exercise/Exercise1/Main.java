package Enum.Exercise.Exercise1;

public class Main {
    public static void main(String[] args) {
        //Day day = Day.SATURDAY;
        Day[] days = Day.values();
        for (Day day : days) {
            System.out.println(day + "(" + day.getDayOFWeekShort() + ")" +
                    " Is working day?: " + day.isWorkingDay() + " Is Weekend?: " + day.isWeekend());
        }
        }




}
