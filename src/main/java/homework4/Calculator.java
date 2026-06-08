/* @author <Yuri Kirkitadze> */

package homework4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double x = scanner.nextDouble();

        System.out.print("Enter number 2: ");
        double y = scanner.nextDouble();

        System.out.print("Enter operation sign (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        System.out.println(" ");

        switch (op) {
            case '+':
                System.out.println(x + " + " + y + " = " + (x + y));
                break;
            case '-':
                System.out.println(x + " - " + y + " = " + (x - y));
                break;
            case '*':
                System.out.println(x + " * " + y + " = " + (x * y));
                break;
            case '/':
                if (y == 0) {
                    System.out.println("Cannot divide by 0");
                } else {
                    System.out.println(x + " / " + y + " = " + (x / y));
                }
                break;
            default:
                System.out.println("Unknown operation");
        }
    }
}
