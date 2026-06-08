/* @author <Yuri Kirkitadze> */

package homework4;

public class Factorial {
    public static void main(String[] args) {
        int month = 5;
        long factorial = 1L;
        for (int i = 1; i <= month; i++) {
            factorial *= i;
        }

        for (int i = 1; i <= month; i++) {
            if (i == 1) System.out.print(month + "! = " + i + " x ");
            else if (i == month) System.out.println(i + " = " + factorial);
            else System.out.print(i + " x ");
        }

    }
}
