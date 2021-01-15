/**
 * @author Abdul Rozak
 * @since 1/15/21
 */
class VicePresident extends Manager {

    VicePresident(String name) {
        super(name);
    }

    void sayHello(String name){
        System.out.println("Hello " + name + "!, my name is vp " + this.name);
    }
}
