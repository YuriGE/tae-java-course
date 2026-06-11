/* @author <Yuri Kirkitadze> */

package homework7;

public class PolymorphismDemo {

    public static void runDemo() {
        Animal[] animals = {
                new Dog("Rex"),
                new Dog("Buddy"),
                new Cat("Mia"),
                new Cat("Fisso")
        };

        for (Animal a : animals) {
            String type = (a instanceof Dog) ? "Dog" : "Cat";
            System.out.print(a.name + " (" + type + "): ");
            a.makeSound();
            a.sleep();
            System.out.println();
        }
    }

}
