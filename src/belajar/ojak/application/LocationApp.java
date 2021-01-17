package belajar.ojak.application;

import belajar.ojak.data.City;
import belajar.ojak.data.Location;

/**
 * @author Abdul Rozak
 * @since 1/17/21
 */
public class LocationApp {
    public static void main(String[] args){

//        var location = new Location(); // ERROR
        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
