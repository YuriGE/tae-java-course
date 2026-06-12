/* @author <Yuri Kirkitadze> */

package homework7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        //Task 1
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Task 1");
        System.out.println(" ");

        Shape s1 = new Rectangle(4, 5);
        System.out.println(s1.area());

        Shape s2 = new Circle(3);
        System.out.println(s2.area());

        System.out.println("-----------------------------------------------------------------------------------------");


        //Task 2
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Task 2");
        System.out.println(" ");

        Dog d = new Dog("Rex");
        d.makeSound();
        d.sleep();

        Cat c = new Cat("Murka");
        c.makeSound();
        c.sleep();

        System.out.println("-----------------------------------------------------------------------------------------");


        //Task 3
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Task 3");
        System.out.println(" ");

        PolymorphismDemo.runDemo();

        System.out.println("-----------------------------------------------------------------------------------------");

        //Task 4
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Task 4");
        System.out.println(" ");

        Drawable[] shapes = {
                new Square(),
                new Triangle(),
                new Star()
        };
        for (Drawable sh : shapes) {
            sh.draw();
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        //Task 5
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Task 5");
        System.out.println(" ");

        Book b1 = new Book("Martin Eden");
        Book b2 = new Book("Martin_Eden", "Jack London");
        Book b3 = new Book("Martin_Eden", "Jack London", 1995);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println("-----------------------------------------------------------------------------------------");

        //Task 6
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Task 6");
        System.out.println(" ");

        new Car("Toyota").start();
        new Bike("Trek").stop();


        System.out.println("-----------------------------------------------------------------------------------------");

        //Task 7
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Task 7");
        System.out.println(" ");

        Person [] people = {
                new Person("Anna", 25),
                new Person("Beka", 30),
                new Person("Cita", 23),
                new Person("Yuri", 31)
        };

        Arrays.sort(people);

        for (Person p : people){
            System.out.println(p);
        }


        System.out.println("-----------------------------------------------------------------------------------------");

    }

}