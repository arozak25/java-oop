package belajar.ojak.application;

import belajar.ojak.data.CreateUserRequest;
import belajar.ojak.util.ValidationUtil;

public class ReflectionApp {

    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        request.setPassword("test");
        request.setUsername("arozak");

        ValidationUtil.validationReflection(request);
    }
}
