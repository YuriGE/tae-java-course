/* @author <Yuri Kirkitadze> */

package homework5;

public class MultiplicationTable {
    public static void main(String[] args) {
        int month = 5;
        printableTable(month);
    }

    static public void printableTable(int n) {
        for (int i = 1; i < 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
