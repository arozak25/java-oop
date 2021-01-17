package belajar.ojak.application;

import belajar.ojak.data.Product;

/**
 * @author Abdul Rozak
 * @since 1/17/21
 */
public class Application {
    public static void main(String[] args){

        Product product = new Product("Macbook Pro", 30000000);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}
