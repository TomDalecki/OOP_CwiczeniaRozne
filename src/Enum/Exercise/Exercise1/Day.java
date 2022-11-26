package Enum.Exercise.Exercise1;

import Static.Exercises.Exercise1.Global;

public enum Day implements WorkingDay, Weekend{
    MONDAY("MON"),
    TUESDAY("TUE"),
    WEDNESDAY("WED"),
    THURSDAY("THU"),
    FRIDAY("FRI"),
    SATURDAY("SAT"),
    SUNDAY("SUN");

    private String dayOFWeekShort;
    Day(String dayOFWeekShort) {
        this.dayOFWeekShort = dayOFWeekShort;
    }

    public String getDayOFWeekShort() {
        return dayOFWeekShort;
    }

    @Override
    public boolean isWorkingDay() {
        if (dayOFWeekShort.equals("SAT") || dayOFWeekShort.equals("SUN")){ //|| !dayOFWeekShort.equals("SUN")
            return false;
        } else {
            return true;}

    }

    @Override
    public boolean isWeekend() {
        if (dayOFWeekShort.equals("SAT") || dayOFWeekShort.equals("SUN")){
            return true;
        } else {
            return false;}
    }
}
