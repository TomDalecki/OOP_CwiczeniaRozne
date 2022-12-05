package ListySetyMapy.WorkshopProject;

import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShopQueue shopQueue = new ShopQueue();
        boolean appOn = true;
        printMenu();

        while (appOn) {
            String userChoice = scanner.nextLine();
            if (userChoice.contains("ADD")) {
                shopQueue.addToQueue(userChoice);
            } else if (userChoice.contains("PROCESS")) {
                shopQueue.processQueue();
            } else if (userChoice.contains("LEAVE")) {
                shopQueue.removeFromQueue(userChoice);
            } else if (userChoice.contains("EXIT")) {
                appOn = false;
            } else {
                System.out.println("O co Ci chodzi?");
            }
        }
    }

    private static void printMenu() {
        System.out.println("Opcje wyboru:");
        System.out.println("ADD PERSON(Imię_Nazwisko)");
        System.out.println("PROCESS");
        System.out.println("LEAVE PERSON(Imię_Nazwisko_nr)");
        System.out.println("ADD PERSON(Imię_Nazwisko, VIP)");
    }
}
