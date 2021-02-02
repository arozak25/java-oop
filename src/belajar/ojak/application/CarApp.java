package belajar.ojak.application;

import belajar.ojak.data.Avanza;
import belajar.ojak.data.Car;

/**
 * @author Abdul Rozak
 * @since 2/3/21
 */
public class CarApp {

    public static void main(String[] args) {

        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
