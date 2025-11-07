import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        double principal = 250000;
        double rate = 11.99;
        int years = 3;

        double monthlyRate = rate / (12 * 100);
        int numberOfPayments = years * 12;

        double mortgage = (principal * monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments))
                / (Math.pow(1 + monthlyRate, numberOfPayments) - 1);

        System.out.printf("Monthly Payment = %.2f\n", mortgage);
    }
}
