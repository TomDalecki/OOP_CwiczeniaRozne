package Enum.Exercise.Exercise2;

public class DanceSchool {
    public static void main(String[] args) {
//TypeOfDance myFDC = TypeOfDance.POGO;
TypeOfDance[] myFDC2 = TypeOfDance.values();
        //System.out.println(myFDC);
        //System.out.println(myFDC + ": possible hours: " + myFDC.startHourA + ", " + myFDC.startHourB + ", "
         //       + " days: " + myFDC.day1 + ", " + myFDC.day2 + ", " + " alternative: " + myFDC.alternativeDance());

        for (TypeOfDance myFDC : myFDC2) {
            System.out.println(myFDC + ": possible hours: " + myFDC.getStartHourA() + ", " + myFDC.getStartHourB() + ", "
                    + " days: " + myFDC.getDay1() + ", " + myFDC.getDay2() + ", " + " alternative: " + myFDC.alternativeDance());
        }
    }
}
