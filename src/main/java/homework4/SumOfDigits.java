package homework4;

public class SumOfDigits {
    public static void main(String[] args) {
        int birthYear = 1995;
        int temp = birthYear;
        int sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Birth year = " + birthYear);
        System.out.println("Digit sum = " + sum);
    }
}
