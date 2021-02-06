package belajar.ojak.data;

/**
 * @author Abdul Rozak
 * @since 2/6/21
 */
public enum Level {
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private final String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
