/* @author <Yuri Kirkitadze> */

package homework7;

public class Rectangle implements Shape {

    private double width, height;

    public Rectangle( double w, double h) {

        this.width = w;
        this.height = h;

    }

    @Override
    public double area() {
        return width * height;
    }

    // Runner.java - დან გაშვება

}