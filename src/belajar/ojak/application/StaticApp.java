package belajar.ojak.application;

//static import
import static belajar.ojak.data.Application.PROCESSORS;
import static belajar.ojak.data.Constant.*;
import belajar.ojak.data.Country;
import belajar.ojak.util.MathUtil;

/**
 * @author Abdul Rozak
 * @since 2/6/21
 */
public class StaticApp {

    public static void main(String[] args) {

        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,1,1,1,1,1)
        );

        Country.City city = new Country.City();
        city.setName("Bogor");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
