/* @author <Yuri Kirkitadze> */

package homework4;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        char grade = 'X';

        if (month < 1 || month > 12) {
            System.out.println("Invalid number");
        }

        sc.close();

        if (month == 12)
            grade = 'A';
        else if (month >= 9 && month <= 11)
            grade = 'B';
        else if (month >= 6 && month <= 8)
            grade = 'c';
        else if (month >= 3 && month <= 5)
            grade = 'A';
        else if (month == 1 || month == 2)
            grade = 'F';

        System.out.println("Birth month = " + month + ", Grade = " + grade);
    }
}
