package belajar.ojak.application;

import belajar.ojak.data.LoginRequest;

/**
 * @author Abdul Rozak
 * @since 2/6/21
 */
public class RecordApp {

    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("ojak", "rahasia");

        System.out.println(loginRequest);
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("ojakun"));
        System.out.println(new LoginRequest("ojak", "rahasia"));
    }
}
