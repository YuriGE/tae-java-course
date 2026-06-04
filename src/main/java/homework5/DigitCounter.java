/* @author <Yuri Kirkitadze> */

package homework5;

public class DigitCounter {
    public static void main(String[] args) {

        int myBirthYear = 1995;
        System.out.println("Number " + myBirthYear + " has " + countDigits(myBirthYear) + " digits");

    }

    public static int countDigits(int n) {
        n = Math.abs(n);
        if (n == 0) return 1;
        int counter = 0;
        while (n > 0) {
            n /= 10;
            counter += 1;
        }
        return counter;
    }

}