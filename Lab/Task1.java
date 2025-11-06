package Lab;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberofStudent = 3;
        float num1, num2, num3, averageScore;

        System.out.println("Enter  score of student 1:");
        num1 = input.nextFloat();
        System.out.println("Enter score of student 2:");
        num2 = input.nextFloat();
        System.out.println("Enter score of student 3:");
        num3 = input.nextFloat();
        averageScore = (num1 + num2 + num3) / numberofStudent;
        System.out.println("The average score is:" + averageScore);

    }
}
