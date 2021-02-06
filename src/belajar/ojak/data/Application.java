package belajar.ojak.data;

/**
 * @author Abdul Rozak
 * @since 2/6/21
 */
public class Application {

    public static final int PROCESSORS;

    static {
        System.out.println("Mengakses class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
