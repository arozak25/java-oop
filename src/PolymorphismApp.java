/**
 * @author Abdul Rozak
 * @since 1/15/21
 */
public class PolymorphismApp {

    public static void main(String[] args){

        Employee employee = new Employee("Ojak");
        employee.sayHello("Budi");

        employee = new Manager("Ojak");
        employee.sayHello("Budi");

        employee = new VicePresident("Ojak");
        employee.sayHello("Budi");

        sayHello(new Employee("Ojak"));
        sayHello(new Manager("Ojak manager"));
        sayHello(new VicePresident("Ojak vp"));
    }

    static void sayHello(Employee employee){
        System.out.println(employee.name);
    }

}
