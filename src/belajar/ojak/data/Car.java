package belajar.ojak.data;

import belajar.ojak.annotation.Fancy;

/**
 * @author Abdul Rozak
 * @since 2/3/21
 */
@Fancy(name = "Car", tags = {"interface", "java"})
public interface Car extends HasBrand, IsMaintenance {

    void drive();

    int getTire();

    default boolean isBig(){
        return false;
    }

}
