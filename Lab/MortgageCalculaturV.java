package Lab;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculaturV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Bangladesh Mortgage Calculator (BDT) ===");

        // Get salary
        double salary = 0;
        while (true) {
            System.out.print("Enter your monthly salary (BDT): ");
            if (scanner.hasNextDouble()) {
                salary = scanner.nextDouble();
                break;
            } else {
                System.out.println("Error digit enter numbers only(eg. 123456789).");
                scanner.next();
            }
        }

        // Get credit score
        int creditScore = 0;
        while (true) {
            System.out.print("Enter credit score (0-500): ");
            if (scanner.hasNextInt()) {
                creditScore = scanner.nextInt();
                if (creditScore >= 0 && creditScore <= 500) {
                    break;
                } else {
                    System.out.println("Credit score must be between 0 and 500.");
                }
            } else {
                System.out.println("Invalid input! Please enter numbers only.");
                scanner.next();
            }
        }

        // Get criminal record
        boolean hasCriminalRecord = false;
        while (true) {
            System.out.print("Any criminal record? (true/false): ");
            String input = scanner.next().toLowerCase();
            if (input.equals("true") || input.equals("false")) {
                hasCriminalRecord = Boolean.parseBoolean(input);
                break;
            } else {
                System.out.println("Please enter 'true' or 'false' only.");
            }
        }

        // Check eligibility
        if (creditScore < 300 || hasCriminalRecord) {
            System.out.println("Not eligible for a loan.");
            System.out.println("Needed Credit score >= 300 and with no criminal record");
            scanner.close();
            return;
        }

        // Get loan amount
        double principal = 0;
        while (true) {
            System.out.print("Enter loan amount (Principal in BDT): ");
            if (scanner.hasN
}
