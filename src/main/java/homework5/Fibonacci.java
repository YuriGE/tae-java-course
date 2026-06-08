/* @author <Yuri Kirkitadze> */


package homework5;

public class Fibonacci {
    public static void main(String[] args) {

        int n = 25;
        System.out.println(fib(n));

    }

    public static long fib(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;
        long x = 0;
        long y = 1;
        long f = 0;
        for (int i = 2; i <= n; i++) {
            f = x + y;
            x = y;
            y = f;
        }
        return f;
    }


}
