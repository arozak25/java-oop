package belajar.ojak.application;

import belajar.ojak.data.Customer;
import belajar.ojak.data.Level;

/**
 * @author Abdul Rozak
 * @since 2/6/21
 */
public class EnumApp {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("ojak");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        for (var value: Level.values()){
            System.out.println(value);
        }
    }
}
