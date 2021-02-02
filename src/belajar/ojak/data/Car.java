package belajar.ojak.data;

/**
 * @author Abdul Rozak
 * @since 2/3/21
 */
public interface Car extends HasBrand, IsMaintenance {

    void drive();

    int getTire();

}
