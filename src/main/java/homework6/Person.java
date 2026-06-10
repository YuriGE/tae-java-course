/* @author <Yuri Kirkitadze> */

package homework6;

public class Person {
    private String name;
    private int age;
    private String email;

    Person(String name, int age, String email) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }


    public void introduce() {
        System.out.println("გამარჯობა, მე ვარ " + name + ", " + age + " წლის. ");
    }

    public static void main(String[] args) {
        Person person = new Person("იური კირკიტაძე", 31, "kirkitadze95@gmail.com");
        Person person2 = new Person("ჯონი", 31, "johndoe@gmail.com");

        System.out.println(person.getName());
        person.introduce();

        System.out.println(" ");

        System.out.println(person2.getName());
        person2.introduce();
    }
}
