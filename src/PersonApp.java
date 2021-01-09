/**
 * @author Abdul Rozak
 * @since 1/9/21
 */
public class PersonApp {

    public static void main(String[] args){

        var person1 = new Person();
        person1.name = "Rozak";
        person1.address = "Bogor";
//        person1.country = "Amerika" //ERROR
        Person person2 = new Person();
        Person person3;
        person3 = new Person();

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
    }
}
