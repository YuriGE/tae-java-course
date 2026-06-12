/* @author <Yuri Kirkitadze> */

package homework7;

public class FullTime extends Employee {

    private double monthSalary;

    public FullTime(String name, double monthSalary) {
        super(name);
        this.monthSalary = monthSalary;
    }

    @Override
    public double calculateSalary() {
        return monthSalary;
    }

}
