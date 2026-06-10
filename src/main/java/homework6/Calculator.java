/* @author <Yuri Kirkitadze> */

package homework6;

public class Calculator {

    double calculator(double a, double b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) return Double.NaN; // 0 ზე გაყოფა
                else
                    return a / b;
            default:
                return Double.NaN; //თუ არასწორი სიმბოლო გადეცა
        }

    }
}
