package belajar.ojak.data;

/**
 * @author Abdul Rozak
 * @since 2/6/21
 */
public record LoginRequest(String username, String password) {

    public LoginRequest {
        System.out.println("Bikin object LoginRequest");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }

}
