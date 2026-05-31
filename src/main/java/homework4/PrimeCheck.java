/* @author <Yuri Kirkitadze> */

package homework4;

public class PrimeCheck {
    public static void main(String[] args) {
        int age = 31;
        boolean isPrime = true;

        if (age <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= age / 2; i++) {
                if (age % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("ასაკი = " + age + ", ეს არის მარტივი რიცხვი.");
        } else {
            System.out.println("ასაკი = " + age + ", ეს არ არის მარტივი რიცხვი.");
        }
    }
}

