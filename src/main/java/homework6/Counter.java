/* @author <Yuri Kirkitadze> */

package homework6;

public class Counter {

    int count, maxValue = 1995;
    //maxValue -ს თუ არ მივანიჭე 0 ზე მეტი მნიშვნელობა სულ 0 დააბრუნებს countTo, რადგან არ შესრულდება increment()

    void increment() {
        if (count < maxValue)
            count++;
    }

    void reset() {
        count = 0;
    }

    void countTo(int target) {
        for (int i = 1; i <= target; i++) {
            increment();
        }
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        c.countTo(5);
        System.out.println(c.count);

    }

}
