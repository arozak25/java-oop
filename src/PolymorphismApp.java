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
        sayHello(new Manager("Ojak"));
        sayHello(new VicePresident("Ojak"));
    }

    static void sayHello(Employee employee){
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello Employee " + employee.name);
        }

    }

}
