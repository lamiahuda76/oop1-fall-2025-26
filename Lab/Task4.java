package Lab;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enterfirst number(a):");
        int a = input.nextInt();
        System.out.print("Enter second number(b):");
        int b = input.nextInt();
        System.out.println("Before swapping:" + a + ",b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping:a=" + a + ",b=" + b);
    }
}
