package belajar.ojak.application;

import belajar.ojak.data.Animal;
import belajar.ojak.data.Cat;

/**
 * @author Abdul Rozak
 * @since 1/17/21
 */
public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "puss";
        animal.run();
    }
}
