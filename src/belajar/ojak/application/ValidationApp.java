package belajar.ojak.application;

import belajar.ojak.data.LoginRequest;
import belajar.ojak.error.ValidationException;
import belajar.ojak.util.ValidationUtil;

/**
 * @author Abdul Rozak
 * @since 2/6/21
 */
public class ValidationApp {

    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null, null); //null pointer exception
//        LoginRequest loginRequest = new LoginRequest("", ""); //validation exception
//        LoginRequest loginRequest = new LoginRequest("ojak", "rahasia"); //valid data

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Data nggak valid: " + e.getMessage());
        } finally {
            System.out.println("Data berhasil di cek");
        }
    }
}
