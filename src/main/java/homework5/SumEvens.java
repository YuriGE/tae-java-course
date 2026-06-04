/* @author <Yuri Kirkitadze> */

package homework5;

public class SumEvens {
    public static void main(String[] args) {
        int myAge = 31;
        System.out.println("Sum of evens from 1 to " + myAge * 2 + " is " + sumEvens(1, myAge * 2));

    }


    public static int sumEvens(int from, int to)
    {
        int sum = 0;
        for (int i = from; i <= to; i++)
        {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /*
    ასე უფრო მარტივი იქნებოდა, IF -ის გარეშე და ერთი პარამეტრით

    public static int sumEvens(int to)
    {
        int sum = 0;
        for (int i=2; i<=to; i+=2)
        {
            sum +=i;
        }
        return sum;
    }

     */
}