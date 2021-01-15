/**
 * @author Abdul Rozak
 * @since 1/15/21
 */
public class ManagerApp {

    public static void main(String[] args){

        var manager = new Manager();
        manager.name = "Ojak";
        manager.sayHello("Budi");

        var vp = new VicePresident();
        vp.name = "Ojakun";
        vp.sayHello("Budi");
    }
}
