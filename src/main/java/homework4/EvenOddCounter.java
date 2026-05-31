/* @author <Yuri Kirkitadze> */

package homework4;

public class EvenOddCounter {
    public static void main(String[] args) {
        int birthYear = 1995;
        int lastTwoDigits = birthYear % 100;
        int countEven = 0;
        int countOdd = 0;

        for (int i = 1; i <= lastTwoDigits; i++) {
            if (i % 2 == 0) countEven++;
            else countOdd++;
        }

        System.out.println("BirthYear lastTwoDigits = " + lastTwoDigits + ". From 1 to this number, there are");
        System.out.println(countEven + " even numbers: ");

        for (int i = 1; i <= lastTwoDigits; i++) {
            if (i % 2 == 0) {
                if (i == 2) System.out.print("(" + i + ",");
                else if (i == lastTwoDigits - 1) System.out.println(i + ")");
                else System.out.print(i + ",");
            }
        }

        System.out.println("and " + countOdd + " odd numbers:");
        for (int i = 1; i <= lastTwoDigits; i++) {
            if (i % 2 == 1) {
                if (i == 1) System.out.print("(" + i + ",");
                else if (i == lastTwoDigits) System.out.println(i + ")");
                else System.out.print(i + ",");
            }
        }
    }
}

