package ExWeek1;

import java.util.Scanner;

public class Equation {
    public static void LinearEquation(double a, double b) {
        if (a != 0) {
            System.out.println("Equation has 1 root: " + (-b / a));
        }
        if (a == 0) {
            if (b != 0) {
                System.out.println("Equation has no root");
            }
            if (b == 0) {
                System.out.println("Equation has infinite roots");
            }
        }
    }

    public static void LinearSystem(double a1, double b1, double c1, double a2, double b2, double c2) {
        double D = a1 * b2 - a2 * b1;
        double D1 = b1 * c2 - b2 * c1;
        double D2 = a1 * c2 - a2 * c1;
        if (D == 0) {
            if (D1 != 0 || D2 != 0) {
                System.out.println("Equation has no root");
            }
            if (D1 == 0 && D2 == 0) {
                System.out.println("Equation has infinite roots");
            }
        }
        if (D != 0) {
            System.out.println("Root x1:" + (D1 / D));
            System.out.println("Root x2:" + (D2 / D));
        }
    }

    public static void QuadraticEquation(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Equation has no solution");
        }
        if (delta == 0) {
            System.out.println("Equation has double root:" + (-b / (2 * a)));
        }
        if (delta > 0) {
            System.out.println("Equation has two roots");
            System.out.println("x1 = " + ((-b - Math.sqrt(delta)) / (2 * a)));
            System.out.println("x2 = " + ((-b + Math.sqrt(delta)) / (2 * a)));
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select: \n 1.Linear equation \t | \t 2.Linear system \t | \t 3.Quadratic equation");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Enter a, b:");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                LinearEquation(a, b);
                break;
            case 2:
                System.out.println("Enter a1, b1, c1:");
                double a1 = sc.nextDouble();
                double b1 = sc.nextDouble();
                double c1 = sc.nextDouble();
                System.out.println("Enter a2, b2, c2:");
                double a2 = sc.nextDouble();
                double b2 = sc.nextDouble();
                double c2 = sc.nextDouble();
                LinearSystem(a1, b1, c1, a2, b2, c2);
                break;
            case 3:
                System.out.println("Enter a, b, c:");
                double a3 = sc.nextDouble();
                double b3 = sc.nextDouble();
                double c3 = sc.nextDouble();
                QuadraticEquation(a3, b3, c3);
                break;
        }
        sc.close();
    }
}
