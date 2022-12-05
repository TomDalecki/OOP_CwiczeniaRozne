package ListySetyMapy.WorkshopExercises.Exercise3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Invoice> invoiceStack = new ArrayDeque<>();
        int invoiceCounter = 1;
        boolean programOn = true;

        printMenu();

        while (programOn) {
            String userChoice = scanner.nextLine();

            if (userChoice.contains("CEO")) {
                addInvoiceToStack(userChoice, invoiceStack, invoiceCounter);
                invoiceCounter++;
                for (Invoice invoice : invoiceStack) {
                    System.out.println("CEO: ADD invoice " + invoice);
                }
                System.out.println("Invoices sum: " + invoicesSum(invoiceStack));
            } else if (userChoice.contains("ACCOUNTANT")) {
                getInvoiceFromStack(invoiceStack);
                System.out.println("ACCOUNTANT: PROCESS INVOICE");
                System.out.println("Invoices list:");
                for (Invoice invoice : invoiceStack) {
                    System.out.println(invoice);
                }
                System.out.println("Invoices sum: " + invoicesSum(invoiceStack));
            } else if (userChoice.contains("END")) {
                programOn = false;
            } else {
                System.out.println("O co Ci chodzi?");
            }
        }
    }

    private static BigDecimal invoicesSum(Deque<Invoice> invoiceStack) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Invoice invoice : invoiceStack) {
            sum = sum.add(invoice.getAmount());
        }
        return sum;
    }

    private static void getInvoiceFromStack(Deque<Invoice> invoiceStack) {
        invoiceStack.poll();
    }

    private static void addInvoiceToStack(String invoiceData, Deque<Invoice> invoiceStack, int invoiceCounter) {
        int stringLength = invoiceData.length();
        BigDecimal invoiceValue = new BigDecimal(invoiceData.substring(17, stringLength - 1));
        int localDate = LocalDate.now().getYear();
        String invoiceNumber = invoiceCounter + "/" + localDate;
        invoiceStack.push(new Invoice(invoiceNumber, invoiceValue));
    }

    private static void printMenu() {
        System.out.println("Wybierz opcję");
        System.out.println("Jeżeli jesteś CEO wpisz: CEO: ADD INVOICE(kwota faktury) ");
        System.out.println("Jeżeli jesteś ACCOUNTANT wpisz: ACCOUNTANT: PROCESS INVOICE");
        System.out.println("Wpisz END żeby zakończyć program");
    }
}
