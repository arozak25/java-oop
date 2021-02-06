package belajar.ojak.application;

import belajar.ojak.error.DatabaseError;

/**
 * @author Abdul Rozak
 * @since 2/6/21
 */
public class DatabaseApp {

    public static void main(String[] args) {
        connecDatabase(null, null);
        System.out.println("Sukses");
    }

    public static void connecDatabase(String username, String password){
        if (username == null || password == null)
            throw new DatabaseError("gabisa konek database");
    }
}
