package belajar.ojak.application;

import belajar.ojak.data.Category;

/**
 * @author Abdul Rozak
 * @since 1/26/21
 */
public class CategoryApp {

    public static void main(String[] args) {

        var category = new Category();
        category.setId("ID");
        category.setId(null);

        System.out.println(category.getId());
        System.out.println(category.isExpensive());

    }
}
