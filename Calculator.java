package week1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        System.out.println("The sum: " + sum);

        double difference = num1 - num2;
        System.out.println("The difference: " + difference);

        double product = num1 * num2;
        System.out.println("The product: " + product);

        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("The quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero!");
        }
        scanner.close();
    }
}
