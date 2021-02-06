package belajar.ojak.util;

import belajar.ojak.data.LoginRequest;
import belajar.ojak.error.BlankException;
import belajar.ojak.error.ValidationException;

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
}
