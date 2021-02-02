package belajar.ojak.application;

/**
 * @author Abdul Rozak
 * @since 2/3/21
 */
public class EqualsApp {

    public static void main(String[] args) {

        String first = "Ojak";
        first = first + " " + "kun";

        System.out.println(first);

        String second = "Ojak kun";

        System.out.println(second);
        System.out.println(first == second); //will be false
        System.out.println(first.equals(second)); //will be true

        String third = "Ojak kun";
        System.out.println(second == third); //will be true because java optimization of memory for the same object
        System.out.println(second.equals(third)); //will be true
    }
}
