/* @author <Yuri Kirkitadze> */

package homework7;

public class Circle implements Shape {

    private double radius;

    public Circle (double r){
        this.radius = r;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
