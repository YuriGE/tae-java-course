/* @author <Yuri Kirkitadze> */

package homework6;

public class Main {
    public static void main(String[] args) {

        // I დან IV თასქის ჩათვლით საკუთარ ჯავა კლასშივე მაქვს მეინ ფუქნცია, როგორც მაგალითში იყო.

        //მეხუთე თასქის გაშვება
        System.out.println("Task 5");
        System.out.println("Rectangle area = " + new Rectangle(4, 5).area());
        System.out.println("Circle area = " + new Circle(3).area());
        System.out.println(" ");

        //მეექსვე თასქის გაშვება
        System.out.println("Task 6");
        new Car("Toyota", 2020, 4).info();
        System.out.println(" ");

        //მეშვიდე თასქის გაშვება
        System.out.println("Task 7");
        Calculator calc = new Calculator();
        System.out.println(calc.calculator(10,3,'+'));
        System.out.println(calc.calculator(10,0,'/'));//0 ზე გაყოფა
        System.out.println(calc.calculator(7,3,'['));//არასწორი სიმბოლო

    }
}
