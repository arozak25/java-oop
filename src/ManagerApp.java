/**
 * @author Abdul Rozak
 * @since 1/15/21
 */
public class ManagerApp {

    public static void main(String[] args){

        var manager = new Manager("Ojak");
        manager.sayHello("Budi");

        var vp = new VicePresident("Ojakun");
        vp.sayHello("Budi");
    }
}
