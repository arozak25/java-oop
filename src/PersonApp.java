/**
 * @author Abdul Rozak
 * @since 1/9/21
 */
public class PersonApp {

    public static void main(String[] args){

        var person1 = new Person("Rozak", "Bogor");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Budi");

        Person person2 = new Person("Kafka", "Jakarta");

        Person person3;
        person3 = new Person("Udin", "Bandung");

        person3.sayHello("Budi");

    }
}
