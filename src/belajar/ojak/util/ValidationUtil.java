package belajar.ojak.util;

import belajar.ojak.annotation.NotBlank;
import belajar.ojak.data.LoginRequest;
import belajar.ojak.error.BlankException;
import belajar.ojak.error.ValidationException;

import java.lang.reflect.Field;

/**
 * @author Abdul Rozak
 * @since 2/6/21
 */
public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.username() == null)
            throw new NullPointerException("Username tidak boleh null");
        else if (loginRequest.password().isBlank())
            throw new ValidationException("Username tidak boleh blank");
        else if (loginRequest.password() == null)
            throw new NullPointerException("Password tidak boleh null");
        else if (loginRequest.password().isBlank())
            throw new ValidationException("Password tidak boleh blank");
    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null)
            throw new NullPointerException("Username tidak boleh null");
        else if (loginRequest.password().isBlank())
            throw new BlankException("Username tidak boleh blank");
        else if (loginRequest.password() == null)
            throw new NullPointerException("Password tidak boleh null");
        else if (loginRequest.password().isBlank())
            throw new BlankException("Password tidak boleh blank");
    }

    public static void validationReflection(Object object){
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field: fields){
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null) {
                try {
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank())
                        throw new BlankException(field + " tidak boleh blank");
                } catch (IllegalAccessException ex) {
                    System.out.println("gagal mengakses field " + field);
                }
            }
        }
    }
}
